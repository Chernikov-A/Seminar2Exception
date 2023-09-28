import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmptyLineException();





//        ArrayException();
        // getPointFloat();
    }
    // не верно указан exception
    public static void printSum(Integer a, Integer b) throws ArithmeticException {
        System.out.println(a + b);
    }

    // Задание 3
    public static void Exercise3 (){
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2,3,4}; // маленькая длина массима
            abc[3] = 9;
            // не верная иерахия перехватка ошибки
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("то-то пошло не так...");
        }
    }


    // Задание 1
    public static void getPointFloat(){
        boolean valid = true;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        while (valid){
            System.out.println("Введите дробное число: ");
            try {
                float number = Float.parseFloat(bufferedReader.readLine());
                System.out.printf("Введенное число равно %f\n", number);
                valid = false;
            }catch (IOException | NumberFormatException exception){
                System.out.println("Неверный формат ввода. Введите дробное число!");
            }
        }
    }

    // Задание 2. Небыл задан массив. На 0 делить нельзя
        public static void ArrayException(){
            int[] intArray = {1,2,3,4,5,6,7,8,9};
        try {

                int d = 2;
                double catchedRes1 =  (double) intArray[2] / d;
                System.out.println("catchedRes1 = " + catchedRes1);
            } catch (ArithmeticException e) {
                System.out.println("Catching exception: " + e);
            }

        }
        // Задание 4
        public static void EmptyLineException(){
            boolean x = false;
            while (!x){
                System.out.println("Введите текст: ");
                Scanner scanner = new Scanner(System.in);
                String str = scanner.nextLine();

                try {
                    if (str.equals("")){
                        throw new Exception();
                    }
                    System.out.println(" ТЕКСТ: " + str);
                    x = true;
                }catch (Exception e){
                    System.out.println("Пустые строки вводить нельзя");
                }
            }

        }


}