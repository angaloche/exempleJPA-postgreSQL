create database postgres
  with owner i840077;

comment on database postgres is 'default administrative connection database';

create sequence customer_id_seq;

alter sequence customer_id_seq owner to i840077;

create table customer
(
  name varchar,
  age  integer,
  id   serial not null
    constraint customer_pk
      primary key
);

alter table customer
  owner to i840077;


