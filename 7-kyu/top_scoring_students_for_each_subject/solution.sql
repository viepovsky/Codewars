SELECT DISTINCT ON (sub.subject_id)
    ARRAY_AGG(stu.student_name ORDER BY stu.student_id) AS student_names,
    sub.subject_name AS subject_name,
    MAX(m.mark_rate) AS mark_rate
FROM students stu
         JOIN marks m ON m.student_id = stu.student_id
         JOIN subjects sub ON m.subject_id = sub.subject_id
GROUP BY sub.subject_id, sub.subject_name, m.mark_rate
ORDER BY sub.subject_id, m.mark_rate DESC;