/**
 * Created by valentyn on 1/16/15.
 */
import java.lang.*;
import org.apache.log4j.Logger;
public class A {
    static Logger log = Logger.getLogger( A.class );
    public void message() {
        log.debug("For Debug");
        log.info("Deep information");
        log.fatal("Fuck");
        log.warn("dung");
    }
    public static void main(String[] args){
        
        System.out.println("Hello world");
        A a = new A();
        a.message();
    }
}
