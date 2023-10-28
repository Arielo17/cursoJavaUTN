create database clase12;
use clase12;

drop table departamento;
drop table empleado;
create table departamento(
	id int not null auto_increment,
    nombre varchar(20) not null,
    presupuesto real,
    primary key (id)
);

create table empleado(
	dni bigint not null,
    nombre varchar(20) not null,
    apellido varchar(20) not null,
    nacionalidad varchar(20),
    departamento_id int not null,
    primary key (dni),
    foreign key (departamento_id) references departamento(id)
);

insert into departamento(nombre, presupuesto)
value("Logística", 181864.14);
insert into departamento(nombre, presupuesto)
value("Sistemas", 4864818.38);
insert into departamento(nombre, presupuesto)
value("Compras", 4863186.25);
insert into departamento(nombre, presupuesto)
value("Administración", 1613776.28);

insert into empleado(dni, nombre, apellido, nacionalidad, departamento_id)
value(3658792442, "Juan", "Perez", "Argentino", 1);
insert into empleado(dni, nombre, apellido, nacionalidad, departamento_id)
value(2558575495, "José", "Gomez", "Argentino", 2);
insert into empleado(dni, nombre, apellido, nacionalidad, departamento_id)
value(2984292355, "Caetano", "Beloso", "Brasil", 1);

update empleado set nacionalidad = "Portugués" where dni = 2984292355;

delete from departamento where id=3;

select e.* from empleado e left join departamento d on e.departamento_id = d.id where d.nombre = "Logística";

select * from departamento d order by d.nombre asc;