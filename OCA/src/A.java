import java.io.IOException;

/**
 * Created by MaxiM on 19.12.2015.
 */
public class A {
    public int a = 1;

    /*public A(int a) throws IOException {
        this.a = a;
    }*/

    void getB() throws IOException {

    }

    void getC() throws Exception{

    }

    int getA() {
        System.out.println("From A a = " + a);
        return a;
    }
}

