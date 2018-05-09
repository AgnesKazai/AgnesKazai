public class Person  {
    private String name;
    private int age;
    private Gender gender;
    static String goal = "My goal is: ";
    static String iAm = "Hi, I'm ";
    static String year = " year old ";
    static String a = ", a ";

    public Person() {
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = Gender.female;
    }

    public Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void introduce() {
        System.out.println(iAm + this.name + a + this.age + year + this.gender + ".");
    }

    public void getGoal() {
        System.out.println(goal + "Live for the moment.");
    }
}
