import java.util.ArrayList

fun solution(k: Int, tangerine: IntArray): Int {
    val counter = HashMap<Int, Int>()

    for (value in tangerine){
        counter[value]?.let { counter.put(value, it.plus(1)) } ?: run {counter.put(value, 1)}
    }

    val pairs: ArrayList<ArrayList<Int>> = ArrayList()

    for((key, value) in counter){
        pairs.add(arrayListOf(key, value))
    }

    pairs.sortBy {it[1]}

    var numToRemove = tangerine.size - k;
    var removed = 0

    for (i in tangerine.indices){
        if(numToRemove >= pairs[i][1]){
            numToRemove -= pairs[i][1]
            removed ++
        }
        else {
            break
        }
    }

    return pairs.size - removed
}

fun main(args: Array<String>) {

}

