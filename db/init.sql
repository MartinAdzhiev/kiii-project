create table hospitals
(
    id            bigint primary key,
    hospital_name varchar(255) not null,
    city          varchar(255) not null
)

create table departments
(
    id              bigint primary key,
    department_name varchar(255) not null
)

create table doctors
(
    id            bigint primary key,
    doctor_name   varchar(255) not null,
    surname       varchar(255) not null,
    id_department bigint       not null,
    id_hospital   bigint       not null,
    constraint fk_doctor_department foreign key (id_department) references departments (id),
    constraint fk_doctor_hospital foreign key (id_hospital) references hospitals (id)
)