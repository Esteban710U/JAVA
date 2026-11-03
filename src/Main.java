public class Main {
    public static void main (String[] args){
        Perro mi_perro = new Perro();

        mi_perro.nombre = "firulais";
        mi_perro.edad = 10;

        System.out.println("Nombre del perro: " + mi_perro.nombre);
        System.out.println("Edad del perro: " + mi_perro.edad);



        mi_perro.ladrar();
        mi_perro.comer();
        mi_perro.dormir();
        mi_perro.sobrecarga("croquetas");
    }
}

