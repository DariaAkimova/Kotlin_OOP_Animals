fun main(args: Array<String>) {
    val appDataBase = AppDataBase()

    val repository = AnimalRepository(appDataBase)

    println(repository.getAll())
    }
