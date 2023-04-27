SELECT p.firstName, p.lastName, a.city, a.state FROM Person as p, Address as a
WHERE p.personId = a.personId 
UNION
SELECT p.firstName, p.lastName, null, null FROM Person as p
WHERE p.personId NOT IN (SELECT personId FROM Address);