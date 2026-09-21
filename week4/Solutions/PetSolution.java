package week4.Solutions;

public class PetSolution {
    private static int numOfPets = 0;
 
    private String name;
    private int age;
    private String animalType;
 
    public PetSolution(String name, int age, String animalType) {
        setName(name);
        setAge(age);
        setAnimalType(animalType);
        numOfPets++;       // only reached if all 3 passed
    }
 
    public PetSolution(String name, String animalType) {
        this(name, 0, animalType);
    }
 
    public static int getNumOfPets() { return numOfPets; }
 
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getAnimalType() { return animalType; }
 
    public String toString() {
        return name + " the " + animalType + ", age " + age;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException(
                "Name cannot be empty");
        }
        this.name = name;
    }
 
    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException(
                "Age cannot be negative");
        }
        this.age = age;
    }
 
    public void setAnimalType(String animalType) {
        if (animalType == null || animalType.isEmpty()) {
            throw new IllegalArgumentException(
                "Animal type cannot be empty");
        }
        this.animalType = animalType;
    }
}
