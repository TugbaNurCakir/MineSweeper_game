import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int dimension1;
    int dimension2;
    int amountOfMine;
    int size;
    boolean isLost = false;
    Scanner input = new Scanner(System.in);
    Random rand = new Random();
    int[][] matris;
    int[][] locationOfMine;

    MineSweeper(int dimension1, int dimension2){
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
        this.size = dimension1*dimension2;
        this.matris = new int[dimension1][dimension2];
        this.locationOfMine = new int[dimension1][dimension2];
        this.amountOfMine = Math.round((dimension1 * dimension2) / 4);
    }

    void startGame() {

        //print table as entered dimentions

        System.out.println("=======================");

        for (int i = 0; i < dimension1; i++) {
            for (int j = 0; j < dimension2; j++) {
                System.out.print(" - ");
            }
            System.out.println();
        }

        //random assignment mine

        for (int i = 0; i < amountOfMine; i++) {
            int randForRow = (int) (rand.nextDouble() * dimension1);
            int randForColumn = (int) (rand.nextDouble() * dimension2);

            if (locationOfMine[randForRow][randForColumn]!=-1) {
                locationOfMine[randForRow][randForColumn] =-1;
            }
        }

        //start game

        do {
            int counter = 0;
            System.out.println("Please enter a row");
            int rowInput = input.nextInt();
            System.out.println("Please enter a column");
            int columnInput = input.nextInt();

            if(rowInput>dimension1 || columnInput>dimension2 || rowInput<0 || columnInput<0){
                System.out.println("Wrong enter!!!");
            }

            if (locationOfMine[rowInput][columnInput]==-1) {
                System.out.println("GAME OVER!!!!!!!");
                System.out.println("*******");
                System.out.println("BOOOOM!");
                System.out.println("*******");
                System.out.println("You Lose!");
                isLost=true;
                break;
            }
            else{
                if(locationOfMine[rowInput][columnInput-1]==-1){
                    counter++;
                }
                if(locationOfMine[rowInput][columnInput+1]==-1){
                    counter++;
                }
                if(locationOfMine[rowInput+1][columnInput]==-1){
                    counter++;
                }
                if(locationOfMine[rowInput+1][columnInput+1]==-1){
                    counter++;
                }
                if(locationOfMine[rowInput+1][columnInput-1]==-1){
                    counter++;
                }
                if(locationOfMine[rowInput-1][columnInput]==-1){
                    counter++;
                }
                if(locationOfMine[rowInput-1][columnInput+1]==-1){
                    counter++;
                }
                if(locationOfMine[rowInput-1][columnInput-1]==-1){
                    counter++;
                }
                locationOfMine[rowInput][columnInput] = counter;
            }
            if(counter==0){
                locationOfMine[rowInput][columnInput] = 0;
            }
            if (counter == (size - size/4)) {
                System.out.println("\nYou Win!");
            }
        } while (isLost == true);
/*
        if(isLost == false) {
            System.out.println("Congratulations!!!!!! You win.");
        }*/


    }
}
