
DROP TABLE users;
DROP TABLE tb_meau_foodmaterial;
DROP TABLE tb_foodmaterial;
DROP TABLE tb_meau;
DROP TABLE tb_food_type;
DROP TABLE tb_procedure;




/*用户*/
CREATE  TABLE  tb_user(
  user_id INTEGER PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(30) NOT NULL ,           -- 姓名
  phone VARCHAR(20)  ,                  -- 电话号码
  age INTEGER NOT NULL,                 -- 年龄
  weight FLOAT ,                        -- 体重
  heigth FLOAT ,                        -- 身高
  sex BIT ,                             -- 性别
  nickname VARCHAR(30),                 -- 昵称
  target  INTEGER,                      -- 目标
  power INTEGER  ,                      -- 工作强度
  active INTEGER   ,                    -- 是否激活
  create_time DATETIME,                 -- 创建时间
  update_time DATETIME                  -- 更新时间
);






/*食材类型*/
CREATE TABLE tb_material_type(
  material_type_id INTEGER PRIMARY KEY  AUTO_INCREMENT,      -- 编号
  type_name VARCHAR(50) NOT NULL ,                      -- 食材类型 名称
  material_type_desc TEXT ,                                           -- 食材的 描述
  create_time DATETIME,                                 -- 创建时间
  update_time DATETIME                                  -- 更新时间
);

/*菜的类型表*/
CREATE TABLE tb_meau_type(
  meau_type_id INTEGER PRIMARY KEY AUTO_INCREMENT, -- 编号
  type_name VARCHAR(50) NOT NULL ,                      -- 菜类型 名称
  meau_type_desc TEXT ,                                      -- 菜类型 描述
  create_time DATETIME,                            -- 创建时间
  update_time DATETIME                             -- 更新时间
);

/*菜制作过程*/
CREATE TABLE tb_procedure(
  procedure_id INTEGER PRIMARY KEY AUTO_INCREMENT,    -- 编号
  step TEXT,                                          -- 步骤
  step_img VARCHAR(100) ,                             -- 步骤图
  meau_id INTEGER,                                    -- 菜编号(外键)
  create_time DATETIME,                               -- 创建时间
  update_time DATETIME                                -- 更新时间
);

/*菜单表*/
CREATE TABLE tb_meau(
  meau_id INTEGER  PRIMARY KEY AUTO_INCREMENT,    -- 编号
  name VARCHAR(150) NOT NULL ,                    -- 菜名
  meau_desc TEXT ,                                 -- 描述
  img VARCHAR(100) ,                              -- 菜图
  meau_type_id INTEGER,                           -- 菜的类型(外键)
  create_time DATETIME,                           -- 创建时间
  update_time DATETIME                            -- 更新时间
);





/*食材表*/
CREATE TABLE tb_material(
  material_id INTEGER PRIMARY KEY  AUTO_INCREMENT,      -- 编号
  name VARCHAR(50) NOT NULL ,                           -- 食材名称
  protein FLOAT ,                                     -- 蛋白质
  protein_unit VARCHAR(20),                              -- 单位
  fat FLOAT ,                                         -- 脂肪
  fat_unit VARCHAR(20),                                  -- 单位
  carbohydrate FLOAT ,                                -- 碳水化合物
  carbohydrate_unit VARCHAR(20),                         -- 单位
  food_type_id INTEGER,                                  -- 食材类型(外键)
  create_time DATETIME,                                 -- 创建时间
  update_time DATETIME                                  -- 更新时间
);


/*菜谱食材关系表*/
CREATE TABLE tb_meau_foodmaterial(
  meau_material_id INTEGER PRIMARY KEY AUTO_INCREMENT,
  meau_id INTEGER,                                        -- 外键 菜单表
  material_id INTEGER ,                                   -- 外键 食材表
  material_count FLOAT ,                                  -- 该食材的重量
  material_count_unit VARCHAR(30),                        -- 单位
  create_time DATETIME,                                 -- 创建时间
  update_time DATETIME                                  -- 更新时间
);

-- 菜谱 表中的外键

ALTER TABLE tb_meau ADD  CONSTRAINT fk_meau_type FOREIGN KEY (meau_type_id) REFERENCES tb_meau_type(meau_type_id);

