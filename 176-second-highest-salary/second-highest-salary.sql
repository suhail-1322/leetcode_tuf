
SELECT (
    SELECT DISTINCT salary
    FROM Employee 
    ORDER BY salary DESC 
    LIMIT 1, 1
) as SecondHighestSalary