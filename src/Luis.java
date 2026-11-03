public class Luis extends Supermercado{
    //normales
    public void vender(){
        System.out.println("Luis esta vendiendo en el supermercado");
    }

    public void mercancia(){
        System.out.println("Luis esta pidiendo mercancia en el supermercado");
    }

    public void limpiar(){
        System.out.println("Luis esta limpiando en el supermercado");
    }

    //sobre escritura
    @Override
    public void descansar() {
        System.out.println("Luis esta descansando");
    }

    //interfaz
    public void cambiarUbicacion() {
        System.out.println("Luis cambio el arroz de estateria");
    }

    //sobre carga
    public void descansar(int horas) {
        System.out.println("Luis esta descansando por " + horas + " horas");
    }
}
