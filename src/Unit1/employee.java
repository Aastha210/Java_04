package Unit1;

public class employee {
    int emp_id;
    String emp_name;
    double emp_salary;
    static String emp_org = "TCS";
    public employee(int emp_id, String emp_name, double emp_salary) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_salary = emp_salary;
    }

    public void display(){
        emp_org = "Infosys";
        System.out.println("EMP ID: "+emp_id);
        System.out.println("EMP NAME: "+emp_name);
        System.out.println("EMP SALARY: "+emp_salary);
        System.out.println("EMP ORGANISATION: "+emp_org);
    }
    public static void emp_info() {
        System.out.println(emp_org);
    }
}
