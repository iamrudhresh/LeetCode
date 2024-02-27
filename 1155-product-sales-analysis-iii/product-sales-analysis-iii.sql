SELECT
    product_id, 
    year first_year,
    quantity,
    price
FROM
    Sales
WHERE
    (product_id, year) 
    IN
    (
        SELECT
            product_id,
            MIN(year) first_year
        FROM
            Sales
        GROUP BY
            product_id
    )