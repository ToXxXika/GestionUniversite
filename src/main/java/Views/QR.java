package Views;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamResolution;
import com.google.zxing.*;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;


import javax.swing.*;
import java.awt.*;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class QR extends javax.swing.JFrame implements Runnable, ThreadFactory {
    private WebcamPanel panel = null ;
    private Webcam webcam = null ;
    private Executor executor = Executors.newSingleThreadExecutor(this);



    public void initWebcam(){
        Dimension size = WebcamResolution.QVGA.getSize();
        webcam = Webcam.getWebcams().get(0);
        webcam.setViewSize(size);
        panel = new WebcamPanel(webcam);
        panel.setPreferredSize(size);
        panel.setFPSDisplayed(true);
        JPanel container = new JPanel();
        executor.execute(this);
        container.add(panel, BorderLayout.CENTER);
        JFrame frame = new JFrame("Webcam");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(container);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);

    }

    @Override
    public void run() {
         do{
             try {
                 Thread.sleep(100);
             }catch (InterruptedException ex){
                 System.out.println(ex.getMessage());
             }
             Result result = null ;
             BufferedImage image = null ;
             if(webcam.isOpen()){
                 if((image = webcam.getImage()) == null){
                     continue;
                 }
             }
             LuminanceSource source = new BufferedImageLuminanceSource(image);
             BinaryBitmap bitmap = new BinaryBitmap(new com.google.zxing.common.HybridBinarizer(source));
             try {
                 result = new MultiFormatReader().decode(bitmap);
             } catch (NotFoundException e) {
                 e.printStackTrace();
             }
             if(result != null){
                 System.out.println(result.getText());
             }
         }while (true);
    }

    @Override
    public Thread newThread(Runnable r) {
        Thread t =  new Thread(r,"My Thread");
        t.setDaemon(true);
        return t;
    }
}
