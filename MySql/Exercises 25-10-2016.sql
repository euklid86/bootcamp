2) SELECT actor.first_name,actor.last_name

FROM sakila.actor 

where actor.last_name LIKE '%SON'

order by actor.first_name;

3) SELECT * FROM sakila.address

where district = ' '

order by city_id

4) SELECT A.title, B.category_id 

FROM sakila.film as A 

INNER JOIN sakila.film_category as B

on A.film_id = B.film_id

order by a.title

 SELECT A.title, C.name

FROM sakila.film as A 

INNER JOIN sakila.film_category as B

on A.film_id = B.film_id

INNER JOIN sakila.category as C

on B.category_id=C.category_id

order by A.title

5) SELECT B.category_id, count(B.film_id)

FROM sakila.film_category as B

group by B.category_id

SELECT C.name, count(B.film_id)

FROM sakila.film_category as B

Inner Join sakila.category as C

on B.category_id=C.category_id

group by B.category_id

6) SELECT C.name, count(B.film_id) as z

FROM sakila.film_category as B

Inner Join sakila.category as C

on B.category_id=C.category_id

group by B.category_id

having z > 60

9) select C.name as Category_Name, avg(A.replacement_cost-A.rental_rate) as Rate

from sakila.film as A

Inner join sakila.film_category as B

on A.film_id=B.film_id

Inner Join sakila.category as C

on B.category_id=C.category_id

group by C.name

having Rate>17

order by Rate desc

10) select A.actor_id, A.first_name, A.last_name, count(C.title) as Total

from sakila.actor as A

inner join sakila.film_actor as B

on A.actor_id = B.actor_id

inner join sakila.film as C

on B.film_id = C.film_id
group by A.actor_id

Order by Total desc

11) select A.actor_id, A.first_name, A.last_name, count(C.title) as Total

from sakila.actor as A

inner join sakila.film_actor as B

on A.actor_id = B.actor_id

inner join sakila.film as C
on B.film_id = C.film_id

where C.length>183

group by A.actor_id

Order by Total descactor

12) select A.title, B.name as Language, D.name as Category

from sakila.film as A

Inner Join sakila.language as B

on A.language_id = B.language_id

Inner Join sakila.film_category as C

on C.film_id=A.film_id

Inner Join sakila.category as D

on C.category_id=D.category_id

where D.name='Documentary' and B.name='English'

order by A.title

13) select A.film_id, A.title

from sakila.film as A

where film_id NOT IN
	(select inventory.film_id from sakila.inventory)
order by A.film_id