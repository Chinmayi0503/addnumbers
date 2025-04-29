public class if_statement2 {
    public static void main(String[] args) {
        int age = 15;
        if(age > 18 ){
            System.out.println("approved voting");
            if(age < 18){
                System.out.println("is not approved for voting");
            }   
        }
        else if (age > 65){
            System.out.println("the age is big enought to rest in peace");
        }
        else{
            System.out.println("Invalid age plxx enter valid age");
        }
    }
    
}
