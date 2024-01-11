public class Main {
    public static void main(String[] args) {

        int balance = 100;
        int amount = 500;
        int bonus;

        if (amount > 1000) {
            bonus = amount / 100 * 1;

        } else {
            bonus = 0;
        }
        balance = balance + amount + bonus;
        System.out.println(balance);
    }
}