SELECT d.name AS Department,
       sub.name AS Employee,
       sub.salary
FROM (
    SELECT name,
           departmentId,
           salary,
           DENSE_RANK() OVER (PARTITION BY departmentId ORDER BY salary DESC) AS salary_rank
    FROM Employee
) AS sub
LEFT JOIN Department AS d
ON sub.departmentId = d.id
WHERE salary_rank <= 3;