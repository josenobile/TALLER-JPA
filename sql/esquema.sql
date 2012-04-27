CREATE TABLE autores ( 
	id_autor varchar(15) NOT NULL,
	nombre_completo varchar(150),
	id_libro varchar(15)
);

CREATE TABLE libro ( 
	id_libro varchar(15) NOT NULL,
	titulo varchar(250),
	subtitulo varchar(200)
);

CREATE TABLE prestamo ( 
	id_prestamo varchar(15) NOT NULL,
	id_libro varchar(15),
	id_usuario varchar(15),
	fecha_prestamo timestamp,
	fecha_devolucion timestamp
);

CREATE TABLE usuario ( 
	id_usuario varchar(15) NOT NULL,
	tipo_documento varchar(50),
	num_documento varchar(15),
	nombre_completo varchar(100),
	e_mail varchar(50),
	direccion_residencia varchar(200),
	telefono varchar(15),
	celular varchar(15)
);


ALTER TABLE autores ADD CONSTRAINT PK_autores 
	PRIMARY KEY (id_autor);


ALTER TABLE libro ADD CONSTRAINT PK_libro 
	PRIMARY KEY (id_libro);


ALTER TABLE prestamo ADD CONSTRAINT PK_prestamo 
	PRIMARY KEY (id_prestamo);


ALTER TABLE usuario ADD CONSTRAINT PK_usuario 
	PRIMARY KEY (id_usuario);




ALTER TABLE autores ADD CONSTRAINT FK_autores_libro 
	FOREIGN KEY (id_libro) REFERENCES libro (id_libro)
ON DELETE CASCADE ON UPDATE CASCADE;

ALTER TABLE prestamo ADD CONSTRAINT FK_prestamo_libro 
	FOREIGN KEY (id_libro) REFERENCES libro (id_libro)
ON DELETE CASCADE ON UPDATE CASCADE;

ALTER TABLE prestamo ADD CONSTRAINT FK_prestamo_usuario 
	FOREIGN KEY (id_usuario) REFERENCES usuario (id_usuario)
ON DELETE CASCADE ON UPDATE CASCADE;






INSERT INTO libro (id_libro, titulo, subtitulo) VALUES ('2001', 'Problemas de probabilidad', 'ninguno');
INSERT INTO libro (id_libro, titulo, subtitulo) VALUES ('2002', 'Los usos de la argumentacion', 'ninguno');
INSERT INTO libro (id_libro, titulo, subtitulo) VALUES ('2004', 'Fundamentos de probabilidad. - 2 ed.', 'ninguno');
INSERT INTO libro (id_libro, titulo, subtitulo) VALUES ('2005', 'Probabilidad y estadistica', 'ninguno');
INSERT INTO libro (id_libro, titulo, subtitulo) VALUES ('2006', 'Ecuaciones Diferenciales', 'un enfoque diferente');
INSERT INTO libro (id_libro, titulo, subtitulo) VALUES ('2007', 'Algebra lineal con aplicaciones', 'para ingenieria');
INSERT INTO libro (id_libro, titulo, subtitulo) VALUES ('2008', 'Fundamentos de Bases de datos', 'ninguno');
INSERT INTO libro (id_libro, titulo, subtitulo) VALUES ('2009', 'Algoritmos Computacionales', 'solucion de problemas');
INSERT INTO libro (id_libro, titulo, subtitulo) VALUES ('2010', 'Graficos por computadora con OpenGL', 'con aplicaciones');
INSERT INTO libro (id_libro, titulo, subtitulo) VALUES ('2011', 'Bioestadistica', 'ninguno');
INSERT INTO libro (id_libro, titulo, subtitulo) VALUES ('2012', 'Noticia de un secuestro', 'ninguno');
INSERT INTO libro (id_libro, titulo, subtitulo) VALUES ('2013', 'La vuelta el mundo en 80 dias', 'ninguno');
INSERT INTO libro (id_libro, titulo, subtitulo) VALUES ('2014', 'el niño y el mar', 'ninguno');
INSERT INTO libro (id_libro, titulo, subtitulo) VALUES ('2015', 'fisica I', 'ninguno');
INSERT INTO libro (id_libro, titulo, subtitulo) VALUES ('2016', 'fisica universitaria', 'ninguno');
INSERT INTO libro (id_libro, titulo, subtitulo) VALUES ('2017', 'calculo I', 'ninguno');
INSERT INTO libro (id_libro, titulo, subtitulo) VALUES ('2018', 'calculo', 'multivariado');



