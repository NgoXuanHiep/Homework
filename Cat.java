/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanh;

/**
 *
 * @author USER
 */
class Cat extends Animal{
    String pattern;
    public Cat(int id, String source, String dateOfBirth, String color, String pattern) {

        this.pattern = pattern;
    }
   
    @Override
    public String toString(){
        return super.toString() + ", Pattern: " + pattern;
    }
}


