create database db_cidade_das_carnes;
use db_cidade_das_carnes;

create table tb_categoria (
	id bigint auto_increment,
    categoria varchar (255),
    refrigerado boolean not null,
	ativo boolean not null,
	primary key (id)
);

create table tb_produtos(
	id bigint auto_increment,
    nome varchar(255) not null,
    preco float not null,
    qtidade int not null,
    categoria_id bigint not null,
    primary key(id),
    foreign key(categoria_id) references tb_categoria(id)
);

-- popular categorias
insert into tb_categoria (categoria, refrigerado, ativo) value ("Carne de Vaca", true, true);
insert into tb_categoria (categoria, refrigerado, ativo) value ("Carne de Frango", true, true);
insert into tb_categoria (categoria, refrigerado, ativo) value ("Carne de Porco", true, true);
insert into tb_categoria (categoria, refrigerado, ativo) value ("Carne de Peixe", true, false);
insert into tb_categoria (categoria, refrigerado, ativo) value ("Acompanhamentos", false, true);

select * from tb_categoria;
drop table tb_produtos;
drop table tb_categoria;

-- popular produtos
insert into tb_produtos (nome, preco, qtidade, categoria_id) value ("Picanha", 59.90, 3, 1);
insert into tb_produtos (nome, preco, qtidade, categoria_id) value ("Contra-Filé", 29.90, 10, 1);
insert into tb_produtos (nome, preco, qtidade, categoria_id) value ("Sobrecoxa", 12.90, 20, 2);
insert into tb_produtos (nome, preco, qtidade, categoria_id) value ("Bacon", 19.90, 30, 3);
insert into tb_produtos (nome, preco, qtidade, categoria_id) value ("Lombo", 21.90, 5, 3);
insert into tb_produtos (nome, preco, qtidade, categoria_id) value ("St. Peters", 72.90, 0, 4);
insert into tb_produtos (nome, preco, qtidade, categoria_id) value ("Farofa", 5.99, 6, 5);

select * from tb_produtos;
select * from tb_produtos
	where preco > 50;
select * from tb_produtos
	where preco between 3 and 60;
select * from tb_produtos where nome like "%co%";

select tb_produtos.nome, tb_produtos.preco, tb_categoria.categoria
	from tb_produtos
		inner join tb_categoria 
        on tb_categoria.id = tb_produtos.categoria_id;
        
select tb_produtos.nome, tb_produtos.preco, tb_categoria.categoria
	from tb_produtos
		inner join tb_categoria 
        on tb_categoria.id = tb_produtos.categoria_id
			where tb_categoria.id = 1;