-- 菜制作过程
ALTER TABLE tb_procedure ADD  CONSTRAINT fk_meau_id FOREIGN KEY (meau_id) REFERENCES tb_meau(meau_id);

-- 食材表中的外键
ALTER TABLE tb_foodmaterial ADD CONSTRAINT fk_foodmaterial_foodtype FOREIGN KEY(foodType_id) REFERENCES tb_food_type(foodType_id);


-- 菜谱 食材关系表 主键 和外键

ALTER TABLE tb_meau_foodmaterial ADD CONSTRAINT fk_meau_id FOREIGN KEY(meau_id) REFERENCES tb_meau(meau_id);

ALTER TABLE tb_meau_foodmaterial ADD CONSTRAINT fk_material_id FOREIGN KEY(material_id) REFERENCES tb_material(material_id);




SELECT * FROM tb_meau_foodmaterial;
SELECT * FROM tb_meau;
SELECT * FROM tb_foodmaterial;
SELECT * FROM tb_procedure;
SELECT * FROM tb_food_type;




 -- --------------------一下是hibernate 自动生成的 ---------------







drop table if exists tb_material;

drop table if exists tb_material_type;

drop table if exists tb_meau;
drop table if exists tb_meau_foodmaterial;

drop table if exists tb_meau_type;

drop table if exists tb_procedure;

drop table if exists tb_user;

create table tb_material (
  material_id bigint not null auto_increment,
  carbohydrate double precision,
  carbohydrate_unit varchar(20),
  create_time datetime,
  fat double precision,
  fat_unit varchar(20),
  name varchar(50),
  protein double precision,
  protein_unit varchar(20),
  update_time datetime,
  food_type_id bigint,
  primary key (material_id)
);

create table tb_material_type (
  material_type_id bigint not null auto_increment,
  create_time datetime,
  material_type_desc varchar(255),
  type_name varchar(50) not null,
  update_time datetime,
  primary key (material_type_id)
);

create table tb_meau (
  meau_id bigint not null auto_increment,
  create_time datetime,
  img varchar(255),
  meau_desc varchar(255),
  name varchar(255) not null,
  update_time datetime,
  meau_type_id bigint,
  primary key (meau_id)
);

create table tb_meau_foodmaterial (
  meau_material_id bigint not null auto_increment,
  material_count float,
  material_count_unit varchar(255),
  create_time datetime,
  update_time datetime,
  material_id bigint,
  meau_id bigint,
  primary key (meau_material_id)
);

create table tb_meau_type (
  meau_type_id bigint not null auto_increment,
  create_time datetime,
  meau_type_desc varchar(255),
  type_name varchar(50) not null,
  update_time datetime,
  primary key (meau_type_id)
);

create table tb_procedure (
  procedure_id bigint not null auto_increment,
  create_time datetime,
  step varchar(255),
  step_img varchar(255),
  update_time datetime,
  meau_id bigint,
  primary key (procedure_id)
);

create table tb_user (
  user_id bigint not null auto_increment,
  active integer,
  age integer not null,
  create_time datetime,
  height double precision,
  name varchar(30) not null,
  nickname varchar(30),
  phone varchar(5) not null,
  power integer,
  sex integer,
  target integer,
  update_time datetime,
  weight double precision,
  primary key (user_id)
);

alter table tb_material
  add constraint FKf5mh5nedu7cq40oq1vckawp3t
foreign key (food_type_id)
references tb_material_type (material_type_id);

alter table tb_meau
  add constraint FKe75jlqnhx8e5kcmw9wm3a8r3g
foreign key (meau_type_id)
references tb_meau_type (meau_type_id);

alter table tb_meau_foodmaterial
  add constraint FKlpfvimi4crfqcjaain12vuqyx
foreign key (material_id)
references tb_material (material_id);

alter table tb_meau_foodmaterial
  add constraint FKb2h1aityjqdjujl38r5rwkms2
foreign key (meau_id)
references tb_meau (meau_id);

alter table tb_procedure
  add constraint FKa1xtijy5uuywvd4y16u06gvbo
foreign key (meau_id)
references tb_meau (meau_id)



