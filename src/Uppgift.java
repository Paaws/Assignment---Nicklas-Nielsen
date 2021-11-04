import java.util.Scanner;

public class Uppgift {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Count myCount = new Count();
        String words;

        System.out.println("Input word please! Type 'Stop' to finish.");
        words = scan.nextLine(); //Första ordet som matas in

        while (!myCount.isStop(words)) { //Kollar om ordet stop har inmatats
            myCount.increaseLetters(words); //Sparar tecken i metoden increaseLetters
            myCount.increaseRows(); //Sparar rader i metoden increaseRows
            words = scan.nextLine();
        }

        myCount.print();
    }
}
