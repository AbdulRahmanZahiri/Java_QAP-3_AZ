package Problem1;

public class Demo {
    public static void main(String[] args) {
        // Create objects and print them out to the console using the toString method
        Person bob = new Person("Robert Adams", 28, "M"); 
        System.out.println(bob);

        Student jessica = new Student("Jessica Carter", 17, "F", "HS95130", 3.6); 
        System.out.println(jessica);

        Teacher drSmith = new Teacher("Dr. William Smith", 35, "M", "Computer Science", 51000); 
        System.out.println(drSmith);

        CollegeStudent alex = new CollegeStudent("Alexander Johnson", 19, "F", "UCB124", 4.1, 2, "Mathematics"); 
        System.out.println(alex);
    }
}
