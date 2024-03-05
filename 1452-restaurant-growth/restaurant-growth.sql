# Write your MySQL query statement below

WITH Each_Day AS (
    SELECT
        visited_on,
        SUM(amount) amount
    FROM
        Customer
    GROUP BY
        visited_on
)

SELECT 
    c1.visited_on,
    SUM(c2.amount) amount,
    ROUND(AVG(c2.amount), 2) average_amount
FROM
    Each_Day AS c1
JOIN
    Each_Day AS c2 ON 
        c2.visited_on <= c1.visited_on AND
        DATEDIFF(c1.visited_on, c2.visited_on) < 7
GROUP BY
    c1.visited_on
HAVING
    COUNT(*) = 7
ORDER BY
    visited_on ASC;