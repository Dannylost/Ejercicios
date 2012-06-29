package miprimerprograma;
// Ejemplo 3
public class CancionCerveza {
    public static void main(String[] args) {
		int numeroCervezas = 99;
		String palabra = "botellas";
		
		while(numeroCervezas>0){
			if(numeroCervezas==1){
				palabra = "botella"; //singular, nos queda una sola :O(
			}
			
			System.out.println(numeroCervezas + " " + palabra + " de cerveza en la caja");
			System.out.println(numeroCervezas + " " + palabra + " de cerveza");
			System.out.println("destapemos una");
			System.out.println("Pasemosla a todos");
			numeroCervezas = numeroCervezas -1;
			
			if(numeroCervezas>0){
				System.out.println("quedan " + numeroCervezas + " " + palabra +
						 " de cerveza en la caja");
			} else {
				System.out.println("No hay mas botellas de cerveza en la caja");
			}//fin del else
		} // fin del while

	} // fin del main
}
