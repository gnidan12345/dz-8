public class Student {

    private static int idBase = 0;

    private int id;

    private String name;

    private String surname;

    public Student(int id, String name, String surname) {
        idBase++;
        this.id = idBase;
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                name +
                " " + surname + '}';
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public int getIdBase() {
        return idBase;
    }

}
