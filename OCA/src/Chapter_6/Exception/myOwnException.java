package Chapter_6.Exception;

/**
 * Created by MaxiM on 13.12.2015.
 */
public class myOwnException extends Exception {

    void getMessagegFromMe() {
        System.out.println("From my Exception");
    }
}
