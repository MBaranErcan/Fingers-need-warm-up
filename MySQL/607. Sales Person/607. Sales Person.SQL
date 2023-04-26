SELECT name FROM SalesPerson WHERE sales_id NOT IN
  (SELECT sales_id from Orders WHERE com_id IN
    (SELECT com_id fro0m Company Where name = 'RED'));