import Encapsulation.Student;

void main() {
 //Default ctor
//    Encapsulation.Student s1 = new Encapsulation.Student();
//    s1.id = 1;
//    s1.name = "Ramu";
//    s1.age = 14;
//    s1.nos = 5;
//    System.out.println(s1.id);
//    System.out.println(s1.name);
//    System.out.println(s1.age);
//    System.out.println(s1.nos);
//
//    s1.bunk();
//    s1.sleep();
//    s1.study();

 //parameterised ctor
//      Encapsulation.Student s1 = new Encapsulation.Student(1, "Ramu", 14, 5);
//    System.out.println(s1.id);
//    System.out.println(s1.name);
//    System.out.println(s1.age);
//    System.out.println(s1.nos);
//
//    s1.bunk();
//    s1.sleep();
//    s1.study();

 //copy ctor
//    Encapsulation.Student s2 = new Encapsulation.Student (s1);
//    System.out.println(s2.id);
//    System.out.println(s2.name);
//    System.out.println(s2.age);
//    System.out.println(s2.nos);
//
//    s1.sleep();

 //Encapsulation
 Student s1 = new Student(1, "Ramu", 14, 5, "anaya");
 //System.out.println(s1.id);
 System.out.println(s1.getName());
 //System.out.println(s1.age);
 //System.out.println(s1.nos);
 System.out.println(s1.getGf());


 s1.bunk();
 s1.sleep();
 s1.study();
 //s1.gfChatting();

}