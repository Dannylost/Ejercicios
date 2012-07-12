
package juegobatallanaval;

import java.lang.reflect.Array;

public class SimpleDotCom {
    int [] locationCells;
    int numOfHits = 0;
    
	public String checkYourself (String numGuess){
            int guess = Integer.parseInt(numGuess);
            
            String result = "miss";
            
            for (int cell : locationCells){
                if (guess == cell){
                    result = "hit";
                    numOfHits++;
                    break;
                }
            }
            if (numOfHits == locationCells.length){
                result = "kill";
            }
            
            System.out.println(result);
            
            return result;
		
	}

	public void setLocationCells(int[] locationCells) {
		this.locationCells = locationCells;
	}
        
}
