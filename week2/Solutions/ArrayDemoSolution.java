package week2.Solutions;

public class ArrayDemoSolution {

    public static void main(String[] args) {
        //Initialize names and score to size three, with names having "Mark", "Nick", and "John".
        String[] names = {"Mark", "Nick", "John"};
        int[] score = new int[3];
        
        //TODO: intialize everyone's score to 0
        //Don't actually need to do anything since it goes to default, which is zero for int
        for(int i = 0; i < score.length; i++) {
            score[i] = 0;
        }

        //Round 1 - Mark earns 1 point
        System.out.println("=-=-=-=-=Round 1=-=-=-=-=");
        //TODO: increment Mark's score by 1  
        score[0] += 1;

        printScore(names, score);

        //Round 2 - Mark and Nick earn 2 points
        System.out.println("=-=-=-=-=Round 2=-=-=-=-=");
        //TODO: increment Mark and Nick's score by 2
        score[0] += 2;
        score[1] += 2;
        printScore(names, score);
        
        //Round 3 - John earns a point
        System.out.println("=-=-=-=-=Round 3=-=-=-=-=");
        //TODO: increment John's score by 1
        score[2] += 1;
        printScore(names, score);

        //Round 4 - John earns 3 points
        System.out.println("=-=-=-=-=Round 4=-=-=-=-=");
        //TODO: increment John's score by 3
        score[2] += 3;
        printScore(names, score);
        
        //Round 5 - Everyone earns 1 point
        System.out.println("=-=-=-=-=Round 5=-=-=-=-=");
        //TODO: increment everyone's score using a for loop
        for(int i = 0; i < score.length; i++) {
            score[i] += 1;
        }
        printScore(names, score);

        //Final Score
        System.out.println("=-=-=-=Final Score=-=-=-=");
        printScore(names, score);
    }

    public static void printScore(String[] names, int[] score) {
        //TODO: use a for loop to print out the name and score of the player in format (name: score)
        for(int i = 0; i < names.length; i++) {
            System.out.println(names[i] + ": " + score[i]);
        }
        System.out.println();
    }
}