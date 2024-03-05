select user_id , name , mail 
from users 
where mail regexp '^[A-Za-z][A-Za-z0-9_.-]*@leetcode[.]com$'