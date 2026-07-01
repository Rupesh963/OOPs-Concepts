package Encapsulation;

public class Student {

     //Attribute
    public int id;
    private String name;
    public int age;
    public int nos;
    private String gf;

    //getter method
    public String getName(){
        return this.name;
    }

    public String getGf(){
        return this.gf;
    }

    //Default ctor   //attribute ----> set values garbage;
    public Student(){
        System.out.println("Encapsulation.Student default ctor called");
    }

    //parameterised ctor
    public Student(int id, String name, int age, int nos, String gf){
        System.out.println("student parameterised ctor called ");
        this.id = id;
        this.name = name;
        this.age = age;
        this.nos = nos;
        this.gf = gf;
    }

    //copy ctor
//    public Encapsulation.Student(Encapsulation.Student srcobj){
//        System.out.println("student copy ctor called ");
//        this.id = srcobj.id;
//        this.name = srcobj.name;
//        this.age = srcobj.age;
//        this.nos = srcobj.nos;
//    }

    //Behaviours
    public void study(){
        System.out.println(name + " Studying");
    }
    public void sleep(){
        System.out.println(name + " Sleeping");
    }
    public void bunk(){
        System.out.println(name + " Bunking");
    }
    private void gfChatting() {System.out.println(name + " gfchatting");}

}
