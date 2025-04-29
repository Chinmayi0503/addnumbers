import java.util.*; 
import java.io.*;

class revString {

  public static String FirstReverse(String str) 
    {
        StringBuilder revStr = new StringBuilder();
        char[] charArr = str.toCharArray();
        for(int i = (str.length()-1) ; i>=1 ; i--)
        {
            revStr.append(charArr[i]);
        }
    return revStr.toString();
  }

  public static void main (String[] args) {  
        
    Scanner s = new Scanner(System.in);
    System.out.print(FirstReverse(s.nextLine())); 
  }

}