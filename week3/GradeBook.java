package FA26-CPS151-SI-Material.week3;

public class GradeBook {

    public static void main(String[] args) {
        int[] grades = {95, 104, 78, -3};
        int checked = 0;
        int rejected = 0;

        //TODO: for each grade, try/catch/finally
        for (int g : grades) {
            try {
                recordGrade(g);
            } catch (InvalidGradeException e) {
                System.out.println("Rejected: " + e.getMessage());
                rejected++;
            } finally {
                checked++;
            }
        }

        System.out.println("Checked " + checked + " grades, rejected " + rejected + " grades.");
    }

    static void recordGrade(int grade) throws InvalidGradeException {
        //TODO: throw InvalidGradeException if grade is invalid
        if (grade < 0 || grade > 100) {
            throw new InvalidGradeException("Invalid grade: " + grade);
        }
        // Code to record the valid grade
        System.out.println("Recorded grade: " + grade);
    }
}
