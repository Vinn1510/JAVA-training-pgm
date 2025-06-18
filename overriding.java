class Parent 
{
    void greet()
    {
        System.out.println("gm");
    }
}
class Child extends Parent{
    void greet(String name)
    {
        System.out.println("gm" +name);
    }
}
class Main{
    public static void main(String[] args)
    {
        Child c = new Child();
        c.greet();
        c.greet("vi");
    }
}