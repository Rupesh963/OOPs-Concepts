//package AbstractDesign;
//
//abstract class Bird{
//
//    abstract void fly();
//
//    abstract void eat();
//}
//
//class sparrow extends Bird {
//
//
//    @Override
//    void fly() {
//        System.out.println("Sparrow flying");
//    }
//
//    @Override
//    void eat() {
//        System.out.println("Sparrow eating");
//    }
//}
//
//public class Main {
//    static void main(String[] args) {
//        Bird v = new sparrow();
//        v.eat();
//        v.fly();
//    }
//}

//Interface
package AbstractDesign;

interface Bird{

     void fly();

     void eat();
}

class sparrow implements Bird {


    @Override
    public void fly() {
        System.out.println("Sparrow flying");
    }

    @Override
    public void eat() {
        System.out.println("Sparrow eating.");
    }
}

public class Main {
    static void main(String[] args) {
        Bird v = new sparrow();
        v.eat();
        v.fly();
    }
}


