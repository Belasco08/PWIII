create table Curso(
id Bigint not null primary key auto_increment,
nomecurso varchar(100),
dataCadastro datetime,
dataAtualizacao datetime);

create table Aluno(
id Bigint not null primary key auto_increment,
nome varchar(100),
curso_id bigint not null,
dataCadastro datetime,
dataAtualizacao datetime);