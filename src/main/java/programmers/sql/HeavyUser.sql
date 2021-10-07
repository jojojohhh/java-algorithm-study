SELECT PLACES.ID, PLACES.NAME, PLACES.HOST_ID
FROM PLACES, (SELECT HOST_ID, COUNT(HOST_ID) AS COUNT FROM PLACES GROUP BY HOST_ID) AS HOST_COUNT
WHERE PLACES.HOST_ID = HOST_COUNT.HOST_ID AND HOST_COUNT.COUNT >= 2
ORDER BY PLACES.ID