import kotlin.math.*

var answer = 0
fun solution(k: Int, dungeons: Array<IntArray>): Int {
    dfs(-1, dungeons, k, HashSet<Int>(), 0)
    return answer
}

fun dfs(idx: Int, dungeons: Array<IntArray>, k: Int, visited: HashSet<Int>, count: Int) {
    answer = max(answer, count)
    for(nextId in dungeons.indices){
        if(!visited.contains(nextId) && k >= dungeons[nextId][0]){
            visited.add(nextId)
            dfs(nextId, dungeons, k - dungeons[nextId][1], visited, count+1)
            visited.remove(nextId)
        }
    }
}

fun main(args: Array<String>) {

}

