import java.io.IOException;
import java.util.*;


class Main {



    public static void main(String[] args) {
        // Создание простого калькулятора на Java
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int counter = 0;

        while (counter < 3) {
            try {
                System.out.print("Первое число = ");
                a = sc.nextInt();

                System.out.print("Второе число = ");
                b = sc.nextInt();
                break;
            } catch (Exception e) {
                System.out.print("Некоректное число");
                /*System.exit(0);*/
                counter++;
            }
        }

        System.out.println("Оператор (+-/*)");
        String operator = sc.next();
        int res = 0;

        if (b == 0 && Objects.equals(operator, Character.toString('/'))) {
            System.out.println("Операция запрещена!");
            System.exit(0);
        }
        ;

        if (Objects.equals(operator, Character.toString('/'))) {
            res = a / b;
        } else if (Objects.equals(operator, Character.toString('*'))) {
            res = a * b;
        } else if (Objects.equals(operator, Character.toString('+'))) {
            res = a + b;
        } else if (Objects.equals(operator, Character.toString('-'))) {
            res = a - b;
        } else {
            System.out.print("Некорректный операнд.");
        }


        System.out.print("Ответ = " + res);
    }
}