INSERT INTO autores (id_autor, nombre_completo, id_libro) VALUES ('1001', 'Paul L. Meyer', '2001');
INSERT INTO autores (id_autor, nombre_completo, id_libro) VALUES ('1005', 'Francisco Javier Martin', '2001');
INSERT INTO autores (id_autor, nombre_completo, id_libro) VALUES ('1006', 'Luis Ruiz Maya', '2001');
INSERT INTO autores (id_autor, nombre_completo, id_libro) VALUES ('1007', 'Michael Evans', '2005');
INSERT INTO autores (id_autor, nombre_completo, id_libro) VALUES ('1008', 'Jeffrey Rosenthal', '2005');
INSERT INTO autores (id_autor, nombre_completo, id_libro) VALUES ('1009', 'Denis Zill', '2006');
INSERT INTO autores (id_autor, nombre_completo, id_libro) VALUES ('1010', 'George Nackos', '2007');
INSERT INTO autores (id_autor, nombre_completo, id_libro) VALUES ('1011', 'Federick Stward', '2008');
INSERT INTO autores (id_autor, nombre_completo, id_libro) VALUES ('1012', 'Donald Hearn', '2010');
INSERT INTO autores (id_autor, nombre_completo, id_libro) VALUES ('1013', 'Pauline Baker', '2010');
INSERT INTO autores (id_autor, nombre_completo, id_libro) VALUES ('1014', 'Alfredo de Jesus Celis', '2011');
INSERT INTO autores (id_autor, nombre_completo, id_libro) VALUES ('1015', 'Kelly Zapata', '2011');
INSERT INTO autores (id_autor, nombre_completo, id_libro) VALUES ('1003', 'Jorge Humberto Romo', '2014');
INSERT INTO autores (id_autor, nombre_completo, id_libro) VALUES ('1002', 'Jay Debore', '2014');
INSERT INTO autores (id_autor, nombre_completo, id_libro) VALUES ('1016', 'Julio Verne', '2013');
INSERT INTO autores (id_autor, nombre_completo, id_libro) VALUES ('1017', 'Gabriel Garcia Marquez', '2012');
INSERT INTO autores (id_autor, nombre_completo, id_libro) VALUES ('1018', 'martin hegels', '2014');
INSERT INTO autores (id_autor, nombre_completo, id_libro) VALUES ('1019', 'Michael Bolton', '2015');
INSERT INTO autores (id_autor, nombre_completo, id_libro) VALUES ('1020', 'Gabriela Mistral', '2015');
INSERT INTO autores (id_autor, nombre_completo, id_libro) VALUES ('1023', 'Sears Zemanski', '2016');
INSERT INTO autores (id_autor, nombre_completo, id_libro) VALUES ('1024', 'Edgar Stward', '2017');
INSERT INTO autores (id_autor, nombre_completo, id_libro) VALUES ('1025', 'Larson Hostler', '2017');
INSERT INTO autores (id_autor, nombre_completo, id_libro) VALUES ('1026', 'Deniz Zill', '2018');


