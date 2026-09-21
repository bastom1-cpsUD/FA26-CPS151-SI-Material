package week4;

public class PetDemo {
    public static void main(String[] args) {
        Pet p1 = new Pet("Biscuit", 3, "Dog");
        Pet p2 = new Pet("Mochi", "Cat");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println("Pets: " + Pet.getNumOfPets());

        try {
            new Pet("", 2, "Fish");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            p1.setAge(-4);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            new Pet("Rex", 5, "");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println(p1);
        System.out.println("Pets: " + Pet.getNumOfPets());
    }
}
