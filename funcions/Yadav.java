class Murali{
    public void face(){
    System.out.println("long nose");
}
}
class Balaji extends Murali {
    @Override
    public void face(){
    System.out.println("big eyes");
}
}
class Gowri extends Murali {
    @Override
    public void face () {
        System.out.println("round face");
    }
}
public class Yadav { 
    public static void main(String[]args){
        Murali fam = new Murali();
        Murali fam1 = new Balaji();
        Murali fam2 = new Gowri();
        fam.face();
        fam1.face();
        fam2.face();
    }
}
       