# Write your MySQL query statement below
select unique_id,name
from employees a
left join employeeUNI b 
on a.id=b.id;
