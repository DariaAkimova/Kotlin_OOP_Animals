class Predators (id: Int, name: String, animalClass: String, isWild: Boolean, var meal: String ="Мясо",
                 val weapon: String) : Animals(id, name, animalClass, isWild)  {

       override fun toString(): String {
            return "Predators(id=$id, name=$name, animalClass=$animalClass, isWild=$isWild, meal=$meal, weapon:$weapon)"
        }
    fun describePredator() {
        println("Это хищное животное. Основная пища: $meal. Инструмент для охоты: $weapon.")
    }
}

