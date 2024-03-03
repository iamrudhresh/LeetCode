select y.person_name from(
select person_name,dense_rank() over (order by sumweight desc) as flag from (
select person_id , person_name  , weight , turn, sum(weight) over (order by turn) as sumweight from Queue) x
where x.sumweight<1001)y
where y.flag = 1