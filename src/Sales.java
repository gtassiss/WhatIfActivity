



import java.util.Scanner;

public class Sales {


    public static void main(String args[]){


        int customerNum;
        String name, taxCode;


            double amount, tax = 0.00, total, subtotal;

            Scanner scan = new Scanner(System.in);


            System.out.println("Enter Customer number: ");
            customerNum = scan.nextInt();

            scan.nextLine();

            System.out.println("Enter customer name: ");
            name = scan.nextLine();

            System.out.println("Enter Sales amount: ");
            amount = scan.nextDouble();

            System.out.println("Enter tax code: ");
            taxCode = scan.next();

            Switch(taxCode.toUpperCase());{
            switch(s) {
                case "NRM":
                    ;

                    tax = 0.06;
                    break;
                case "NPF":
                    ;

                    tax = 0.00;
                    break;
                case "BIZ":
                    ;

                    tax = 0.45;
                    break;
            }

            subtotal = amount * tax;
            total = amount + subtotal;
            System.out.println("Customer ID:" + customerNum);
            System.out.println("Customer Name: " + name);
            System.out.println("Sales Amount: $" + amount);
            System.out.println("Tax Code: " + taxCode.toUpperCase());
            System.out.println("Total Amount Due: $" + total);


        }
    }

    private static s Switch(String s) {
    }
}








