import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to MineSweeper Game!!!!");
       // System.out.println("=======================");


        System.out.print("Please enter first dimension: ");
        int dimension1 = input.nextInt();
        System.out.print("Please enter second dimension: ");
        int dimension2 = input.nextInt();

        MineSweeper mineSweeper = new MineSweeper(dimension1, dimension2);
        mineSweeper.startGame();

    }
}
