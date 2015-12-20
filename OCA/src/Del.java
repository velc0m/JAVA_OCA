import Chapter_6.Exception.MyExceptionSubClass;
import Chapter_6.Exception.MyExceptionTop;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;

/**
 * Created by Litvv on 17.12.2015.
 */
public class Del {
    static String s;


    public static void main(String[] args) throws MyExceptionTop {

        System.out.println("qwer".charAt(2));

        System.out.println("qwer".substring(4) + "dd");

        int i = 0;
        do{
            System.out.println(" i = " + i);

            System.out.println("i after ++ = " + i);
        } while (i < 2);



    }



    static void m1() throws MyExceptionTop {

        throw new MyExceptionSubClass();

    }
}



