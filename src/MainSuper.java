public class MainSuper {
    public static void main (String[] args){
        Juan juan = new Juan();

        juan.nombre = "Juan Perez";
        juan.edad = 30;

        System.out.println("Nombre del trabajador: " + juan.nombre);
        System.out.println("Edad del trabajador: " + juan.edad);

        juan.vender();
        juan.descansar();
        juan.Sueno(8);
    }
}

