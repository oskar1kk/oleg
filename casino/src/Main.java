import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("***********************************");
        System.out.println("🎰 Laipni lūdzam kazino spēlē! 🎰");
        System.out.print("Lūdzu, ievadiet savu vārdu: ");
        String name = sc.nextLine();
        System.out.print("Lūdzu, ievadiet savu vecumu: ");
        int age = 0;
        while (true){
            age = sc.nextInt();
            if (age < 18) System.out.print("❗ Piedodiet, bet Jums nedrīkst spēlēt mūsu kazino spēlēs. ❗");
            else {
                break;
            }
        }
        double balance = 0;
        System.out.print("Lūdzu, ievadiet savu bilanci (EUR vērtībā): ");
        while (true) {
            balance = sc.nextInt();
            if (balance <= 0) System.out.print("❗ Bilancei jābūt pozitīvai vērtībai. ❗");
            else {
                System.out.println("Jūsu bilance ir pieņemta! \uD83D\uDC4D");
                break;
            }
        }
        Player p1 = new Player(name, balance, age);
        try {
            Thread.sleep(1000);
            System.out.println("\n***********************************");
            System.out.println("Jūsu konts ir izveidots! \uD83D\uDC4D ");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Rē kur Jūsu konta informācija: ");
        p1.printInfo();
    }
}