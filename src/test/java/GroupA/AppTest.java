package GroupA;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{


    public static void main(String[] args) {
        AppMainTest app = new AppMainTest();
        if(app.other(2,3) == 5) {
            System.out.println("Nice math bruh");
        } else {
            System.out.println("Dumb");
        }
    }



    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }


}
