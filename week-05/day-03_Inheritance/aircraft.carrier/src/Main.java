public class Main {
    public static void main(String[] args) {
        Carrier carrier1 = new Carrier(2300, 5000);
       // Carrier carrier1 = new Carrier(13, 5000); throws Exception
        for (int i = 0; i < 4; i++) {
            carrier1.add();
        }
        Carrier carrier2 = new Carrier(2300, 5000);
        for (int i = 0; i < 4; i++) {
            carrier2.add();
        }
        while (carrier1.getHealthPoint() > 0 && carrier2.getHealthPoint() > 0) {
            try {
                carrier1.fill();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            try {
                carrier2.fill();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println("-----------------------------------------------------------------");
            System.out.println("Carrier1: ");
            carrier1.getStatus();
            System.out.println("-----------------------------------------------------------------");
            System.out.println("Carrier2: ");
            carrier2.getStatus();
            carrier1.fight(carrier2);
            carrier2.fight(carrier1);
        }
        if (carrier1.getHealthPoint() <= 0) {
            carrier1.getStatus();
        } else carrier2.getStatus();
    }
}
