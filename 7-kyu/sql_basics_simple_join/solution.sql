SELECT p.id, p.name, p.isbn, p.company_id, p.price, c.name AS company_name
FROM products p
JOIN companies c ON c.id = p.company_id;