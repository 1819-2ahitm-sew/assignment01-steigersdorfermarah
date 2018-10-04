import java.util.Scanner;

public class Steigersdorfer_Taschenrechner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);




        String input = "";
        int counter = 0;
        String number1 = "";
        String operator = "";
        String number2 = "";
        int ergebnis = 0;


        System.out.println("Calculator");
        System.out.println("===========");
        System.out.println("");


        System.out.print("Eingabe: ");
        input = scanner.nextLine();

        while(!input.equals("quit")) {
            counter++;


            String array[] = input.split(" ");

            number1 = array[0];
            operator = array[1];
            number2 = array[2];


            if (operator.equals("+")) {
                ergebnis = Integer.parseInt(number1) + Integer.parseInt(number2);
                System.out.print("Berechnung: " + input + " = " + ergebnis);

            } else if (operator.equals("-")) {
                ergebnis = Integer.parseInt(number1) - Integer.parseInt(number2);
                System.out.print("Berechnung: " + input + " = " + ergebnis);


            } else if (operator.equals("*")) {
                ergebnis = Integer.parseInt(number1) * Integer.parseInt(number2);
                System.out.print("Berechnung: " + input + " = " + ergebnis);


            } else if (operator.equals("/")) {
                ergebnis = Integer.parseInt(number1) / Integer.parseInt(number2);
                System.out.print("Berechnung: " + input + " = " + ergebnis);
            }


            System.out.println("");
            System.out.print("Eingabe: ");
            input = scanner.nextLine();
        }


        if (input.equals("quit")){
            System.out.println("Es wurden "+ counter + " Berechnungen durchgeführt.");
        }


    }
}



