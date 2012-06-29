package veterinaria_upc;

public class Veterinaria_UPC {

    public static void main(String[] args) {

        Perro perro01 = new Perro("Pitbull", "Fido", 1);
        //Perro perro02 = new Perro("Poodle", "Rambo", 3);
        System.out.println("Me llamo " + perro01.getNombre() );
        //System.out.println("Yo me llamo " + perro02.getNombre() );
        System.out.println("¿Estoy vacunado?: " + perro01.isVacunado() );
        
        Doctor doctor01 = new Doctor("House");
        
        doctor01.vacunarPerro(perro01);
        
        System.out.println("Soy " + perro01.getNombre() + " ¿Estoy vacunado?:  " + perro01.isVacunado());
    }
}
