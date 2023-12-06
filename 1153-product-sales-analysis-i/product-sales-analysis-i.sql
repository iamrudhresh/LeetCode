# Write your MySQL query statement below
select product_name, year, price
from sales a
left join product b
on a.product_id=b.product_id;