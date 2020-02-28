create table obras (
id int primary key auto_increment,
nombre varchar(200) not null,
descripcion varchar(3000),
imagen_url varchar(500)
);

insert into obras
(nombre, descripcion, imagen_url) values
('Clowns', 'Collage manual con rostros, editado con Photoshop', 'images/01.jpg' ),
('Hands 02', 'Collage manual compuesto, editado con Photoshop', 'images/03.jpg' ),
('Monstruos', 'Collage manual y retocado gráfico con Photoshop', 'images/07.jpg' ),
('Miedo', 'Collage manual y retocado gráfico con Photoshop', 'images/08.jpg' );

