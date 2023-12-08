# Write your MySQL query statement below
select firstName, lastName, city, state
from person a
left join address b
on a.personId=b.personId;