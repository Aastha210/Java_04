public class collegeStudent extends student1{
    public int roll_no;

    public collegeStudent(String address, int roll_no) {
        super(address);
        this.roll_no = roll_no;
    }
    public void show_roll_no() {
        System.out.println("Roll no "+roll_no);
    }
}
