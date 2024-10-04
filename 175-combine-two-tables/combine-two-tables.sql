# Write your MySQL query statement below

SELECT firstName,LastName,city,state
FROM Person
Left join Address ON Person.personId = Address.personId