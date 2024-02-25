# Write your MySQL query statement below
SELECT
    query_name, 
    ROUND(AVG(rating / position), 2) quality, 
    ROUND(SUM(IF(rating < 3, 100, 0)) / COUNT(*), 2) poor_query_percentage
FROM 
    Queries
WHERE 
    query_name IS NOT NULL
GROUP BY
    query_name;