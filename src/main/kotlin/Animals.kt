open class Animals (val id: Int, var name: String, var animalClass: String, var isWild: Boolean) {

    override fun toString(): String {
        return "Animals(id=$id, name='$name', animalClass=$animalClass)"
        }
 fun describeAnimal (): String {
     return println("$id - $name, класс: $animalClass").toString()
 }
    fun chooseWildOrNot(): String {
        if (isWild) {
            return println("Это дикое животное").toString()
        }
        return println("Это домашнее животное").toString()
    }
}
