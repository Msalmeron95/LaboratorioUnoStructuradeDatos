// Interfaz FizzBuzzable
interface FizzBuzzable {
    fun evaluateNumber(num: Int): String
}

// Clase FizzBuzzProcessor
class FizzBuzzProcessor(private val range: IntRange) : FizzBuzzable {
    override fun evaluateNumber(num: Int): String {
        return when {
            num % 3 == 0 && num % 5 == 0 -> "FizzBuzz"
            num % 3 == 0 -> "Fizz"
            num % 5 == 0 -> "Buzz"
            else -> num.toString()
        }
    }

    fun processFizzBuzz() {
        for (number in range) {
            println(evaluateNumber(number))
        }
    }
}

// Función main
fun main() {
    val fizzBuzzProcessor = FizzBuzzProcessor(1..100)
    fizzBuzzProcessor.processFizzBuzz()
}