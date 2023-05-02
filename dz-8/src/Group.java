import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Group {

    private Student monitor;

    private ArrayList<Student> students;

    private ArrayList<String> tasks;

    private Map<Student, ArrayList<String>> completedTasks;

    public Group(Student monitor, ArrayList<Student> studentList, ArrayList<String> taskList) {
        this.monitor = monitor;
        this.students = new ArrayList<>();
        this.tasks = new ArrayList<>();
        this.completedTasks = new HashMap<>();
    }

    public Student getMonitor() {
        return monitor;
    }

    public void setMonitor(Student monitor) {
        this.monitor = monitor;
    }



    public ArrayList<Student> getStudentList() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void renameStudent(int id, String name, String surname) {
        for (Student student : students
        ) {
            if (id == student.getId()) {
                student.setName(name);
                student.setSurname(surname);
            }
        }

    }

    public ArrayList<String> getTaskList() {
        return tasks;
    }

    public String addTasks(String task) {
        tasks.add(task);
        return task;


    }


    public void markTaskAsDone(Student student, String task) {

        if (!completedTasks.containsKey(student)) {
            completedTasks.put(student, new ArrayList<>());
        }
        completedTasks.get(student).add(task);

        System.out.println(student.getSurname() + " completed " + task);

        System.out.println(completedTasks);


    }


}




        









