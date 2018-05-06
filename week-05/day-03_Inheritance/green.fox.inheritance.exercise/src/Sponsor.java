public class Sponsor extends Person {
    String company;
    int hiredStudents;

    public Sponsor() {
        this.setName("Jane Doe");
        this.setAge(30);
        this.setGender(Gender.female);
        this.company = "Google";
        this.hiredStudents = 0;
    }

    public Sponsor(String name, int age, Gender gender, String company) {
        super(name, age, gender);
        this.company = company;
    }

    public void introduce(){
        System.out.println(iAm + this.getName() + a + this.getAge() + year + this.getGender()
                + " who represents " + this.company + " and hired " + this.hiredStudents + " students so far.");
    }
    public void hire(){
        this.hiredStudents += 1;
    }

    public void getGoal(){
        System.out.println(goal + "Hire brilliant junior software developers.");
    }
}
