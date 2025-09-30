class Animal {
    public void sound(){
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal {
    public void sound(){
        System.out.println("dog barks"); 
}
}
public class Example {
    public static void main (String[]args){
        Animal myAnimal = new Animal ();
        Animal myDog = new Dog ();
        myAnimal.sound ();
        myDog.sound();
    }
s