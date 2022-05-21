import Controllers.UserController;
import Database.DbConnection;
import Models.Personne;
import Views.QR;

import com.github.sarxos.webcam.Webcam;
import javafx.stage.Stage;
import org.bytedeco.javacv.*;
import org.bytedeco.opencv.global.opencv_imgcodecs;
import org.bytedeco.opencv.opencv_core.IplImage;

import javax.swing.*;

public class mainC {
    public static void main(String[] args) throws FrameGrabber.Exception {
     //   UserController userController = new UserController();
        //Test if login function works
       // userController.ConnectusingQR();
      /*  FrameGrabber grabber = new OpenCVFrameGrabber(0);
        grabber.start();
        Stage stage = new Stage();

        Frame frame = grabber.grab();
        OpenCVFrameConverter.ToIplImage converter = new OpenCVFrameConverter.ToIplImage();
        IplImage img = converter.convert(frame);
        //opencv_imgcodecs.haveImageReader("")

        opencv_imgcodecs.cvSaveImage("selfie.jpg", img);
        CanvasFrame canvasFrame = new CanvasFrame("Webcam");
        canvasFrame.showImage(frame);*/
    /*    UserController Uc = new UserController();
        Personne P = new Personne("07220650","Mohamed","Bouhlel","ikasou.666@gmail.com","123456","Etudiant");
        Uc.SignIn(P,125,125);
        QR qr = new QR();
        qr.initWebcam();*/

     }
}
