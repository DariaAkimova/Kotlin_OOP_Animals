class PlantEating (id: Int, name: String, animalClass: String, isWild: Boolean, var meal: String ="Растительная пища",
                                   val protection: String) : Animals(id, name, animalClass, isWild)  {
    override fun toString(): String {
        return "PlantEating(id=$id, name=$name, animalClass=$animalClass, isWild=$isWild, meal=$meal, protection:$protection)"
    }

    fun describePlantEating() {
                println("Это травоядное животное. Основная пища: $meal. Инструмент для защиты от хищников: $protection.")
    }
}
