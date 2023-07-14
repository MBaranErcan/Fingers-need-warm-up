SELECT class FROM
    (SELECT COUNT(student) AS counts, class FROM Courses
    GROUP BY class) AS count_by_class
    WHERE counts > 4;