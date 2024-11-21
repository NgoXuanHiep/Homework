
package thuchanh;

class Dog extends Animal{

    private final String breed;
    public Dog(int id, String source, String dateOfBirth, String color, String breed) {
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Dog barks: Woof Woof!");
    }

    @Override
    public String toString() {
        return super.toString() + ", Breed: " + breed;
    }
}


