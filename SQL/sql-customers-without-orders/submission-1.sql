SELECT c.name 
FROM customers c
LEFT JOIN orders o
ON o.customer_id = c.id
WHERE o.customer_id IS NULL;