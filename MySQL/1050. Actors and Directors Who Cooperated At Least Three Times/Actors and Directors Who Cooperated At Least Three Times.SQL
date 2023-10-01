SELECT actor_id, director_id FROM ActorDirector ad
GROUP BY actor_id, director_id
HAVING count(timestamp) >= 3;

# solution by _vikas_12 #