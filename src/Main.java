public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

    }
}
//1

class Persona{
    private int edad;
    private String nombre;
    private int telefono;

}
//2
class Cliente extends Persona{
    int credito;
}
//3
class Trabajador extends Persona{
    int salario;
}