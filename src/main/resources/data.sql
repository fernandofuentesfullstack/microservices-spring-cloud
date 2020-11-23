INSERT INTO categories (id, name) VALUES (1, 'shoes');
INSERT INTO categories (id, name) VALUES (2, 'books');
INSERT INTO categories (id, name) VALUES (3, 'electronics');

INSERT INTO products (id, name, description, stock, price, status, create_at, category_id) VALUES (1, 'adidas', 'Running shoe from ADIDAS', 5., 89.95, 'CREATED', NOW(), 1);