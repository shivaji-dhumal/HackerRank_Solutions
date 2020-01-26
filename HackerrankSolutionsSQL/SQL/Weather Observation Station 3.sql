/*
Enter your query here.
Please append a semicolon ";" at the end of the query and enter your query in a single line to avoid error.
*/

select city from station where MOD(ID,2)=0 Group by city;