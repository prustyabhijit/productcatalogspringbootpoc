/* will be called and loaded automatically on startup*/
DROP SCHEMA IF EXISTS testdb;

CREATE SCHEMA testdb;
USE testdb;

/* Table: products */
CREATE TABLE products (
  id              INT NOT NULL auto_increment,
  product_code    VARCHAR(25) , 
  product_name    VARCHAR(50) ,
  description     VARCHAR(250),
  standard_cost   DECIMAL(19,4) NULL DEFAULT '0.0000',
  list_price      DECIMAL(19,4) NOT NULL DEFAULT '0.0000',
  target_level    INT ,
  reorder_level   INT ,
  minimum_reorder_quantity INT ,
  quantity_per_unit VARCHAR(50) ,
  discontinued    TINYINT NOT NULL DEFAULT '0',
  category        VARCHAR(50),
  PRIMARY KEY (id)
);
