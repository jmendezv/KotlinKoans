fun eval(expr: Expr): Int {

    when (expr) {
        is Num -> return expr.value
        is Sum -> {
            val sum= expr as Sum
            return eval(sum.left) + eval(sum.right)
        }
        else -> throw IllegalArgumentException("Unknown expression")
    }
}

interface Expr

class Num(val value: Int) : Expr

class Sum(val left: Expr, val right: Expr) : Expr
