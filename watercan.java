class WaterTank {
    protected int currentLevel = 0; 
    protected final int capacity = 100; 

    public void showLevel() {
        System.out.println("Current Water Level: " + currentLevel + "L");
    }
}


class Inlet extends WaterTank {
    public void fill(int amount) {
        if (currentLevel + amount <= capacity) {
            currentLevel += amount;
            System.out.println("Inlet: Added " + amount + "L of water.");
        } else {
            System.out.println("Inlet: Cannot add water. Tank will overflow.");
        }
    }
}


class Outlet extends WaterTank {
    public void drain(int amount) {
        if (currentLevel - amount >= 0) {
            currentLevel -= amount;
            System.out.println("Outlet: Drained " + amount + "L of water.");
        } else {
            System.out.println("Outlet: Not enough water to drain.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Inlet inlet = new Inlet();
        Outlet outlet = new Outlet();

       
        inlet.fill(40);
        outlet.drain(10);
        inlet.fill(30);
        outlet.drain(50); 
        inlet.fill(50);   

       
        inlet.showLevel();
    }
}

