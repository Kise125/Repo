public class Student {
    private int id;
    private  String firstName;
    private String gender;
    private String gpa;
    private String email;

    public Student(int id, String first_name, String gpa, String gender, String email) {
        this.id = id;
        this.firstName = first_name;
        this.gpa = gpa;
        this.gender = gender;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getGpa() {
        return gpa;
    }

    public void setGpa(String gpa) {
        this.gpa = gpa;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", first_name='" + firstName + '\'' +
                ", gpa='" + gpa + '\'' +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                '}'+"\n";
    }
}
