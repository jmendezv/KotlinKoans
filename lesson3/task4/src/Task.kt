// Return all products this customer has ordered
fun Customer.getOrderedProducts(): Set<Product> =
        orders.flatMap { o -> o.products }.toSet()

// Return all products that were ordered by at least one customer
fun Shop.getAllOrderedProducts(): Set<Product> =
        customers.flatMap { c -> c.orders }.flatMap { o -> o.products }.toSet()
