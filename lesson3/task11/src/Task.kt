// Return the most expensive product among all delivered products
// (use the Order.isDelivered flag)
fun Customer.getMostExpensiveDeliveredProduct(): Product? {
    return orders
            .filter { it.isDelivered }
            .flatMap { it.products }
            .sortedBy { it.price }
            .last()
}

// Return how many times the given product was ordered.
// Note: a customer may order the same product for several times.
fun Shop.getNumberOfTimesProductWasOrdered(product: Product): Int {
    return customers
            .flatMap { it.orders }
            .flatMap { it.products }
            .count { it == product }
}


