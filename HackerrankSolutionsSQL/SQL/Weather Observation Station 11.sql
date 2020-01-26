/*
Enter your query here.
Please append a semicolon ";" at the end of the query and enter your query in a single line to avoid error.
*/


select DISTINCT CITY from STATION where SUBSTR(UPPER(CITY),1,1) NOT IN ('A','E','I','O','U') OR SUBSTR(UPPER(CITY),LENGTH(CITY),1) NOT IN ('A','E','I','O','U');