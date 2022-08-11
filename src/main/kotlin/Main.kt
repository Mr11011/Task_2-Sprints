import java.util.Scanner;
fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    print("Enter your size>> ")
    var size = sc.nextInt()
    sc.nextLine()
    var list = mutableListOf<String>()
    while (size > 0) {
        println("Enter your list: ")
        var input = sc.next()
        list.add(input)
        size--
    }

    var filter1= list.filter {
        it.contains("a" )
    }

    var filter2= list.filter{
        it.contains("m")
    }
    filter1.forEach(){
        println("The List of uppercase names: ${it.uppercase()}")
    }
}

//    filter2.forEach(){
//
//        println("The List of uppercase names: ${it.uppercase()}")}
//
//
//    }



