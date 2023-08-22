SELECT
  DATE(activity_date) AS day,
  COUNT(DISTINCT user_id) AS active_users
FROM
  Activity a
  WHERE a.activity_date < '2019-07-27'
  AND a.activity_date > '2019-06-27'
GROUP BY DATE(activity_date)
