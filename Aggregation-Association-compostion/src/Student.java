class Subject {
    private String subjectName;

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    Subject(String subjectName) {  // Constructor for the subject class to store the value.
        this.subjectName = subjectName;
    }
}

class Student {
    private int rollNo;
    private String studentName;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    private Subject subject;

    Student(int rollNo, String studentName, Subject subject) {
        this.rollNo = rollNo;
        this.studentName = studentName;
        this.subject = subject;
    }

    public void displayDetails() {
        System.out.println("Student Name: " + this.studentName);  // in this class we can use this from getter and normal student name like (this.studentname)
        System.out.println("Subject Name: " + subject.getSubjectName());
        System.out.println("ROll No:"+getRollNo());

        // We cannot directly access the private member of the class Subject
        // To access the private members of aggregated class, we will have to
        // make use of the getter and setter methods

        // Add the getter and setter methods to class Subject and modify the
        // displayDetails method accordingly

    }

    public static void main(String[] args) {
        Subject subject = new Subject("Maths");
        Student student = new Student(101, "Nate", subject);
        student.displayDetails();
    }
}