import jdk.jfr.DataAmount

var funds : Double = 100.0
val pswd = "password"

fun main() {
    var input : String
    var cmd : List<String>

    while (true) {
        print("Command: ")
        input = readLine()!!
        cmd = input.split(" ")
        when (cmd[0]) {
            "balance" -> balance()
            "deposit" -> if(cmd.getOrNull(1)!=null){
                deposit(checkAmount(cmd[1]))
            }else{
                println("Invalid amount")
            }
            "withdraw" -> withdraw(checkAmount(cmd[1]))
            else -> println("Invalid command")
        }


    }
}

fun balance(): Unit{
    println("Available funds = $funds")
}

fun deposit(amount: Double): Unit {
    println("Client deposit $amount cedis")
    funds += amount

}

fun withdraw(amount: Double): Unit {
    print("Enter password: ")
    var password = readLine()!!
    if(pswd == password){
        println("Client withdrew $amount cedis")
        if(amount < funds){
            funds -= amount
        }
        else{
            println("Withdrawal amount exceeds available funds: $funds")
        }
    }
    else{
        println("Password is wrong!!")
    }
}

fun checkAmount(amount: String?): Double{
    if (amount.isNullOrEmpty()) {
        println("[-] Transaction failed, amount must be a number")
        return 0.0
    }
    return amount.toDouble()
}