SELECT  * FROM Cinema c
WHERE c.description != 'boring'
AND c.id%2 = 1
ORDER BY rating DESC