create database cadastro;
use cadastro;
create table Contacts(
	id int not null auto_increment primary key,
    dataCadastro date,
    nome varchar(120),
    enderecoEmail varchar(320)
    )
