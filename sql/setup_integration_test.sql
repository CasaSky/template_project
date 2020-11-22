create role template_user with login password 'G1E:bVwy|x12Z-=o';

create database template_db_it owner template_user;

set role template_user;

create table example (
    id bigserial,
    name text collate "C" not null,
    creation_time timestamptz not null,
    primary key (id)
);