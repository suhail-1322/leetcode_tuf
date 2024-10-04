# Write your MySQL query statement below
SELECT DISTINCT w2.id
FROM Weather w1
JOIN Weather w2 ON w1.id != w2.id
WHERE w1.temperature < w2.temperature
  AND DATEDIFF(w2.recordDate, w1.recordDate) = 1
ORDER BY w1.recordDate;
 