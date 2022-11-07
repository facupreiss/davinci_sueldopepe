public class Main {
    public static void main (String[] args) {
        System.out.println("Sueldo de pepe");

        EmpleadoI pepe = new ConBuenRendimiento (new Cadete());

        System.out.println(String.format("El sueldo total del empleado es %f",
                pepe.calcularSueldoTotal(0)
                ));
    }
}
