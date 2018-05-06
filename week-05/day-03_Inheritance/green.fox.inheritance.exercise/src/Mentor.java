public class Mentor extends Person {
    String level;

    public Mentor() {
        this.setName("Jane Doe");
        this.setAge(30);
        this.setGender(Gender.female);
        this.level = "intermediate";
    }

    public Mentor(String name, int age, Gender gender, String level) {
        super(name, age, gender);
        this.level = level;
    }
    public void getGoal(){
        System.out.println(goal + "Educate brilliant junior software developers.");
    }
    public void introduce(){
        System.out.println(iAm + this.getName() + a + this.getAge() + year + this.getGender() + " " + this.level + " mentor.");
    }






}
