public class Perro extends Animal {
    public void ladrar() {
        System.out.println("El perro esta ladrando");
    }

    @Override
    public void hacerSonido() {
        System.out.println("El perro esta haciendo guau");
    }


    //sobre carga
    public void sobrecarga(String comida) {
        System.out.println("El perro esta comiendo " + comida);
    }
}
