/*
Enter your query here.
Please append a semicolon ";" at the end of the query and enter your query in a single line to avoid error.
*/


SELECT * FROM( ( SELECT * FROM ( select CITY, LENGTH(CITY) K FROM STATION WHERE LENGTH(CITY) = ( SELECT MIN(LENGTH(CITY)) FROM STATION ) ORDER BY CITY ASC ) WHERE ROWNUM=1 ) UNION (SELECT * FROM ( select CITY, LENGTH(CITY) K FROM STATION WHERE LENGTH(CITY) = ( SELECT MAX(LENGTH(CITY)) FROM STATION ) ORDER BY CITY ASC ) WHERE ROWNUM=1 ) ); 

