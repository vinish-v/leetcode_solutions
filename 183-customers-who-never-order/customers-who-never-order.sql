select c.name as customers from customers c 
where id not in (select customerId from orders); 