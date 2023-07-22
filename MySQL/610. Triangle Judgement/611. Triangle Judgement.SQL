SELECT x, y, z,
CASE
WHEN (z + y) > x AND (x + z) > y AND (x + y) > z THEN 'Yes'
ELSE 'No'
END AS triangle
FROM Triangle;