class car { //parent class
    public void Vehicle(){ //method
        System.out.println("using disel");
    }
}
class bike extends car{//child class
    public void Vehicle(){ //method
        System.out.print("using petrol");
    }
}
public class Energy {//main class
    public static void main (String[]args) {//main method
    car v1 = new car ();//obj creation
    car v2 = new bike ();//obj creation
    v1.Vehicle();//calling the function
    v2.Vehicle();//calling the function
    }
}
