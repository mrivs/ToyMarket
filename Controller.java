import java.util.Scanner;

public class Controller {
    static Scanner scanner = new Scanner(System.in);
    private static String menu = "1. Добавить игрушек в лотерею 2. Разыграть лотерею  3. Разыграть вероятнось 4. Изменить вероятнось 5. Записать файл призов 6. Выход";
    private static String addlotterymenu = "1. Добавить конструктор  2. Добавить мягких 3. Добавить электро 4. Добавить конфет";

    static void start() {
        while (true) {
            System.out.println(menu);
            int n = input();
            if (n == 1) {
                System.out.println(addlotterymenu);
                addlotter();
            } else if (n == 2) {
                System.out.println(ToyAutomat.getToyfromLott());
            } else if (n == 3) {
                System.out.println(ToyAutomat.getToyfromProbability());
            } else if (n == 4) {
                setProb();
            } else if (n == 5) {
                if (Writer.Write(ToyAutomat.getprizes())) {
                    System.out.println("Призы записаны!");
                } else
                    System.out.println("Ошибка записи");
            } else if (n == 6) {
                break;
            }
        }
    }

    static void addlotter() {
        int n = input();
        int k = 0;
        if (n == 1) {
            System.out.println("Введите количество конструкторов ");
            k = input();
            ToyAutomat.addToytoLott(k, "Constructor");
        } else if (n == 2) {
            System.out.println("Введите количество магких игрушек ");
            k = input();
            ToyAutomat.addToytoLott(k, "SoftToy");
        } else if (n == 3) {
            System.out.println("Введите количество электро игрушек ");
            k = input();
            ToyAutomat.addToytoLott(k, "ElectroToy");
        } else if (n == 4) {
            System.out.println("Введите количество конфет ");
            k = input();
            ToyAutomat.addToytoLott(k, "Sweet");
        }
    }

    static void setProb(){
        System.out.println("Введите вероятность выпадения конструктора (%)");
        int c = input();
        System.out.println("Введите вероятность выпадения мягкой игрушки(%) ");
        int s = input();
        System.out.println("Введите вероятность выпадения электро игрушки(%) ");
        int e = input();
        if (c + s + e > 100) {
            int sum = c + s + e;
            c = c * 100 / sum;
            s = s * 100 / sum;
            e = e * 100 / sum;
            System.out.println("Сумма не должна превышать 100 % будут введены значения "+c+" "+s+" "+e ); 
        }
        ToyAutomat.setProbs(c, s, e);
    }

    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static int input() {
        int inp;
        String input = scanner.nextLine();
        if (isInteger(input)) {
            inp = Integer.parseInt(input);
        } else {
            inp = 0;
        }
        if (inp<0) inp=0;
        return inp;
    }
    //
}
