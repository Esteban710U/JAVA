public class Sobrecarga {
    public float sumar(float a, float b) {
        return a + b;
    }

    public float sumar(float a, float b, float c) {
        return a + b + c;
    }

    public String serMayor(int edad){
        if(edad>=18){
            return "Eres mayor de edad";
        } else {
            return "Eres menor de edad";
        }
    }
}
