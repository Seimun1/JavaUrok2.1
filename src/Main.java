public class Main {
    public static void main(String[] args) {

        int balance = 600;
        int x = 300; //первое пополнение
        int y = 700; //второе пополнение
        int x1 = balance + x;
        int x2 = balance + y;

        int bonus1;
        if (x1 < 1000)
            System.out.println("Для первого платежа бонуса нет");
        else
            System.out.println("бонус составляет: " + x1/100);

        int bonus2;
        if (x2 < 1000)
            System.out.println("бонуса нет");
        else
            System.out.println("Для второго платежа бонус составляет: " + x2/100 + " рублей");
    }
}