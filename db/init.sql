create table hospitals
(
    id            bigserial primary key,
    hospital_name varchar(255) not null,
    city          varchar(255) not null
)

create table departments
(
    id              bigserial primary key,
    department_name varchar(255) not null
)

create table doctors
(
    id            bigserial primary key,
    doctor_name   varchar(255) not null,
    surname       varchar(255) not null,
    id_department bigint       not null,
    id_hospital   bigint       not null,
    constraint fk_doctor_department foreign key (id_department) references departments (id),
    constraint fk_doctor_hospital foreign key (id_hospital) references hospitals (id)
)





insert into departments (department_name) VALUES
                                            ('Cardiology'),
                                            ('Neurology'),
                                            ('Radiology'),
                                            ('Orthopedics'),
                                            ('Radiology'),
                                            ('Hematology');


insert into hospitals (hospital_name, city) VALUES
                                             ('Drzavna', 'Skopje'),
                                             ('8-mi Septemvri', 'Skopje'),
                                             ('Gradska Stip', 'Stip'),
                                             ('Gradska Prilep', 'Prilep'),
                                             ('Zan Mitrev', 'Strumica');



