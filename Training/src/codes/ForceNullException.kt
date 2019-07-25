package codes

fun error(){
    println("Entrando no try")
    try{
        val a = 3
        val b = 0
        var c = a/b

    } catch (e: ArithmeticException){
        println("Chegou no ArithmeticException")
    } catch (e: Exception){
        e.stackTrace
    }
}

fun main(args: Array<String>){
    println("Wesley!")
    error()

}