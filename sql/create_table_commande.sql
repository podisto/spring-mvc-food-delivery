create table commandes (
        id integer not null auto_increment,
        paye bit,
        addresse varchar(255),
        date_creation datetime(6),
        livre bit,
        nom varchar(255),
        plat varchar(255),
        prenom varchar(255),
        prix integer,
        qte integer,
        telephone varchar(9) not null,
        total integer not null,
        primary key (id)
    ) engine=InnoDB