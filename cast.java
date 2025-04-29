public class cast {
   public static void main(String[] args) {
    //explicit casting
    double p = 99.7;
    double fp = p+12;
    System.out.println(fp);

    float n = 22.2f;
    float np = n+12;
    System.out.println(np);

    //implicit
    int j =66;
    double ip = n+(int)10;
    System.out.println(ip);

    int k = 77;
    double kp = k+(int)6;
    System.out.println(kp);

    double w = 10.88;
    System.out.println(w);
    // output will be in double 
    int i = (int)w;
    System.out.println(k);
   } 
}
