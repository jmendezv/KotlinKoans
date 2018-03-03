fun containsEven(collection: Collection<Int>): Boolean =
        //collection.any { n -> n % 2 == 0 }
        collection.any() { it % 2 == 0 }


fun <T, R> List<T>.map(transform: (T) -> R): List<R> {
    val result = arrayListOf<R>()
    for (item in this)
        result.add(transform(item))
    return result
}

var addition: ((Int, Int) -> Int)? = null

var aNullableFun: ((Char, Int) -> String)? = null

// 1.sum(2)
val sum = fun Int.(other: Int): Int = this + other

// 2.times(3)
val times = fun Int.(multiplicando: Int) : Int = this * multiplicando
