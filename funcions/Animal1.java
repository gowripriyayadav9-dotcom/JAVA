class Animal {
    public void sound(){
        System.out.println("cat meows");
    }
}
class Dog extends Animal {
    @Override
    public void sound (){
        System.out.println("dog barks");
    }
}
public class Animal1 {
    public static void main(String[]args){
    Animal ani = new Animal();
    Animal ani1 = new Dog();
    ani.sound();
    ani1.sound();
    }
}
