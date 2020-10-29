create database db_funcionarios_rh;
use db_funcionarios_rh;

create table tb_funcionarios(
	id bigint auto_increment,
    nome varchar (255) not null,
    salario float not null,
    departamento varchar (255) not null,
    contratacao date not null,
    demissao date,
    primary key (id)
);
drop table tb_funcionarios;

insert into tb_funcionarios (nome, salario, departamento, contratacao) Values ("Flávia Assunção", 1590.75, "Vendas", "2004-12-17");
insert into tb_funcionarios (nome, salario, departamento, contratacao) Values ("José Carlos", 1590.75, "Vendas", "2009-04-05");
insert into tb_funcionarios (nome, salario, departamento, contratacao, demissao) Values ("Luísa Rocher", 3100.00, "RH", "2012-09-04", "2018-11-07");
insert into tb_funcionarios (nome, salario, departamento, contratacao, demissao) Values ("Fernando Gibraltar", 1590.75, "Vendas", "2011-07-03", "2020-05-15");
insert into tb_funcionarios (nome, salario, departamento, contratacao) Values ("Patrícia Pacheco", 2430.00, "Marketing", "1991-04-29");

select * from tb_funcionarios;
select * from tb_funcionarios where salario > 2000;
select * from tb_funcionarios where salario < 2000;

update tb_funcionarios 
	set demissao = "2020-10-28"
    where id = 2;