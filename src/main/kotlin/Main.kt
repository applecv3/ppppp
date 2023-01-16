import java.lang.StringBuilder

fun solution(s: String): String {
    val answer = StringBuilder()

    var firstLetter = s.first()
    if(firstLetter.isLetter()){
        firstLetter = firstLetter.uppercaseChar()
    }

    answer.append(firstLetter)

    for(i in 1 until s.length){
        var letter = s[i]
        if(letter.isLetter()){
            letter = if(s[i-1] == ' '){
                letter.uppercaseChar()
            } else {
                letter.lowercaseChar()
            }
        }
        answer.append(letter)
    }

    return answer.toString()
}

fun main(args: Array<String>) {
    println( solution("3people unFollowed me"))
}

