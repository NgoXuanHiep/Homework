/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanh;

import java.util.ArrayList;

public class AnimalList  {
     ArrayList<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }
    public void displayAll() {
        for (Animal animal : animals) {
            System.out.println(animal);
            animal.makeSound();
        }
    }
}

 
       
    

