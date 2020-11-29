create role template_user with login password 'G1E:bVwy|x12Z-=o';

create user template_user with password 'G1E:bVwy|x12Z-=o' role postgres;

create database template_db owner template_user;

set role template_user;


create table earthling
(
    id        bigserial,
    name      text collate "C" not null,
    born_time timestamptz      not null,
    primary key (id)
);


create table marsianer
(
    id        bigserial,
    name      text collate "C" not null,
    born_time timestamptz      not null,
    primary key (id)
);