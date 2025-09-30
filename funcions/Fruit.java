class Fruits {
    public void taste () {
        System.out.println("these are fruits");
    }
}
class Mango extends Fruits {
    public void taste (){
        System.out.println("Sweet");
    }
}
class Orange extends Fruits {
    public void taste (){
        System.out.println("Sour");
    }
}
public class Fruit {
    public static void main (String[]ags){
        Fruits f1 = new Fruits();
        Fruits f2 = new Mango();
        Fruits f3 = new Orange();
        f1.taste();
        f2.taste();
        f3.taste();
    }
}
