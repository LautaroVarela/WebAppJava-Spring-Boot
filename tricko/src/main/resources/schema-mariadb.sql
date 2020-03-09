drop table if exists obras;
drop table if exists venta_online;

create table obras (
id int primary key auto_increment,
nombre varchar(200) not null,
descripcion varchar(longtext),
imagen_url varchar(500)
);

insert into obras
(id, nombre, descripcion, imagen_url) values
(1, 'Clowns', 'Collage manual con rostros, editado con Photoshop', 'images/01.jpg' ),
(2, 'Hands 02', 'Collage manual compuesto, editado con Photoshop', 'images/03.jpg' ),
(3, 'Monstruos', 'Collage manual y retocado gráfico con Photoshop', 'images/07.jpg' ),
(4, 'Miedo', 'Collage manual y retocado gráfico con Photoshop', 'images/08.jpg' ),
(5, 'Nosferatu a', 'Poster A1 inspirado en "Nosferatu" y aplicado en una campaña ficticia de teatro', 'images/09.jpg' ),
(6, 'Nosferatu b', 'Poster A2 inspirado en "Nosferatu" y aplicado en una campaña ficticia de teatro', 'images/10.jpg' );

create table venta_online (
    id int primary key auto_increment,
    nombre varchar(200) not null,
    sitio_web varchar(500)
);

insert into venta_online 
(id, nombre, sitio_web) values
(1, 'Creary', 'creary.net'),
(2, 'Devian Art', 'devianart.com'),
(3, 'Red Bubble', 'redbubble.com');

alter table obras
add column venta_online_id int,
add foreign key (venta_online_id) references venta_online(id);

update obras set venta_online_id = 1 where id in (1, 3);
update obras set venta_online_id = 2 where id in (4, 5);
update obras set venta_online_id = 3 where id in (2, 6);

alter table obras
modify venta_online_id int not null;