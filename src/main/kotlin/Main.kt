fun solution(n: Int): Array<IntArray> {
    val answer = arrayOf<IntArray>().toMutableList()
    recursion(n, 1, 2, 3, answer)
    return answer.toTypedArray()
}

fun recursion(n: Int, a: Int, b: Int, c: Int, answer: MutableList<IntArray>) {
    if(n == 1){
        answer.add(intArrayOf(a, c))
        return
    }

    recursion(n-1, a, c, b, answer)
    answer.add(intArrayOf(a, c))
    recursion(n-1, b, a, c, answer)
}

fun main(args: Array<String>) {
    println( solution(2))
    println("-----")
    
    println("Program arguments: ${args.joinToString()}")
}
