# Write your MySQL query statement below
select e.reports_to as employee_id, m.name,count(*) as reports_count,round(avg(e.age)) as average_age
from Employees e
join Employees m on m.employee_id = e.reports_to
group by e.reports_to,m.name
order by m.employee_id;
