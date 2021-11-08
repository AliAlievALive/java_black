package generics.igra;

public class Main {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Ivan", 13);
        Schoolar schoolar2 = new Schoolar("Mari", 15);
        Schoolar schoolar3 = new Schoolar("Ali", 12);
        Schoolar schoolar4 = new Schoolar("Poppins", 11);

        Student student1 = new Student("Nikola", 20);
        Student student2 = new Student("Ksenya", 21);

        Employee employee1 = new Employee("Zaur", 32);
        Employee employee2 = new Employee("Ali", 34);

        Team<Schoolar> schoolarTeam = new Team<>("Dragons");
        schoolarTeam.addNewParticipant(schoolar1);
        schoolarTeam.addNewParticipant(schoolar2);

        Team<Student> studentTeam = new Team<>("StTeam");
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);

        Team<Employee> employeeTeam = new Team<>("EmplTeam");
        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);

        Team<Schoolar> schoolarTeam2 = new Team<>("Mudreci");
        schoolarTeam.addNewParticipant(schoolar3);
        schoolarTeam.addNewParticipant(schoolar4);
        schoolarTeam2.playWith(schoolarTeam);
    }
}
