class MainEnvironment {
}

fun main(){
    val env = FoodEnvironment(SimpleAgent("Charlie"))
    env.step()
    println(env.scores)
    env.step()
    println(env.scores)
}