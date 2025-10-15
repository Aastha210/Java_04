package Unit3;
import java.util.*;
public class LastOccurance {
    public static void main(String[] args)
    {
        int i;
        Scanner sc=new Scanner(System.in);
        ArrayList<String> al= new ArrayList<>();
        String [] item= sc.nextLine().split(" ");
        for( i=0;i<item.length;i++);
        {
            al.add(item[i]);
        }
        String key=sc.nextLine().trim();
        int index = al.indexOf(key);
        System.out.println(index != -1 ? index : "Element not found");
    }
}
