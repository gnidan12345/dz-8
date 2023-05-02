// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Student student = new Student(0, "Kate", "Marce");
        Student student1 = new Student(0, "Mark", "Basel");
        Student student2 = new Student(0, "Jack", "Hayl");

        Group groupA = new Group(student1,null, null);

        System.out.println(groupA.addTasks("Learn Encapsulation"));
        System.out.println(groupA.addTasks("Learn Loops"));
        groupA.addStudent(student);
        groupA.setMonitor(student);
        System.out.println("The monitor in groupA is " + groupA.getMonitor().toString());
        groupA.addStudent(student1);


        System.out.println(groupA.getStudentList().toString());

        groupA.renameStudent(1, "Gim", "Jaks");

        System.out.println(groupA.getStudentList().toString());
        System.out.println(groupA.getTaskList());

        groupA.markTaskAsDone(student2, "Learn java");
        groupA.markTaskAsDone(student, "Learn Encapsulation");
        groupA.markTaskAsDone(student1, "Learn Java");







    }
}