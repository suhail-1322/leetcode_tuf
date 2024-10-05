# Write your MySQL query statement below
UPDATE Salary
SET sex = case
            WHEN sex = 'f' then 'm'
            else 'f'
          END
