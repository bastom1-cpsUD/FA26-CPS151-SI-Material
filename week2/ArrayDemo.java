package week2;

public class ArrayDemo {

    public static void main(String[] args) {
        //Initialize names and score to size three, with names having "Mark", "Nick", and "John".
        String[] names;
        int[] score;
        
        //TODO: intialize everyone's score to 0

        //Round 1 - Mark earns 1 point
        System.out.println("=-=-=-=-=Round 1=-=-=-=-=");
        //TODO: increment Mark's score by 1  

        printScore(names, score);

        //Round 2 - Mark and Nick earn 2 points
        System.out.println("=-=-=-=-=Round 2=-=-=-=-=");
        //TODO: increment Mark and Nick's score by 2

        printScore(names, score);
        
        //Round 3 - John earns a point
        System.out.println("=-=-=-=-=Round 3=-=-=-=-=");
        //TODO: increment John's score by 1

        printScore(names, score);

        //Round 4 - John earns 3 points
        System.out.println("=-=-=-=-=Round 4=-=-=-=-=");
        //TODO: increment John's score by 3

        printScore(names, score);
        
        //Round 5 - Everyone earns 1 point
        System.out.println("=-=-=-=-=Round 5=-=-=-=-=");
        //TODO: increment everyone's score using a for loop

        printScore(names, score);

        //Final Score
        System.out.println("=-=-=-=Final Score=-=-=-=");
        printScore(names, score);
    }

    public static void printScore(String[] names, int[] score) {
        //TODO: use a for loop to print out the name and score of the player in format (name: score)

        System.out.println();
    }
}