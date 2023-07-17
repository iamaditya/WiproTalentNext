
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Main {
    class calculator{
        public int add(int a, int b){
            return a+b;
        }
        public int sub(int a, int b){
            return a -b;
        }
    }

    @Test
    public void testadd(){
        calculator c= new calculator();

        assertEquals("Result",5,c.add(3,2));
    }
    @Test
    public void testsub(){
        calculator c= new calculator();

        assertEquals("Result",20,c.sub(100,80));
    }
    public static void main(String[] args) {
//        testadd();

    }

}