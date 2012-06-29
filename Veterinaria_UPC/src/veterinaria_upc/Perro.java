package veterinaria_upc;

public class Perro {
    private String raza;
    private String nombre;
    private int tamanyo;
    private boolean vacunado;

    public Perro(String raza, String nombre, int tamanyo) { //constructor
        this.raza = raza; //this significa que el objeto se refiere a si mismo
        this.nombre = nombre;
        this.tamanyo = tamanyo;
        this.vacunado = false;
    }

    public String getNombre() { //  el metodo get retorna la variable nombre
        return nombre;
    }

    public void setNombre(String nombre) { // el metodo set recibe un valor ...
        this.nombre = nombre; // ... y se la asigna a la variable
    }

    public int getTamanyo() {
        return tamanyo;
    }

    public void setTamanyo(int tamanyo) {
        this.tamanyo = tamanyo;
    }

    public boolean isVacunado() {
        return vacunado;
    }

    public void setVacunado(boolean vacunado) {
        this.vacunado = vacunado;
    }

    public String getRaza() {
        return raza;
    }
    
    
}
