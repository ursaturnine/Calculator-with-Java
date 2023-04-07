import java.util.Scanner;


class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number ");
        double number1 = scanner.nextDouble();

        System.out.print("Enter the second number ");
        double number2 = scanner.nextDouble();


        System.out.println(number1);
        System.out.println(number2);




        scanner.close();




    }
}