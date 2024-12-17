fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    val newList = list.filter { it <= 2 }
    println(list) // Original list unchanged: [1, 2, 3, 4, 5]
    println(newList) // New list with filtered elements: [1, 2]

    val set = mutableSetOf(1, 2, 3, 4, 5)
    val newSet = set.filter { it <= 2 }.toSet()
    println(set) // Original set unchanged: [1, 2, 3, 4, 5]
    println(newSet) // New set with filtered elements: [1, 2]

    val map = mutableMapOf(1 to "one", 2 to "two", 3 to "three", 4 to "four", 5 to "five")
    val newMap = map.filter { it.key <= 2 }
    println(map) // Original map unchanged: {1=one, 2=two, 3=three, 4=four, 5=five}
    println(newMap) // New map with filtered elements: {1=one, 2=two}
    
    //Alternative for removeIf using filterNot and toMutableList/toMutableSet/toMutableMap 
    val list2 = mutableListOf(1,2,3,4,5)
    val list3 = list2.filterNot { it > 2 }.toMutableList()
    println(list2) // Original list unchanged
    println(list3) // Modified list
}