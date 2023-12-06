# Write your MySQL query statement below
select name, bonus
from employee a
left join bonus b
on a.empID=b.empID 
where bonus<1000 or bonus is null;