SELECT customer_number FROM Orders 
GROUP BY customer_number ORDER BY count(order_number) DESC limit 1;