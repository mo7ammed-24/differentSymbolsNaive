fun main() {
    print(differentSymbolsNaive("cabca"))
}

fun differentSymbolsNaive(s: String): Int {
    var mylist=mutableListOf<Char>()
    for(i in 0 until s.length)
        if(s[i] !in mylist)
            mylist.add(s[i])

    return mylist.size

}
