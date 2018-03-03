data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {

    override fun compareTo(other: MyDate): Int {
        return (year * 365 + month * 30 + dayOfMonth) - (other.year * 365 + other.month * 30 + other.dayOfMonth)
    }

    // operator fun MyDate.inc() : MyDate = MyDate(this.year, this.month, this.dayOfMonth++)
}

fun compare(date1: MyDate, date2: MyDate) = date1 < date2
