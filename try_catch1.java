import java.util.*;
public class try_catch1 {
    public static void main(String[] args) {
        int a = 5;
        Scanner in = new Scanner (System.in);
        int b = in.nextInt();
        try{
            int c = a/b;
            System.out.println(c);
        }
        catch(Exception Chin)
        {
            System.out.println("b cant be:" +b);
        }

    }
    
}
