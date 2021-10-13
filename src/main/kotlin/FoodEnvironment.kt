class FoodEnvironment(vararg ags : Actor) : Environment(*ags) {
    val scores: MutableMap<Actor, Int> = mutableMapOf()

    init {
        for (agent in ags) {
            scores[agent] = 0
        }
    }

    override fun processAction(agent: Actor, act: Action) {
        if (scores.containsKey(agent)) {
            if (act is ForageAction) {
                scores[agent] = scores[agent]?.plus(1) ?: 0
            }
        }
    }

    override fun sense(agent: Actor) {

    }
}