public class StudentRecord {
    static String student_name;
    String department;
    int roll_no;
   //No argument constructor
    StudentRecord(){
        student_name="Sritha";
        department="CSE";
        roll_no=1098;
        System.out.println("Student object created successfully");
    }
    public static void main(String[] args){
        StudentRecord student=new StudentRecord();

        System.out.println("Student name - " +student_name);
        System.out.println("Student department - " +student.department);
        System.out.println("Student Roll No. - " +student.roll_no);


    }
}
