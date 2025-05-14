Create table tb_cozinhas{
    id bigint not null auto_increment,
    nome_cozinha varchar(70),

    primary key (id)
} engine=InnoDB default charset=utf8;

Create table tb_forma_pagamento{
    id bigint not null auto_increment,
    descricao varchar(255);
}

Create table tb_estados{
    id bigint not null auto_increment,
    nome varchar(100);
}

Create table tb_restaurantes{
    id bigint not null auto_increment,
    nome varchar(100),
    taxa_frete decimal,
    foreign key (cozinha_id) references Cozinha (id);
}