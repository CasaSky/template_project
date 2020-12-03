create role template_user with login password 'ENCRYPTED!';

create database template_db_it owner template_user;
