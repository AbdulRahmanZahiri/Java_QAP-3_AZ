package Problem1;

public class Teacher extends Person {
    private String subject;
    private double salary;

    // Constructor for Teacher class
    public Teacher(String name, int age, String gender, String subject, double salary) {
        super(name, age, gender);
        this.subject = subject;
        this.salary = salary;
    }

    // Getters
    public String getSubject() {
        return subject;
    }

    public double getSalary() {
        return salary;
    }

    // Setters
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // toString method
    @Override
    public String toString() {
        String formattedSalary = String.format("$%.2f", salary + 1000); 
        return super.toString() + "\nSubject: " + subject + "\nSalary: " + formattedSalary;
    }
}
