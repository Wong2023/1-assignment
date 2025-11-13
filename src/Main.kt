//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun isPrime(n: Int): Boolean {
    if (n < 2) return false
    for (i in 2..Math.sqrt(n.toDouble()).toInt()) {
        if (n % i == 0) return false
    }
    return true
}

fun main() {
    // 1️⃣ Find the first 50 prime numbers
    val primes = mutableListOf<Int>()
    var number = 2
    while (primes.size < 50) {
        if (isPrime(number)) {
            primes.add(number)
        }
        number++
    }

    println("First 50 prime numbers:")
    println(primes)

    val evens = (2..100 step 2).toList()

    println("\nFirst 50 even numbers:")
    println(evens)

    // 3️⃣ Combine both lists
    val combined = primes + evens

    println("\nCombined list (primes + evens):")
    println(combined)
}
