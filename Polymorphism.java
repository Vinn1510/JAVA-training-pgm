class Car {
    String name;
    int num;
}

class Main {
    public static void main(String[] args) {
        Car mycar = new Car();
        mycar.name = "Toyota";
        mycar.num = 2;
        System.out.println(mycar.name);
        System.out.println("Number: " + mycar.num);
    }
}
 ______________________________________________________________
ABCDEFGHIJKLMNOPQRSTUVWXYZ  123456789000/*-+
1234567890-=


https://github.com/Vinn1510/JAVA-training-pgm.git


class Parent {
    String abc = "v";

    public void name() {
        System.out.println("Vinn");
    }
}

class Child extends Parent {
    public void department() {
        System.out.println("AI");
    }
    }

class Chi extends Parent{
    public void college()
    {
        System.out.println("KEC");
    }
}
class Main{
    public static void main(String[] args) {
        Child obj = new Child(); 
        Chi ob=new Chi();
        obj.name();  
        obj.department();
        ob.college();
        System.out.println(obj.abc);  
    }
}
