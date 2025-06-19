interface A {
    default void student() {
        System.out.println("Sa");
    }
}

interface B {
    default void student() {
        System.out.println("vvv");
    }
}

class C implements A, B {
   
    public void student() {
        System.out.println("From Class C");
        A.super.student(); 
        B.super.student(); 
    }

    void display() {
        System.out.println("Names: ");
        student();
    }
}

public class Main {
    public static void main(String[] args) {
        C o = new C();
        o.display();
    }
}