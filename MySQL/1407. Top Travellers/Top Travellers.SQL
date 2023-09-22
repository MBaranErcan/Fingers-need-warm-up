SELECT u.name, (SELECT IFNULL(sum(r.distance),0)
                FROM rides r
                WHERE u.id = r.user_id) AS travelled_distance
FROM Users u
ORDER BY travelled_distance DESC, name ASC
