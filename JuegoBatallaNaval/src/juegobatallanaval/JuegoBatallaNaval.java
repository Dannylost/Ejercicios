
package juegobatallanaval;

public class JuegoBatallaNaval {

    public static void main(String[] args) {
        GameHelper helper = new GameHelper();
        
        int numGuesses = 0;
        SimpleDotCom guesser = new SimpleDotCom();
        
        int ramdomNum = (int) (Math.random() * 5);
        int [] loc = {ramdomNum,ramdomNum+1,ramdomNum+2};
        
        guesser.setLocationCells(loc);
        
        boolean isAlive = true;
        
        while (isAlive == true){
            String guess = helper.getUserlnput("Ingresa un numero");
            String result = guesser.checkYourself(guess);
            
            numGuesses++;
            
            if (result.equals("kill")){
                isAlive = false;
                System.out.println("Hiciste " + numGuesses + " intentos ...");
            }
        }
        // TODO code application logic here
    }
}
