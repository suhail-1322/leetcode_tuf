# Write your MySQL query statement below
SELECT w2.id
FROM Weather w1
JOIN Weather w2
ON w1.id != w2.id
WHERE DATEDIFF(w2.recordDate,w1.recordDate) = 1 AND w2.temperature > w1.temperature
ORDER BY w1.recordDate