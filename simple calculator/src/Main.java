
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double INR = 0;
        double USD = 0;
        double EUR = 0;
        double UAE = 0;
        double JAP = 0;


        System.out.println("1. INR ");
        System.out.println("2. USD ");
        System.out.println("3. EUR ");
        System.out.println("4. UAE ");
        System.out.println("5. JAP ");

        System.out.println("select ur currency :");

        int choice = scanner.nextInt();
        double result = 0;

        switch (choice) {
            case 1:

                 USD = 0.012;
                 EUR = 0.01111111;
                 UAE = 0.043;
                 JAP = 1.79;

                System.out.println("enter ur amount :");
                int INRamount = scanner.nextInt();

                System.out.println("select to convert in which currency :");

                System.out.println("1. USD ");
                System.out.println("2. UAE ");
                System.out.println("3. EUR ");
                System.out.println("4. JAP ");
                System.out.println("5. ALL CURRENCY");

                int INRconvertchoice = scanner.nextInt();

                switch (INRconvertchoice) {
                    case 1:
                        result = INRamount * USD;
                        System.out.println("Your amount in USD is : " + result);
                        break;

                    case 2:
                        result = INRamount * UAE;
                        System.out.println("Your amount in UAE is : " + result);
                        break;

                    case 3:
                        result = INRamount * EUR;
                        System.out.println("Your amount in EUR is : " + result);
                        break;

                    case 4:
                        result = INRamount * JAP;
                        System.out.println("Your amount in JAP is : " + result);
                        break;

                    case 5:
                        System.out.println("Your amount in UAE is :" + INRamount * UAE);
                        System.out.println("Your amount in JAP is :" + INRamount * JAP);
                        System.out.println("Your amount in USD is :" + INRamount * USD);
                        System.out.println("Your amount in EUR is :" + INRamount * EUR);
                        break;

                    default:
                        System.out.println("invalid input");
                        break;


                }
                break;

            case 2:

                INR = 84.47;
                EUR = 0.95;
                UAE = 3.67;
                JAP = 151.50;

                System.out.println("enter ur amount :");
                int USDamount = scanner.nextInt();

                System.out.println("select to convert in which currency :");

                System.out.println("1. INR ");
                System.out.println("2. UAE ");
                System.out.println("3. EUR ");
                System.out.println("4. JAP ");
                System.out.println("5. ALL CURRENCY");

                int USDconvertchoice = scanner.nextInt();

                switch (USDconvertchoice) {
                    case 1:
                        result = USDamount * INR;
                        System.out.println("Your amount in USD is : " + result);
                        break;

                    case 2:
                        result = USDamount * UAE;
                        System.out.println("Your amount in UAE is : " + result);
                        break;

                    case 3:
                        result = USDamount * EUR;
                        System.out.println("Your amount in EUR is : " + result);
                        break;

                    case 4:
                        result = USDamount * JAP;
                        System.out.println("Your amount in JAP is : " + result);
                        break;

                    case 5:
                        System.out.println("Your amount in INR is :" + USDamount * INR);
                        System.out.println("Your amount in JAP is :" + USDamount * JAP);
                        System.out.println("Your amount in UAE is :" + USDamount * UAE);
                        System.out.println("Your amount in EUR is :" + USDamount * EUR);
                        break;

                    default:
                        System.out.println("invalid input");
                        break;
                }
                break;

            case 3:

                INR = 89.16 ;
                USD = 1.06;
                UAE = 3.88;
                JAP = 159.92;

                System.out.println("enter ur amount :");
                int EURamount = scanner.nextInt();

                System.out.println("select to convert in which currency :");

                System.out.println("1. INR ");
                System.out.println("2. UAE ");
                System.out.println("3. USD ");
                System.out.println("4. JAP ");
                System.out.println("5. ALL CURRENCY");

                int EURconvertchoice = scanner.nextInt();

                switch (EURconvertchoice) {
                    case 1:
                        result = EURamount * INR;
                        System.out.println("Your amount in INR is : " + result);
                        break;

                    case 2:
                        result = EURamount * UAE;
                        System.out.println("Your amount in UAE is : " + result);
                        break;

                    case 3:
                        result = EURamount * USD;
                        System.out.println("Your amount in USD is : " + result);
                        break;

                    case 4:
                        result = EURamount * JAP;
                        System.out.println("Your amount in JAP is : " + result);
                        break;

                    case 5:
                        System.out.println("Your amount in INR is :" + EURamount * INR);
                        System.out.println("Your amount in JAP is :" + EURamount * JAP);
                        System.out.println("Your amount in USD is :" + EURamount * USD);
                        System.out.println("Your amount in UAE is :" + EURamount * UAE);
                        break;

                    default:
                        System.out.println("invalid input");
                        break;
                }
                break;

            case 4:

                INR = 23 ;
                USD = 0.27;
                EUR = 0.26;
                JAP = 41.27;

                System.out.println("enter ur amount :");
                int UAEamount = scanner.nextInt();

                System.out.println("select to convert in which currency :");

                System.out.println("1. INR ");
                System.out.println("2. EUR ");
                System.out.println("3. USD ");
                System.out.println("4. JAP ");
                System.out.println("5. ALL CURRENCY");

                int UAEconvertchoice = scanner.nextInt();

                switch (UAEconvertchoice) {
                    case 1:
                        result = UAEamount * INR;
                        System.out.println("Your amount in INR is : " + result);
                        break;

                    case 2:
                        result = UAEamount * EUR;
                        System.out.println("Your amount in EUR is : " + result);
                        break;

                    case 3:
                        result = UAEamount * USD;
                        System.out.println("Your amount in USD is : " + result);
                        break;

                    case 4:
                        result = UAEamount * JAP;
                        System.out.println("Your amount in JAP is : " + result);
                        break;

                    case 5:
                        System.out.println("Your amount in INR is :" + UAEamount * INR);
                        System.out.println("Your amount in JAP is :" + UAEamount * JAP);
                        System.out.println("Your amount in USD is :" + UAEamount * USD);
                        System.out.println("Your amount in EUR is :" + UAEamount * EUR);
                        break;

                    default:
                        System.out.println("invalid input");
                        break;
                }
                break;

            case 5:

                INR = 0.56 ;
                USD = 0.0066;
                UAE = 0.024;
                EUR = 0.0063;

                System.out.println("enter ur amount :");
                int JAPamount = scanner.nextInt();

                System.out.println("select to convert in which currency :");

                System.out.println("1. INR ");
                System.out.println("2. UAE ");
                System.out.println("3. USD ");
                System.out.println("4. EUR ");
                System.out.println("5. ALL CURRENCY");

                int JAPconvertchoice = scanner.nextInt();

                switch (JAPconvertchoice) {
                    case 1:
                        result = JAPamount * INR;
                        System.out.println("Your amount in INR is : " + result);
                        break;

                    case 2:
                        result = JAPamount * UAE;
                        System.out.println("Your amount in UAE is : " + result);
                        break;

                    case 3:
                        result = JAPamount * USD;
                        System.out.println("Your amount in USD is : " + result);
                        break;

                    case 4:
                        result = JAPamount * EUR;
                        System.out.println("Your amount in EUR is : " + result);
                        break;

                    case 5:
                        System.out.println("Your amount in INR is :" + JAPamount * INR);
                        System.out.println("Your amount in UAE is :" + JAPamount * UAE);
                        System.out.println("Your amount in USD is :" + JAPamount * USD);
                        System.out.println("Your amount in EUR is :" + JAPamount * EUR);
                        break;

                    default:
                        System.out.println("invalid input");
                        break;
                }
                break;


        }


        scanner.close();

    }
}




