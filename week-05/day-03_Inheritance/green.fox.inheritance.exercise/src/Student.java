public class Student extends Person {

    String previousOrganization;
    int skippedDays;


    public Student() {
        this.setName("Jane Doe");
        this.setAge(30);
        this.setGender(Gender.female);
        this.previousOrganization = "The School of Life";
        this.skippedDays = 0;
    }

    public Student(String name, int age, Gender gender, String previousOrganization) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;
    }

    public void getGoal(){
        System.out.println(goal + "Be a junior software developer.");
    }
    public void introduce(){
        System.out.println(iAm + this.getName() + a + this.getAge() + year + this.getGender() + " from " + this.previousOrganization+ " who skipped " + this.skippedDays  +
                " days from the course already.");
    }
    public void skipDays(int numberOfDays){
        this.skippedDays += numberOfDays;
    }
}
