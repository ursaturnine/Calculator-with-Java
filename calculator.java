import java.util.Scanner;


class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number ");
        double number1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter the second number ");
        double number2 = scanner.nextDouble();
        scanner.nextLine();


        System.out.println("What operation do you want to perform? ");

        String operation = scanner.nextLine();

        if (operation.equals("sum")){
            System.out.printf("%f + %f = %f", number1, number2, number1 + number2);
        }

        




        scanner.close();




    }
}