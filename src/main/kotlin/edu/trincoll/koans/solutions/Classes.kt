<<<<<<< HEAD:src/main/kotlin/edu/trincoll/koans/Classes.kt
package edu.trincoll.koans
import kotlin.random.Random as KRandom
import java.util.Random as JRandom
=======
package edu.trincoll.koans.solutions

// Rename on import
import kotlin.random.Random as KRandom
import java.util.Random as JRandom

>>>>>>> upstream/main:src/main/kotlin/edu/trincoll/koans/solutions/Classes.kt
// Data classes
data class Person(val name: String, val age: Int)

fun getPeople(): List<Person> {
    return listOf(Person("Alice", 29), Person("Bob", 31))
}

fun comparePeople(): Boolean {
    val p1 = Person("Alice", 29)
    val p2 = Person("Alice", 29)
    return p1 == p2
}

// Smart casts
fun evalSmartCasts(expr: Expr): Int =
    when (expr) {
        is Num -> expr.value
<<<<<<< HEAD:src/main/kotlin/edu/trincoll/koans/Classes.kt
        is Sum -> eval(expr.left)+eval(expr.right)
        else -> throw IllegalArgumentException("Unknown expression")
    }

sealed interface Expr

=======
        is Sum -> evalSmartCasts(expr.left) + evalSmartCasts(expr.right)
    }

sealed interface Expr
>>>>>>> upstream/main:src/main/kotlin/edu/trincoll/koans/solutions/Classes.kt
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr
// Sealed classes
fun eval(expr: Expr): Int =
    when (expr) {
        is Num -> expr.value
        is Sum -> eval(expr.left) + eval(expr.right)
<<<<<<< HEAD:src/main/kotlin/edu/trincoll/koans/Classes.kt
     }
=======
    }

>>>>>>> upstream/main:src/main/kotlin/edu/trincoll/koans/solutions/Classes.kt

fun useDifferentRandomClasses(): String {
    return "Kotlin random: " +
            KRandom.nextInt(2) +
            " Java random:" +
            JRandom().nextInt(2) +
            "."
        }

// Extension functions
fun Int.r(): RationalNumber = RationalNumber(this, 1)

fun Pair<Int, Int>.r(): RationalNumber = RationalNumber(first, second)

data class RationalNumber(val numerator: Int, val denominator: Int)