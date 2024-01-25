SELECT customer_id
FROM orders
EXCEPT
SELECT customer_id
FROM orders
WHERE delivery_date IS NOT NULL
ORDER BY customer_id DESC;

SELECT customer_id
FROM orders
GROUP BY customer_id
HAVING EVERY(delivery_date IS NULL)
ORDER BY customer_id DESC;
