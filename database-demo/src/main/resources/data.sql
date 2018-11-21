-- Keep commented when running JPA app
--create table person
--(
--    id integer not null,
--    name varchar(255) not null,
--    location varchar(255),
--    birth_date timestamp,
--    primary key(id)
--);

insert into person(id, name, location, birth_date)
values(10001, 'Dani', 'Madrid', sysdate());

insert into person(id, name, location, birth_date)
values(10002, 'Grace', 'Madrid', sysdate());

insert into person(id, name, location, birth_date)
values(10003, 'Isidora', 'Madrid', sysdate());