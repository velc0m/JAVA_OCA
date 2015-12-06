package Chapter_3;

/**
 * Created by MaxiM on 06.12.2015.
 */
public class Del {


    public static void main(String[] args) {
       int a = 5;
       if(a++ > 5 || ++a > 6) ++a;
        System.out.println(a);
    }

}
