package miprimerprograma;
// Ejemplo 4
public class FabricaDeFrases {

    public static void main(String[] args) {
		// tenemos tres conjuntos de palabras para escoger de ellas
		String[] wordListOne = {"24/7", "multi-Tier",
				"30,000 foot", "B-to-B", "win-win",
				"front-end", "web-based", "pervasive",
				"smart", "six-sigma", "critical-path",
				"dynamic"};
		String[] wordListTwo = {"empowered", "sticky",
				"value-added", "oriented", "centric",
				"distributed", "clustered", "branded",
				"outside-the-box", "positioned",
				"networked", "focused", "leveraged",
				"aligned", "targeted", "shared", 
				"cooperative", "accelerated"};
		
		String[] wordListThree = {"process", "tipping-point",
				"solution", "architecture", "core competency",
				"strategy", "mindshare", "portal", "space",
				"vision", "paradigm", "mission"};
		
		//cuantas palabras hay en cada lista
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLenth = wordListThree.length;
		
		//generar tres numeros aleatorios
		int rand1 = (int) (Math.random() * oneLength);
		int rand2 = (int) (Math.random() * twoLength);
		int rand3 = (int) (Math.random() * threeLenth);
		
		//construir una frase
		String phrase = wordListOne[rand1] + " " +
		   wordListTwo[rand2] + " " + wordListThree[rand3];
		//imprimir la frase de salida
		System.out.println("What we need is a " +
				phrase);
	}    
}
