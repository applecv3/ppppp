fun solution(n: Int): Int {
    val cache: IntArray = intArrayOf(0, 1)

    for(i in 2 .. n){
        val nextValue: Int = (cache[0] + cache[1]) % 1234567
        cache[0] = cache[1]
        cache[1] = nextValue
    }

    return cache[1]
}

fun main(args: Array<String>) {
    println( solution(3))
    println("-----")
    println( solution(5))


    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}
