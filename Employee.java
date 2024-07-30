public class Employee {
    String Employee_Name;
    String Department;
    int Salary;
//Constructor overloading
    Employee(){
        System.out.println("Employee data was created");
    }

    Employee(String name, String Dep, int Sal){
        Employee_Name=name;
        Department=Dep;
        Salary=Sal;
        System.out.println("Employee Name = " +Employee_Name+" ; Employee Department = " +Department+ " ; Salary" +Salary);

    }
    public static void main(String[] args){
        Employee emp=new Employee();
        Employee emp1=new Employee("Sritha","Sales",45000);
    }
}
