# Write your MySQL query statement below
select p.product_name, sum(o.unit) unit
from products p
join orders o
on p.product_id = o.product_id
where month(order_date) = 2 and year(order_date) =2020
group by p.product_id
having unit >=100 