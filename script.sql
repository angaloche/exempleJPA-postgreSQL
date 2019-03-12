create table customer
(
  name varchar,
  age  integer,
  id   serial not null
    constraint customer_pk
      primary key
);




