package Unit2;

public class LabdaDemo2 {
    public static void main(String[] args) {
        int a =5;
        Square s = (x) -> x*x;
        System.out.println(s.calculate(a));
    }
}
