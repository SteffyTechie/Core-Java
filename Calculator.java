import java.util.Scanner;

public class Calculator {

    public static void main(String[] args){

        int number1=0,number2=0,result=0,operator;
do {

    System.out.println("Menu \n 1.ADDITION \n 2.SUBTRACTION \n 3. Exit \n Enter your choice ");

    Scanner sc = new Scanner(System.in);

     operator = sc.nextInt();

if(operator>0 && operator<3)
{
    System.out.println("Enter your first number:");
    number1 = sc.nextInt();

    System.out.println("Enter your Second number:");
    number2 = sc.nextInt();
}

    switch (operator) {
        case 1:

            result = number1 + number2;
            System.out.println("result is:" + result);
            break;

        case 2:
            result = number1 - number2;
            System.out.println("result is:" + result);
            break;

        default:
            System.out.println("invalid number");

    }

}while(operator!=3);
    }

}
