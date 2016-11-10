create database challenge;

drop table tbl_cards;

create table tbl_cards (
  id integer,
  card_number varchar(60),
  identity_card integer,
  type varchar(60),
  debt double,
  total_amount double,
  delay_days integer
);
