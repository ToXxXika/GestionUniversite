create or replace table login
(
    mail     varchar(30) null,
    password varchar(30) null,
    id       int auto_increment
        primary key
)
    auto_increment = 11;

create or replace table matiere
(
    idMat   int auto_increment
        primary key,
    nomMat  varchar(255) null,
    coefMat int          null
);

create or replace table moyennelog
(
    NumInsc int          null,
    Nom     varchar(255) not null,
    Prenom  varchar(255) not null,
    Matiere varchar(255) not null,
    Moyenne float        not null
);

create or replace table personne
(
    cin      varchar(8)   not null
        primary key,
    prenom   varchar(50)  null,
    mail     varchar(50)  null,
    nom      varchar(50)  null,
    password varchar(50)  not null,
    Role     varchar(255) not null
);

create or replace table enseignant
(
    cin  varchar(8) null,
    cnss int        null,
    constraint enseignant_personne_cin_fk
        foreign key (cin) references personne (cin)
);

create or replace table etudiant
(
    cin     varchar(8) null,
    numinsc int        null,
    constraint etudiant_personne_cin_fk
        foreign key (cin) references personne (cin)
);

create or replace table absences
(
    idAbs   int auto_increment
        primary key,
    CinE    varchar(8) null,
    Matiere int        null,
    nbrAbs  int        null,
    constraint Absences_etudiant_cin_fk
        foreign key (CinE) references etudiant (cin),
    constraint Absences_matiere_idMat_fk
        foreign key (Matiere) references matiere (idMat)
);

create or replace table groupe
(
    nomgrp varchar(255) not null,
    id     int auto_increment
        primary key,
    codeE  varchar(8)   null,
    constraint groupe_personne_cin_fk
        foreign key (codeE) references personne (cin)
);

create or replace table notes
(
    matiere int          null,
    typeN   varchar(30)  null,
    idnote  int auto_increment
        primary key,
    cinE    varchar(255) not null,
    note    float        not null,
    constraint notes_etudiant_cin_fk
        foreign key (cinE) references etudiant (cin),
    constraint notes_matiere_idMat_fk
        foreign key (matiere) references matiere (idMat)
)
    auto_increment = 5;


