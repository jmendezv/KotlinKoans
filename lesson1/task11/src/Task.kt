import java.util.*

fun getList(): List<Int> {
    val arrayList = arrayListOf(1, 5, 2)
    Collections.sort(arrayList, { x, y -> y - x })
    return arrayList
}


/*
Collections.sort(arrayList, object : Comparator<Int> {
        override fun compare(a: Int, b: Int): Int {
            return b - a
        }
    } )
 */