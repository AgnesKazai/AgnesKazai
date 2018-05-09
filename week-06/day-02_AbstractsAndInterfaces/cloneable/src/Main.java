//Check out what the Cloneable (java) or ICloneable (.aspx) interface is
//Get your Student class from the Greenfox Organization Exercise
//Make the Student implement the Cloneable interface
//Implement the method, so it clones the student
//Instantiate John, a 20 years old male from BME
//Clone him
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student john = new Student("John Doe", 20, Gender.male, "BME");
        Student johnCopy = (Student) john.clone();

        System.out.println("I'm the copy of John Doe, and my name is: " + johnCopy.getName());
        System.out.println(johnCopy.getAge());
        System.out.println(johnCopy.getGender());
        System.out.println(johnCopy.previousOrganization);
    }
}
