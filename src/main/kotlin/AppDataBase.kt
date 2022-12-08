class AppDataBase {
    val list = mutableListOf<Animals>()

    init {

        val wolf = Predators(id = 0, name = "Кошка", animalClass = "Млекопитающее", isWild = false, weapon = "Когти")
//        wolf.describeAnimal()
//        wolf.chooseWildOrNot()
//        wolf.describePredator()
        list.add(wolf)

        val eagle = Predators(id = 1, name = "Орел", animalClass = "Птицы", isWild = true, weapon = "Когти, клюв")
//        eagle.describeAnimal()
//        eagle.chooseWildOrNot()
//        eagle.describePredator()
        list.add(eagle)

        val butterfly = PlantEating(id = 2, name = "Бабочка", animalClass = "Насекомые", isWild = true, protection = "Мимикрия, яд")
//        butterfly.describeAnimal()
//        butterfly.chooseWildOrNot()
//        butterfly.describePlantEating()
        list.add(butterfly)

        val giraffe = PlantEating(id = 3, name = "Жираф", animalClass = "Млекопитающие", isWild = true, protection = "Масса тела, копыта, быстрый бег")
//        giraffe.describeAnimal()
//        giraffe.chooseWildOrNot()
//        giraffe.describePlantEating()
        list.add(giraffe)
    }
}