INSERT INTO usuario (id_usuario, tipo_documento, num_documento, nombre_completo, e_mail, direccion_residencia, telefono, celular) VALUES ('0910023', 'CEDULA', '34203560', 'KELLY MARCELA PINEDA', 'kpineda@correounivalle.edu.co', 'calle 10 #13f-25', '3302025', '3206112031');
INSERT INTO usuario (id_usuario, tipo_documento, num_documento, nombre_completo, e_mail, direccion_residencia, telefono, celular) VALUES ('0874230', 'CEDULA', '10223120', 'FERNANDO MEDINA FIGUEROA', 'mefi@correounivalle.edu.co', 'calle 25 #10a-20', '5532035', '3185205645');
INSERT INTO usuario (id_usuario, tipo_documento, num_documento, nombre_completo, e_mail, direccion_residencia, telefono, celular) VALUES ('0856234', 'CEDULA', '550100489', 'JHON MILLER BARRIOS', 'jmin@correounivalle.edu.co', 'calle 15 #3a-45', '6602123', '3174501214');
INSERT INTO usuario (id_usuario, tipo_documento, num_documento, nombre_completo, e_mail, direccion_residencia, telefono, celular) VALUES ('1039359', 'TARJETA DE IDENTIDAD', '34550210', 'HANDER FERNANDO CORDOBA', 'hfer@correounivalle.edu.co', 'calle 26 #4a-10', '6657023', '3012215428');
INSERT INTO usuario (id_usuario, tipo_documento, num_documento, nombre_completo, e_mail, direccion_residencia, telefono, celular) VALUES ('0758972', 'CEDULA', '10580900', 'GERMAN CORREA', 'correa@correounivalle.edu.co', 'calle 12 #9-31', '5561089', '3114506981');
INSERT INTO usuario (id_usuario, tipo_documento, num_documento, nombre_completo, e_mail, direccion_residencia, telefono, celular) VALUES ('0545063', 'CEDULA', '34590203', 'PEDRO ANTONIO GUTIERREZ', 'guti@correounivalle.edu.co', 'calle 10 #4-89', '8708090', '3128437012');
INSERT INTO usuario (id_usuario, tipo_documento, num_documento, nombre_completo, e_mail, direccion_residencia, telefono, celular) VALUES ('0120010', 'CEDULA', '45178123', 'MARTHA CECILIA URRUTIA', 'macu@correounivalle.edu.co', 'calle 56 #16-45', '6603020', '3136485623');
INSERT INTO usuario (id_usuario, tipo_documento, num_documento, nombre_completo, e_mail, direccion_residencia, telefono, celular) VALUES ('1190215', 'CEDULA', '27890230', 'GERMAN HUMBERTO', 'huco@correounivalle.edu.co', 'calle 41 #45-80', '6601546', '3185502360');
INSERT INTO usuario (id_usuario, tipo_documento, num_documento, nombre_completo, e_mail, direccion_residencia, telefono, celular) VALUES ('0625010', 'CEDULA', '550100489', 'JHON WALTER BARROS', 'jmin@correounivalle.edu.co', 'calle 15 #3a-45', '6602123', '3174501214');
INSERT INTO usuario (id_usuario, tipo_documento, num_documento, nombre_completo, e_mail, direccion_residencia, telefono, celular) VALUES ('0515918', 'CEDULA', '550100489', 'JHON JAIRO SAPE', 'jmin@correounivalle.edu.co', 'calle 15 #3a-45', '6602123', '3174501214');




INSERT INTO prestamo (id_prestamo, id_libro, id_usuario, fecha_prestamo, fecha_devolucion) VALUES ('P-1001', '2001', '0120010', '2012-02-01 00:00:00', '2012-02-15 00:00:00');
INSERT INTO prestamo (id_prestamo, id_libro, id_usuario, fecha_prestamo, fecha_devolucion) VALUES ('P-1002', '2002', '0120010', '2012-02-01 00:00:00', '2012-02-15 00:00:00');
INSERT INTO prestamo (id_prestamo, id_libro, id_usuario, fecha_prestamo, fecha_devolucion) VALUES ('P-1004', '2006', '0758972', '2012-02-22 00:00:00', '2012-02-27 00:00:00');
INSERT INTO prestamo (id_prestamo, id_libro, id_usuario, fecha_prestamo, fecha_devolucion) VALUES ('P-1005', '2007', '0758972', '2012-02-22 00:00:00', '2012-02-27 00:00:00');
INSERT INTO prestamo (id_prestamo, id_libro, id_usuario, fecha_prestamo, fecha_devolucion) VALUES ('P-1006', '2011', '0874230', '2012-01-20 00:00:00', '2012-01-27 00:00:00');
INSERT INTO prestamo (id_prestamo, id_libro, id_usuario, fecha_prestamo, fecha_devolucion) VALUES ('P-1007', '2010', '1039359', '2012-01-22 00:00:00', '2012-01-27 00:00:00');
INSERT INTO prestamo (id_prestamo, id_libro, id_usuario, fecha_prestamo, fecha_devolucion) VALUES ('P-1008', '2005', '1190215', '2012-03-03 00:00:00', '2012-03-07 00:00:00');
INSERT INTO prestamo (id_prestamo, id_libro, id_usuario, fecha_prestamo, fecha_devolucion) VALUES ('P-1009', '2009', '1039359', '2012-03-05 00:00:00', '2012-03-09 00:00:00');
INSERT INTO prestamo (id_prestamo, id_libro, id_usuario, fecha_prestamo, fecha_devolucion) VALUES ('P-1010', '2007', '0625010', '2012-03-01 00:00:00', '2012-03-05 00:00:00');
INSERT INTO prestamo (id_prestamo, id_libro, id_usuario, fecha_prestamo, fecha_devolucion) VALUES ('P-1003', '2009', '0758972', '2012-02-10 00:00:00', '2012-02-15 00:00:00');


