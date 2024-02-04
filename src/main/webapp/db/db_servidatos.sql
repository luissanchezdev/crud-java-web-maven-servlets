DROP TABLE IF EXISTS usuarios;

CREATE TABLE usuarios(
  id SERIAL PRIMARY KEY,
  name varchar(100) NOT NULL,
  phone VARCHAR(30) NOT NULL,
  address VARCHAR(100) NOT NULL,
  email VARCHAR(150) NOT NULL,
  password VARCHAR(100) NOT NULL
);

INSERT INTO usuarios(nombre, telefono, direccion) VALUES("martha paez", "3238894197","alvarez", "martha@example.com","2023");