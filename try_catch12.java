import java.util.*;
public class try_catch12 {
    public static void main(String[] args) {
        int a = 5;
        Scanner in = new Scanner (System.in);
        int b = in.nextInt();
        trycatch(a,b);
    }
    static void trycatch (int divident,int divisor)
    {
        try{
            int quotient = divident/divisor;
            System.out.println(quotient);
        }catch (Exception z) {
            System.out.println("divisor cant be!"+divisor);
        }

        }
    }
