/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgthis.pkgsuper.learning;

/**
 *
 * @author asus
 */

    public class Employee extends Person{
    float salary = 4000f;
    String name = "Andrew Tate";
    int age = 39;
    
    public void showInfosuper(){
        System.out.println("=======SUPER=======");
        System.out.println("Nama : " + super.name);
        System.out.println("Umur : " + super.age);
        System.out.println("Salary : $" + salary);
    }
    
    public void showInfothis(){
        System.out.println("=======THIS=======");
        System.out.println("Nama : " + this.name);
        System.out.println("Umur : " + this.age);
        System.out.println("Salary : " + salary);
    }
}

