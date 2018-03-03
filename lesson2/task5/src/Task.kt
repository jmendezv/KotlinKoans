import TimeInterval.*

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

enum class TimeInterval { DAY, WEEK, YEAR }

operator fun MyDate.plus(timeInterval: TimeInterval): MyDate =
        addTimeIntervals(timeInterval)

data class TimesTimeInterval public constructor(val timeInterval: TimeInterval, val number: Int) : Any()

operator fun TimeInterval.times(number: Int): TimesTimeInterval =
        TimesTimeInterval(this, number)

operator fun MyDate.plus(timeIntervals: TimesTimeInterval): MyDate =
        addTimeIntervals(timeIntervals.timeInterval, timeIntervals.number)


fun task1(today: MyDate): MyDate {
    return today + YEAR + WEEK
}

fun task2(today: MyDate): MyDate {
    return today + YEAR * 2 + WEEK * 3 + DAY * 5
}
