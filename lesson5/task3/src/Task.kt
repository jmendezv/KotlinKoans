fun <T: Any> T.myApply(f: T.() -> Unit): T {
    this.f()
    return this
 }

fun <T> T.myApply2(f: T.() -> Unit): T {
    f()
    return this
}

fun <TYPE> TYPE.myApply3(func: TYPE.() -> Unit) : TYPE {
    func()
    return this
}

fun <GENERIC_TYPE> GENERIC_TYPE.myApply4(func: GENERIC_TYPE.() -> Unit) : GENERIC_TYPE {
    func()
    return this
}

fun createString(): String {
    return StringBuilder().myApply {
        append("Numbers: ")
        for (i in 1..10) {
            append(i)
        }
    }.toString()
}

fun createMap(): Map<Int, String> {
    return hashMapOf<Int, String>().myApply {
        put(0, "0")
        for (i in 1..10) {
            put(i, "$i")
        }
    }
}
