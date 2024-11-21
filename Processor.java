
package thuchanh;
public class Processor {
    public static void main(String[] args) {
        AnimalList animalList = new AnimalList();
        Dog dog1 = new Dog(1, "", "2020-05-01", "Brown", "husky");
        Dog dog2 = new Dog(2, "My", "2019-08-12", "Black", "Poodle");
        Cat cat1 = new Cat(3, "Phap", "2021-03-15", "White", "Bitbull");
        Cat cat2 = new Cat(4, "Vietnam", "2022-07-22", "Orange", "PhuQuoc");
        animalList.addAnimal(dog1);
        animalList.addAnimal(dog2);
        animalList.addAnimal(cat1);
        animalList.addAnimal(cat2);
        animalList.displayAll();
    }
}
