public class Maria extends Supermercado{

    //normales
    public void vender(){
        System.out.println("Maria esta vendiendo en el supermercado");
    }

    public void mercancia(){
        System.out.println("Maria esta pidiendo mercancia en el supermercado");
    }

    public void limpiar(){
        System.out.println("Maria esta limpiando en el supermercado");
    }

    //sobre escritura
    @Override
    public void descansar() {
        System.out.println("Maria esta descansando");
    }

    //interfaz
    public void cambiarUbicacion() {
        System.out.println("Maria cambio el arroz de estateria");
    }

    //sobre carga
    public void descansar(int horas) {
        System.out.println("Maria esta descansando por " + horas + " horas");
    }
}
