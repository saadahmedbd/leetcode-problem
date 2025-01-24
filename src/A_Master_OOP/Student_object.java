package A_Master_OOP;

public class Student_object {
    private String name;
    private String university;
    private String subject;
//    constructor
    public  Student_object(String name, String university, String subject){
        this.name=name;
        this.university=university;
        this.subject=subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public static void main(String[] args) {
//        That is student object
        Student_object student =new Student_object("saad", "national university", "CSE");
        Student_object student2=new Student_object("rassel", "daffodil", "BBA");
        Student_object student3 =new Student_object("hridoy", "NSU","CSE");
        System.out.println(student.getName());

//        declaring a variable to refer to an object
//        type name;
//        Student_object student;

//        instantiating a class
//        the new operator instantiaties a class by allocating memory for a new object and returning a reference to that
//        memory new operator also invokes the object constructor.
//        for example : Student_object student =new student_object ("saad", "national", "CSE")
//        new keyword to create student object

//        initialize an object
//        the new keyword if followed by a call to a constructor , which initializes the new object
    }


}
