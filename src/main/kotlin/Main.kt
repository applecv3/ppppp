import java.util.HashSet

var answer = 0
fun solution(n: Int): Int {

    dfs(-1, HashSet<Int>(), HashSet<Int>(), HashSet<Int>(), n)

    return answer
}

fun dfs(y: Int, X: HashSet<Int>, DL: HashSet<Int>, DR: HashSet<Int>, n: Int) {
    if(y == n-1){
        answer ++
        return
    }

    for(nx in 0 until n){
        val ny = y + 1

        if(X.contains(nx) || DL.contains(ny-nx) || DR.contains(ny+nx)){
            continue
        }

        val dl = ny - nx
        val dr = ny + nx

        X.add(nx)
        DL.add(dl)
        DR.add(dr)

        dfs(ny, X, DL, DR, n)

        X.remove(nx)
        DL.remove(dl)
        DR.remove(dr)
    }
}

fun main(args: Array<String>) {
    println( solution(4))

}

/*
    for nx in range(n):

        ny = y + 1

        if nx in X or ny-nx in DL or ny+nx in DR:
            continue

        dl = ny-nx
        dr = ny+nx

        X.add(nx)
        DL.add(dl)
        DR.add(dr)

        dfs(ny, X, DL, DR, config, n)

        X.discard(nx)
        DL.discard(dl)
        DR.discard(dr)


def solution(n):

    config = Config()
    X, DL, DR = set(), set(), set()

    dfs(-1, X, DL, DR, config, n)

    return config.answer
 */