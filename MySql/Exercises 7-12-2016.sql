Ex1 
create view sample_actors as
select actor_id, last_name, first_name
from actors

select * from sample_actors


Ex3 

create view V1 as

select customer.customer_id, customer.last_name,month(rental_date), count(rental.rental_id) as Rentals

from customer

inner join rental

on customer.customer_id=rental.customer_id

group by customer_id, month(rental_date)



create view V2 as
select customer.customer_id, customer.last_name, count(rental.rental_id) as Rentals

from customer
inner join rental

on customer.customer_id=rental.customer_id

group by customer_id




select V1.customer_id, V1.last_name, (V1.Rentals/V2.Rentals*100)

from V1

inner join V2 
on V1.customer_id=V2.customer_id

Ex4
create view V3 as

select customer.customer_id, month(payment.payment_date) as month, sum(payment.amount) as Amount

from customer
inner join payment

on customer.customer_id=payment.customer_id

group by customer_id, month(payment_date)



create view V4 as

select customer.customer_id, customer.last_name, sum(payment.amount) as Amount

from customer

inner join payment

on customer.customer_id=payment.customer_id

group by customer_id



select V3.customer_id, V3.month, (V3.Amount/V4.Amount*100)

from V3

inner join V4 

on V3.customer_id=V4.customer_id

Ex6
create view V5 as

select customer.customer_id, customer.first_name, customer.last_name, month(payment.payment_date) as month, sum(payment.amount) as Amount

from customer

inner join payment

on customer.customer_id=payment.customer_id

group by customer_id, month(payment_date)



select V5.first_name, V5.last_name, V5.month, (V5.Amount/V4.Amount*100)

from V5

inner join V4 
on V5.customer_id=V4.customer_id