public class Juan extends Supermercado{

    public void vender(){
        System.out.println("Juan esta vendiendo en el supermercado");
    }

    public void mercancia(){
        System.out.println("Juan esta pidiendo mercancia en el supermercado");
    }

    public void limpiar(){
        System.out.println("Juan esta limpiando en el supermercado");
    }

    @Override

    public void descansar() {
        System.out.println("Juan esta descansando");
    }

    //sobre carga
    public void Sueno(int horas) {
        System.out.println("Juan esta durmiendo por " + horas + " horas");
    }


    public void cambiarUbicacion() {
        System.out.println("Juan cambio el arroz de estateria");
    }
}
