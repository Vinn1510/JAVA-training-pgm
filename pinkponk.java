public class SyncPrint {
    public static void main(String[] args) {
        System.out.println("pink");

        try {
            Thread.sleep(500); 
        } catch (InterruptedException e) {
            System.out.println("Sleep interrupted");
        }

        System.out.println("ponk");
    }
}

