// Return the set of products that were ordered by every customer
fun Shop.getSetOfProductsOrderedByEveryCustomer(): Set<Product> {
    val allProductsOrdered: Set<Product> = customers.flatMap { it.orders.flatMap { it.products } }.toSet()

    // fold(initialValue, { accumulator, element } )
    return customers.fold(allProductsOrdered, { allProducts, customer ->
        allProducts.intersect(customer.orders.flatMap { it.products })
    })
}
