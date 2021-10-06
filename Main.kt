import com.sun.org.apache.xpath.internal.operations.Bool
import java.nio.file.Files.size
import java.util.*

fun prime (number : Int): Boolean {

    var flag = true
    for (i in 2..number/2){
        if (number % i == 0 ){
            flag = false
        }
    }
    return flag
}
fun encode(msg : String): MutableList<Int> {
    val code = mutableListOf<Int>()
    for(i in msg){
        code.add(i.code)
    }
    return code
}

fun decode(msg : MutableList<Int>) : String {
    var message : String = ""
    for(i in msg)
    {
        message += i.toChar()
    }
    return message
}

fun even (list : List<Int>)  = print("${list.filter{ it % 2 == 0 }} ")

fun main() {
   val num1 = 2
    val num2 = 3
    println("$num1 + $num2 = " + (num1+num2))

    val daysOfWeek = listOf<String>("monday","tuesday","wednesday","thursday","friday","saturday","sunday")

    for(i in daysOfWeek)
    {
        print("$i ")
    }
    val TDays = daysOfWeek.filter { x -> x[0] == 'T' }
    print("\n\nDays starting with letter ‘T’: ")
    for(i in TDays)
    {
        print("$i ")
    }

    val eContain = daysOfWeek.filter { x -> x.contains('e') }
    print("\n\nDays containing the letter ‘e’: ")
    for(i in eContain)
    {
        print("$i ")
    }

    val SixDays = daysOfWeek.filter { x -> x.length == 6 }
    print("\n\nDays of length 6 : ")
    for(i in SixDays)
    {
        print("$i ")
    }

    print("\n\nPrim Numbers: ")
    for (i in 2..50){

        if(prime(i)){
            print("$i ")
        }
    }
println("\n\n Encoded message: ")
    val list = encode("Alma")
    for(i in list)
    {
        print("$i ")
    }

println("\n Decoded message: ")
    val messageDecoded = decode(list)
    println(messageDecoded)

val listNumber = listOf<Int>(1,2,3,4,5,6,7,8)
print("\nEven Numbers: ")
    even(listNumber)
    print("\n\nDouble the elements of a list: ")
    print(listNumber.map { it*2 })

    print("\n\nPrint the days of week capitalized: ")
    print(daysOfWeek.map { it.uppercase(Locale.getDefault()) })

    print("\n\nPrint the first character of each day capitalized: ")
    print(daysOfWeek.map { it.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() } })

    print("\n\n Print the length of days: ")
    print(daysOfWeek.map { it +" -> "+ it.length+ " " })

    print("\n\n Compute the average length of days: ")
    print(daysOfWeek.map { it.length }.average())

    daysOfWeek.toMutableList()

    val containsN = daysOfWeek.filter { it.contains('n') }
    print("\n\n Remove all days containing the letter ‘n’: ")
     print(daysOfWeek - containsN)

    println("\n\n Print each element of the list in a new line together with the index of the element: ")
    val listWithIndex = daysOfWeek.toList().withIndex()
println(listWithIndex)

    println("\n\n Sort the result list alphabetically: ")
    println(daysOfWeek.sorted())



}