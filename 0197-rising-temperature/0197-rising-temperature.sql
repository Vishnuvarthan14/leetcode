# Write your MySQL query statement below
SELECT DISTINCT w1.id
FROM Weather w1
JOIN Weather w2 
  ON datediff(w1.recordDate,w2.recordDate)=1
WHERE w1.temperature > w2.temperature;
