/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multilevelinheritance;

/**
 *
 * @author USER
 */
public class MultilevelInheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        class Grandparent:
    def legacy(self):
        print("Grandparent's legacy")

class Parent(Grandparent):
    def care(self):
        print("Parent cares")

class Child(Parent):
    def learn(self):
        print("Child learns")

    }
    
}
