
package juegobatallanaval;

import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

public class SimpleDotComTest {
    
    public static void main (String args[]){
        
        SimpleDotCom dot = new SimpleDotCom();
        
        int [] location = {2, 3, 4};
        dot.setLocationCells(location);
        String userGuess = "2";
        String result = dot.checkYourself(userGuess);
        String testresult = "Fallo";
        
        if (result.equals("hit")){
            testresult = "Paso";    
        }
        
        System.out.println(testresult);
    }


}
