import java.util.Scanner;

public class Uppgift {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Count myCount = new Count();
        String words;

        System.out.println("Input word please! Type 'Stop' to finish.");
        words = scan.nextLine();

        while (!myCount.isStop(words)) {
            myCount.increaseLetters(words);
            myCount.increaseRows();
            words = scan.nextLine();

        }


        myCount.print();


    }
}
