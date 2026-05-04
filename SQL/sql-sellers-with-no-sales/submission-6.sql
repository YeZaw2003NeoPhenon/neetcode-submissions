SELECT s.seller_name 

FROM seller s

LEFT JOIN (
    SELECT o.seller_id 
    FROM orders o 
    WHERE o.sale_date BETWEEN '2020-01-01' AND '2020-12-31'
) o 
ON o.seller_id = s.seller_id
WHERE o.seller_id IS NULL
ORDER BY s.seller_name ASC;
