public class StudentsMark {
    String Student_name;
    int total_mark;

     //parameterized constructor
     StudentsMark(String name , int total){
         Student_name=name;
         total_mark=909;

     }
     //method
     public void StudentMarkList(){
         System.out.println("Student name is " +Student_name + " and total mark is " +total_mark);

     }
     public static void main(String[] args){
         StudentsMark Mark1=new StudentsMark("Sritha",489);
         Mark1.StudentMarkList();
         StudentsMark Mark2=new StudentsMark("Pravin",450);
         Mark2.StudentMarkList();
         StudentsMark Mark3=new StudentsMark("Dheethya",499);
         Mark3.StudentMarkList();

     }
}
