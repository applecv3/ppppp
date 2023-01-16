fun solution(n: Int): Long {
    if(n<3){
        return n.toLong()
    }

    val cache: IntArray = intArrayOf(1, 2)

    for (i in 2 until n){
        val nextValue: Int = (cache[0] + cache[1]) % 1234567
        cache[0] = cache[1]
        cache[1] = nextValue
    }

    return cache[1].toLong()
}

fun main(args: Array<String>) {
    println( solution(4))
    println("-----")
    println( solution(3))


    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}

