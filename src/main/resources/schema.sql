drop table user if exists;
create table user (
  id bigint generated by DEFAULT as IDENTITY, --h2的语法，自增主键
  username VARCHAR(40),
  name VARCHAR(20),
  age int(3),
  balance DECIMAL(10,2),
  primary key(id)
);