import java.util.ArrayList;

public class ListStudents {
    private ArrayList<Student> listStudents = new ArrayList();

    public void addStudent(Student st){
        listStudents.add(st);
    }

    public ArrayList<Student> getListStudents() {
        return listStudents;
    }

    public void setListStudents(ArrayList<Student> listStudents) {
        this.listStudents = listStudents;
    }



}
