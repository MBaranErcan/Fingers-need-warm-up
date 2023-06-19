SELECT e.name, b.bonus FROM Employee e Inner Join Bonus b ON e.empId = b.empId
WHERE b.bonus < 1000
OR b.bonus IS NULL;