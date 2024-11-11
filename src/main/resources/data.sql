CREATE TABLE USERS(
ID INTEGER PRIMARY KEY AUTO_INCREMENT,
NAME VARCHAR(255) NOT NULL,
EMAIL VARCHAR(255) NOT NULL,
PASSWORD VARCHAR(255) NOT NULL,
CPF_CNPJ VARCHAR(255) NOT NULL
);
CREATE TABLE PRODUCTS(
ID INTEGER PRIMARY KEY AUTO_INCREMENT,
NAME VARCHAR(255) NOT NULL,
QUANTITY INT NOT NULL,
PRICE FLOAT NOT NULL
);
create TABLE Vendas(
    id integer primary key auto_increment,
    total_compra float,
    user_id integer references users (id),
    produtos_id integer references produtos (id),
);