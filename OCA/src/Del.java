import Chapter_6.Exception.MyExceptionSubClass;
import Chapter_6.Exception.MyExceptionTop;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.*;

/**
 * Created by Litvv on 17.12.2015.
 */
public class Del {
    static B thread;


    public static void main(String[] args) throws MyExceptionTop {

        A a = new A("a", 11);

        A aa = new A("a", 1);

        HashMap hs = new HashMap();

        hs.put(a, "one");
        hs.put("w", "two");

        a.number = 20;

        System.out.println(hs.get(a));

        a.number = 11;
        System.out.println(hs.get(a));


        System.out.println("---------------------");

        thread = new B();

        Thread th = new Thread(thread);

        th.setDaemon(true);

        th.start();

        System.out.println("Demon = " + th.isDaemon());

        System.out.println("OK is done!");

        System.out.println("-----------2");


    }
}



