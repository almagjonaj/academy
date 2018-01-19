create database IF NOT EXISTS web_project;

use web_project;

create table IF NOT EXISTS company(
id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
name varchar(50) NOT NULL,
nipt int NOT NULL,
address varchar(50) NOT NULL);

create table IF NOT EXISTS department(
id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
name varchar(50) NOT NULL,
companyId int,
FOREIGN KEY(companyId) REFERENCES company(id));

create table IF NOT EXISTS sector(
id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
name varchar(50) NOT NULL,
departmentId int,
FOREIGN KEY(departmentId) REFERENCES department(id));

create table IF NOT EXISTS brand(
id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
name varchar(50) NOT NULL);

create table IF NOT EXISTS sector_brand(
brandId int,
sectorId int,
FOREIGN KEY(brandId) REFERENCES brand(id),
FOREIGN KEY(sectorId) REFERENCES sector(id),
PRIMARY KEY(brandId,sectorId));

create table IF NOT EXISTS shop(
id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
name varchar(50) NOT NULL,
sectorId int,
FOREIGN KEY(sectorId) REFERENCES sector(id));

create table IF NOT EXISTS country(
id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
name varchar(50) NOT NULL,
coin varchar(10) DEFAULT NULL);

create table IF NOT EXISTS country_shop(
countryId int,
shopId int,
FOREIGN KEY(shopId) REFERENCES shop(id),
FOREIGN KEY(countryId) REFERENCES country(id),
PRIMARY KEY(countryId,shopId));

create table IF NOT EXISTS product(
id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
name varchar(50) NOT NULL,
quantity double DEFAULT NULL,
price int DEFAULT NULL,
shopId int,
FOREIGN KEY(shopId) REFERENCES shop(id));

create table IF NOT EXISTS country_product(
countryId int,
productId int,
FOREIGN KEY(countryId) REFERENCES country(id),
FOREIGN KEY(productId) REFERENCES product(id),
PRIMARY KEY(countryId,productId));

create table IF NOT EXISTS role(
id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
name varchar(50) NOT NULL);

create table IF NOT EXISTS user(
id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
username varchar(50) NOT NULL,
firstname varchar(50)NOT NULL,
lastname varchar(50) NOT NULL,
password varchar(50) NOT NULL);

create table IF NOT EXISTS user_role(
userId int NOT NULL,
roleId int NOT NULL,
PRIMARY KEY(userId,roleId),
FOREIGN KEY(userId) REFERENCES user(id),
FOREIGN KEY(roleId) REFERENCES role(id));

create table IF NOT EXISTS orders(
userId int,
productId int,
quantity int DEFAULT NULL,
FOREIGN KEY(userId) REFERENCES user(id),
FOREIGN KEY(productId) REFERENCES product(id),
PRIMARY KEY(userId,productId));


Insert into company(id,name,nipt,address) values(1,"TEG",1234,"asdf");

Insert into role(name,description) Values("admin","admin");
Insert into role(name,description) Values("brandManager","brand");
Insert into role(name,description) Values("deptManager","department");
Insert into role(name,description) Values("sectorManager","sector");
Insert into role(name,description) Values("shopManager","shop");
Insert into role(name,description) Values("countryManager","country");
Insert into role(name,description) Values("productManager","product");
Insert into role(name,description) Values("clientUser","client");

Insert into user(username,firstname,lastname,password,roleId) values("root","admin","admin","admin1234",1);
Insert into user(username,firstname,lastname,password,roleId) values("client","admin","admin","admin1234",8);
Insert into user(username,firstname,lastname,password,roleId) values("alba_ll","alba","llubani","alba1234",2);
Insert into user(username,firstname,lastname,password,roleId) values("john_k","john","kelly","john1234",3);
Insert into user(username,firstname,lastname,password,roleId) values("patris_j","patris","jackson","patris1234",4);
Insert into user(username,firstname,lastname,password,roleId) values("mabel_b","mabel","berna","mabel1234",5);
Insert into user(username,firstname,lastname,password,roleId) values("ansi_h","ansi","hank","ansi1234",6);
Insert into user(username,firstname,lastname,password,roleId) values("herry_z","herry","zanner","herry1234",7);

