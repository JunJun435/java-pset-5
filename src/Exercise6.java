import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a playing card: ");
        String card = input.nextLine();
        card = card.toUpperCase();

        String firstPart = card.substring(0 , 1);
        String secondPart = card.substring(1 ,2);
        int length = card.length();

        if(length > 2) {
            System.out.println("\nThat's not a valid card.");
        } else {
            switch (firstPart) {
                case ("2"):
                    if (secondPart.equals("C")) {
                        System.out.println("\nTwo of Clubs.");
                    } else if (secondPart.equals("D")) {
                        System.out.println("\nTwo of Diamonds.");
                    } else if (secondPart.equals("H")) {
                        System.out.println("\nTwo of Hearts.");
                    } else if (secondPart.equals("S")) {
                        System.out.println("\nTwo of Spades.");
                    } else {
                        System.out.println("\nThat's not a valid suit.");
                    }
                    break;

                case ("3"):
                    if (secondPart.equals("C")) {
                        System.out.println("\nThree of Clubs.");
                    } else if (secondPart.equals("D")) {
                        System.out.println("\nThree of Diamonds.");
                    } else if (secondPart.equals("H")) {
                        System.out.println("\nThree of Hearts.");
                    } else if (secondPart.equals("S")) {
                        System.out.println("\nThree of Spades.");
                    } else {
                        System.out.println("\nThat's not a valid suit.");
                    }
                    break;

                case ("4"):
                    if (secondPart.equals("C")) {
                        System.out.println("\nFour of Clubs.");
                    } else if (secondPart.equals("D")) {
                        System.out.println("\nFour of Diamonds.");
                    } else if (secondPart.equals("H")) {
                        System.out.println("\nFour of Hearts.");
                    } else if (secondPart.equals("S")) {
                        System.out.println("\nFour of Spades.");
                    } else {
                        System.out.println("\nThat's not a valid suit.");
                    }
                    break;

                case ("5"):
                    if (secondPart.equals("C")) {
                        System.out.println("\nFive of Clubs.");
                    } else if (secondPart.equals("D")) {
                        System.out.println("\nFive of Diamonds");
                    } else if (secondPart.equals("H")) {
                        System.out.println("\nFive of Hearts.");
                    } else if (secondPart.equals("S")) {
                        System.out.println("\nFive of Spades.");
                    } else {
                        System.out.println("\nThat's not a valid suit.");
                    }
                    break;

                case ("6"):
                    if (secondPart.equals("C")) {
                        System.out.println("\nSix of Clubs.");
                    } else if (secondPart.equals("D")) {
                        System.out.println("\nSix of Diamonds.");
                    } else if (secondPart.equals("H")) {
                        System.out.println("\nSix of Hearts.");
                    } else if (secondPart.equals("S")) {
                        System.out.println("\nSix of Spades.");
                    } else {
                        System.out.println("\nThat's not a valid suit.");
                    }
                    break;

                case ("7"):
                    if (secondPart.equals("C")) {
                        System.out.println("\nSeven of Clubs.");
                    } else if (secondPart.equals("D")) {
                        System.out.println("\nSeven of Diamonds.");
                    } else if (secondPart.equals("H")) {
                        System.out.println("\nSeven of Hearts.");
                    } else if (secondPart.equals("S")) {
                        System.out.println("\nSeven of Spades.");
                    } else {
                        System.out.println("\nThat's not a valid suit.");
                    }
                    break;

                case ("8"):
                    if (secondPart.equals("C")) {
                        System.out.println("\nEight of Clubs.");
                    } else if (secondPart.equals("D")) {
                        System.out.println("\nEight of Diamonds.");
                    } else if (secondPart.equals("H")) {
                        System.out.println("\nEight of Hearts.");
                    } else if (secondPart.equals("S")) {
                        System.out.println("\nEight of Spades.");
                    } else {
                        System.out.println("\nThat's not a valid suit.");
                    }
                    break;

                case ("9"):
                    if (secondPart.equals("C")) {
                        System.out.println("\nNine of Clubs.");
                    } else if (secondPart.equals("D")) {
                        System.out.println("\nNine of Diamonds.");
                    } else if (secondPart.equals("H")) {
                        System.out.println("\nNine of Hearts.");
                    } else if (secondPart.equals("S")) {
                        System.out.println("\nNine of Spades.");
                    } else {
                        System.out.println("\nThat's not a valid suit.");
                    }
                    break;

                case ("T"):
                    if (secondPart.equals("C")) {
                        System.out.println("\nTen of Clubs.");
                    } else if (secondPart.equals("D")) {
                        System.out.println("\nTen of Diamonds.");
                    } else if (secondPart.equals("H")) {
                        System.out.println("\nTen of Hearts.");
                    } else if (secondPart.equals("S")) {
                        System.out.println("\nTen of Spades.");
                    } else {
                        System.out.println("\nThat's not a valid suit.");
                    }
                    break;

                case ("J"):
                    if (secondPart.equals("C")) {
                        System.out.println("\nJack of Clubs.");
                    } else if (secondPart.equals("D")) {
                        System.out.println("\nJack of Diamonds.");
                    } else if (secondPart.equals("H")) {
                        System.out.println("\nJack of Hearts.");
                    } else if (secondPart.equals("S")) {
                        System.out.println("\nJack of Spades.");
                    } else {
                        System.out.println("\nThat's not a valid suit.");
                    }
                    break;

                case ("Q"):
                    if (secondPart.equals("C")) {
                        System.out.println("\nQueen of Clubs.");
                    } else if (secondPart.equals("D")) {
                        System.out.println("\nQueen of Diamonds.");
                    } else if (secondPart.equals("H")) {
                        System.out.println("\nQueen of Hearts.");
                    } else if (secondPart.equals("S")) {
                        System.out.println("\nQueen of Spades.");
                    } else {
                        System.out.println("\nThat's not a valid suit.");
                    }
                    break;
                case ("K"):
                    if (secondPart.equals("C")) {
                        System.out.println("\nKing of Clubs.");
                    } else if (secondPart.equals("D")) {
                        System.out.println("\nKing of Diamonds.");
                    } else if (secondPart.equals("H")) {
                        System.out.println("\nKing of Hearts.");
                    } else if (secondPart.equals("S")) {
                        System.out.println("\nKing of Spades.");
                    } else {
                        System.out.println("\nThat's not a valid suit.");
                    }
                    break;
                case ("A"):
                    if (secondPart.equals("C")) {
                        System.out.println("\nAce of Clubs.");
                    } else if (secondPart.equals("D")) {
                        System.out.println("\nAce of Diamonds.");
                    } else if (secondPart.equals("H")) {
                        System.out.println("\nAce of Hearts.");
                    } else if (secondPart.equals("S")) {
                        System.out.println("\nAce of Spades.");
                    } else {
                        System.out.println("\nThat's not a valid suit.");
                    }
                    break;

                default:
                    System.out.println("\nThat's not a valid rank.");
                    break;
            }
        }
        input.close();
    }
}
