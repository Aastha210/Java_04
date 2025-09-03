package Unit1;

public class SchoolStudent extends student {
    SchoolStudent(int roll_no, String name) {
        super(roll_no,name);
    }
    public void attend_class(){
        System.out.println(name+"is attending offline");
    }
    public void give_exam(){
        System.out.println(name+"is giving exam on pen and paper");
    }
}
