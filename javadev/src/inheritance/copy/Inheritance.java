package inheritance.copy;

class Human {
  String name;
  int age;

  void eat() {}

  void sleep() {}
}


class Student extends Human {
  int studentID;

  void goToSchoool() {}
}


class Worker extends Human {
  int workerID;

  void goToWork() {}
}


public class Inheritance {
  public static void main(String[] args) {
    Human h = new Human();
    h.name = "김현지";
    h.age = 89;
    h.eat();
    h.sleep();


    Student s = new Student();
    s.name = "진광환";
    s.age = 26;
    s.studentID = 343;
    s.eat();
    s.sleep();
    s.goToSchoool();

  }
}
