fun main(args: Array<String>) {
    var number = 12
    var numberString = ""

    when (number){
        1 -> numberString = "één"
        2 -> numberString = "twee"
        3 -> numberString = "drie"
        4 -> numberString = "vier"
        5 -> numberString = "vijf"
        6 -> numberString = "zes"
        7 -> numberString = "zeven"
        8 -> numberString = "acht"
        9 -> numberString = "negen"
        10 -> numberString = "tine"
        !in 1..10 -> numberString = "Out of Range"
        else -> numberString = "Unknown"

    }

    println("Numbers in Dutch: $number is $numberString")
}