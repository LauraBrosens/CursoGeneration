create database db_RH2;
use db_RH2;

create table tb_cargo (
	id bigint auto_increment,
    nome varchar (255) not null,
    depto varchar(255) not null,
    periodo varchar(255) not null,
    primary key (id)
);

insert into tb_cargo (nome, depto, periodo) values ("Vendedor", "Vendas", "Diurno");
insert into tb_cargo (nome, depto, periodo) values ("Vendedor", "Vendas", "Vespertino");
insert into tb_cargo (nome, depto, periodo) values ("Videomaker", "Marketing", "Diurno");
insert into tb_cargo (nome, depto, periodo) values ("Marketing", "Marketing", "Diurno");
insert into tb_cargo (nome, depto, periodo) values ("Faxina", "Manutenção", "Noturno");

select * from tb_cargo;

create table tb_funcionarios(
	id bigint auto_increment,
	nome varchar (255) not null,
    idade int not null,
    salario float not null,
    cargo_id bigint not null,
    ativo boolean,
    primary key (id),
    foreign key (cargo_id) references tb_cargo (id)
);
-- drop table tb_funcionarios;
select * from tb_funcionarios;

insert into tb_funcionarios (nome, idade, salario, cargo_id, ativo) values ("Joaquim", 32, 2100, 1, true);
insert into tb_funcionarios (nome, idade, salario, cargo_id, ativo) values ("Cristóvão", 19, 2100, 1, true);
insert into tb_funcionarios (nome, idade, salario, cargo_id, ativo) values ("Fabrício", 26, 2100, 1, false);
insert into tb_funcionarios (nome, idade, salario, cargo_id, ativo) values ("Amanda", 21, 2200, 2, false);
insert into tb_funcionarios (nome, idade, salario, cargo_id, ativo) values ("Nícolas", 25, 2200, 2, true);
insert into tb_funcionarios (nome, idade, salario, cargo_id, ativo) values ("Raquel", 23, 2200, 2, false);
insert into tb_funcionarios (nome, idade, salario, cargo_id, ativo) values ("Bianca", 24, 2900, 3, true);
insert into tb_funcionarios (nome, idade, salario, cargo_id, ativo) values ("Jacqueline", 41, 3100, 3, false);
insert into tb_funcionarios (nome, idade, salario, cargo_id, ativo) values ("Ricardo", 52, 3300, 4, true);
insert into tb_funcionarios (nome, idade, salario, cargo_id, ativo) values ("Michelle", 43, 3300, 4, false);
insert into tb_funcionarios (nome, idade, salario, cargo_id, ativo) values ("Kelly", 37, 1250, 5, true);
insert into tb_funcionarios (nome, idade, salario, cargo_id, ativo) values ("Miguel", 37, 1250, 5, true);
insert into tb_funcionarios (nome, idade, salario, cargo_id, ativo) values ("Penélope", 36, 2100, 1, false);
insert into tb_funcionarios (nome, idade, salario, cargo_id, ativo) values ("Ygor", 17, 2100, 1, true);
insert into tb_funcionarios (nome, idade, salario, cargo_id, ativo) values ("Erick", 22, 2200, 2, true);

select * from tb_funcionarios 
	where salario > 2000;
select * from tb_funcionarios 
	where salario < 2000 and salario > 1000;
    
select * from tb_funcionarios where nome like "%c%";