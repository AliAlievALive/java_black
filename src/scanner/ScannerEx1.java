package scanner;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
//            System.out.println("Vvedite chislo");
//            int i = scanner.nextInt();
//            System.out.println("Vvedennoe chislo: " + i);
            //
//            System.out.println("Napishite 2 chisla");
//            int x = scanner.nextInt();
//            int y = scanner.nextInt();
//            System.out.println("Chastnoe = " + x/y);
//            System.out.println("Ostatok = " + x%y);
            //
//            System.out.println("Napishite dve stroki");
//            String s1 = scanner.nextLine();
//            String s2 = scanner.nextLine();
//            System.out.println("Vi napisali " + s1);
//            System.out.println("Vi napisali " + s2);
//            System.out.println("Vvedite drobnoe chislo");
//            double d = scanner.nextDouble();
//            System.out.println("Vvedennoe chislo: " + d);
        }
        Scanner scanner = new Scanner("Privet moy drug!\nKak jizn?\nChto horoshego?");
//        String s = scanner.nextLine();
//        System.out.println(s);
//        System.out.println(scanner.nextLine());
//        System.out.println(scanner.nextLine());
//        System.out.println(scanner.nextLine()); Exception
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
    }
}
