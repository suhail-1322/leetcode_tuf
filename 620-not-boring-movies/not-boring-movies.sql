# Write your MySQL query statement below
SELECT * 
FROM Cinema 
WHERE id IN(
    SELECT 
        CASE
            WHEN id%2=1 AND description != 'boring' then id
        end as id
        FROM Cinema
    ) 
ORDER BY rating DESC