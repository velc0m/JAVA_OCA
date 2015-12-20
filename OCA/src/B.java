import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by MaxiM on 19.12.2015.
 */
public class B extends A {

    int a = 2;

    /*public B(int a) throws Exception{
        super(a);
    }*/

    int getA(){
        System.out.println("From B a = " + a);
        return a;
    }

    @Override
    void getB() throws FileNotFoundException{

    }

    @Override
    void getC(){

    }

    public static void main(String[] args) {
        A a = new B();
        //a.getC();
        String str = "Hello world";
        System.out.println((int)'<');
        System.out.println(str.charAt(1));
    }
}
