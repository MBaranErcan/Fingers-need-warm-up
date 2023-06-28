/*  SOLUTION 1
SELECT c.name
FROM Customer c
WHERE referee_id != 2
OR referee_id IS NULL;
*/

/* SOLUTION 2 */
SELECT c.name
FROM Customer c
WHERE COALESCE(referee_id, 0) != 2