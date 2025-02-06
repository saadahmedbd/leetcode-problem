package A_Master_OOP;

class students{
    String name;
    int  roll;
    int classs;
}

public class Array_of_object {
    public static void main(String[] args) {
//        creating obj
        students s1=new students();
        s1.name="hridoy";
        s1.roll=1;
        s1.classs=12;

        students s2=new students();
        s2.name="ismail";
        s2.roll=2;
        s2.classs=12;

        students s3=new students();
        s3.name="hannan";
        s3.roll=1;
        s3.classs=12;

//        creating a array for iterate the loop
        students student []=new students[3];
        student[0]=s1;
        student[1]=s2;
        student[2]=s3;

        for(int i=0;i<student.length;i++){
            System.out.println("name " +student[i].name + ":" + "roll "+student[i].roll + ":" + "classs " + student[i].classs);
        }
//        for each or enchnaced loop
        for(students stu : student){
            System.out.println("name " + stu.name);
        }


    }
}
