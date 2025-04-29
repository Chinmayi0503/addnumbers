public class try_catch {
    public static void main(String[] args) {
        int num = 2;
        int[] arr = new int[10];
        for(int i =1; i<=10; i++)
        {
            try
            {
            arr[i-1] = 2*i;
            }
            catch (Exception chinmayi)
         {
        System.out.println("exception is at:" +i+ "where index :" +(i-1)+ "");    
        }
        }

        for(int a : arr)
        {
            System.out.println(a);
        }
    }
}
    
