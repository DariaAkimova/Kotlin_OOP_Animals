class AnimalRepository constructor(private val appDataBase: AppDataBase){

    fun getAll(): MutableList<Animals> {
        return appDataBase.list
    }

    fun findById(id: Int): Animals? {
        return appDataBase.list.find { it.id == id}
    }

    fun insert(animal: Animals): Unit{
        appDataBase.list.add(animal)
    }

    fun delete(animal: Animals){
        appDataBase.list.remove(animal)
    }

    fun update(animal: Animals){
        val animal = findById(animal.id)
        if (animal != null){
            val index = appDataBase.list.indexOf(animal)
            appDataBase.list[index] = animal
        }
    }

}