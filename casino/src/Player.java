import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    private String name;
    private double balance;
    private int age;

    public Player(String name, double balance, int age) {
        this.name = name;
        this.balance = balance;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("\n🎲 Sveicināts kazino, " + name + "!");
        System.out.printf("💰 Tava bilance: %.2f EUR\n", balance);
        System.out.println("🔗 Spēļu vēsture: (šobrīd tukša)\n");
    }

    public void updateBalance() {
        Scanner sc = new Scanner(System.in);
        System.out.println("***********************************");
        System.out.println("💰 Cik naudas Jūs gribat ielikt sava kontā?");
        int dodep = 0;
        while (true) {
            dodep = sc.nextInt();
            if (dodep <= 0) System.out.println("Mēģiniet vēlreiz.");
            else {
                try {
                    balance += dodep;
                    System.out.println("Mirkli...");
                    Thread.sleep(1000);
                    System.out.println("Jūsu bilance ir atjaunota! \uD83D\uDC4D");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public void showBalance() {
        System.out.println("💰 Šobrīd tavā kontā ir " + balance + "EUR.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
