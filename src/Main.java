public class Main {
    public static void main(String[] args) {
        // задача 1
        int paper = 40099;
        System.out.println("Значение переменной paper c типом int равно " + paper);
        byte pencil = 115;
        System.out.println("Значение переменной pencil c типом byte равно " + pencil);
        short apples = 25087;
        System.out.println("Значение переменной apples c типом short равно " + apples);
        long cars = 7542348756456765877L;
        System.out.println("Значение переменной cars c типом long равно " + cars);
        float hours = 7.54f;
        System.out.println("Значение переменной hours c типом float равно " + hours);
        double totalHours = 7.54678904d;
        System.out.println("Значение переменной totalHours c типом double равно " + totalHours);

        //задача 2
        float a = 27.12f;
        System.out.println(a);
        float b = 2.786f;
        System.out.println(b);
        long c = 987678965549L;
        System.out.println(c);
        short d = 569;
        System.out.println(d);
        short e = -159;
        System.out.println(e);
        short f = 27897;
        System.out.println(f);
        byte h = 67;
        System.out.println(h);

        // задача 3
        byte studentsLudmila = 23;
        byte studentsAnna = 27;
        byte studentsKate = 30;
        short papers = 480;
        byte totalStudents = (byte) (studentsLudmila + studentsAnna + studentsKate);
        byte papersStudents = (byte) (papers / totalStudents);
        System.out.println("На каждого ученика рассчитано " + papersStudents + " листов бумаги.");

        // задача 4
        byte bottlesMinutes = 16 / 2;
        short bottles20 = (short) (bottlesMinutes * 20);
        System.out.println("За 20 минут машина произвела " + bottles20 + " штук бутылок");
        short bottles24 = (short) (bottlesMinutes * 1440);
        System.out.println("За 1 сутки машина произвела " + bottles24 + " штук бутылок");
        int bottles3 = (int) (bottlesMinutes * 4320);
        System.out.println("За 3 дня машина произвела " + bottles3 + " штук бутылок");
        int bottles1 = (int) (bottlesMinutes * 43200);
        System.out.println("За 1 месяц машина произвела " + bottles1 + " штук бутылок");

        // задача 5
        byte totalPaint = 120;
        byte paintClass = 2 + 4;
        byte totalClass = (byte) (totalPaint / paintClass);
        byte whitePaint = (byte) (totalClass * 2);
        byte brownPaint = (byte) (totalClass * 4);
        System.out.println("В школе, где " + totalClass + " классов, нужно " + whitePaint + " банок белой краски и " + brownPaint + " банок коричневой краски.");

        // задача 6
        int bananWeight = 5 * 80;
        int milkWeight= 2 * 105;
        int iceWeight = 2 * 100;
        int eggWeight = 4 * 70;
        int totalWeight = (int) (bananWeight + milkWeight + iceWeight + eggWeight);
        System.out.println( "Общий вес спортзавтрака = " + totalWeight + " грамм." );
        float weightKg = totalWeight / 1000f;
        System.out.println( "Общий вес спортзавтрака = " + weightKg + " килограмм." );

        // задача 7
        byte day500 = 7000 / 500;
        System.out.println( day500 + " дней потребуется, если худеть на 500 грамм.");
        byte day250 = 7000 / 250;
        System.out.println( day250 + " дней потребуется, если худеть на 250 грамм.");
        int srDays = ((day500 + day250) / 2);
        System.out.println( srDays + " день потребуется в среднем ");

        // задача 8
        int masha = 67760;
        int denis = 83690;
        int kris = 76230;
        float zpmasha = 67760 * 1.1f;
        float zpdenis = 83690 * 1.1f;
        float zpkris = 76230 * 1.1f;
        float razmasha = (zpmasha - masha) * 12;
        float razdenis = (zpdenis - denis) * 12;
        float razkris = (zpkris - kris) * 12;
        System.out.println("Маша теперь получает " + zpmasha + ". Годовой доход вырос на " + razmasha + " рублей ");
        System.out.println("Денис теперь получает " + zpdenis + ". Годовой доход вырос на " + razdenis + " рублей ");
        System.out.println("Маша теперь получает " + zpkris + ". Годовой доход вырос на " + razkris + " рублей ");
    }
}