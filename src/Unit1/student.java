package Unit1;

public abstract class student {
    int roll_no;
    public String name;
    //    static String sec = "AI-A";
//    student()
//    {
//        System.out.println("I am default");
//    }
    student(int roll_no,String name)
    {
//        int id = 8;
//        System.out.println(id);
//        name=n;
//        roll_no=r;
        this.roll_no = roll_no;
        this.name = name;
    }
    abstract void attend_class();
    abstract void give_exam();
//    void display()
//    {
//        System.out.println("Name is "+name);
//        System.out.println("Roll Number is "+roll_no);
//    }
    void register() {
        System.out.println("Name is "+name+" is registered successfully with roll no "+roll_no);
    }
}