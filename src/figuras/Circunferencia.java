package figuras;

/**
 * @author Natividad Díaz García
 *   Clase circunferencia y sus métodos.
 */


public class Circunferencia {
    private double radio;
    private String color;

    public Circunferencia(double radio) {
        this.radio = radio;
    }
    public void imprimir() {
        color = "rojo";
        System.out.println("Di�metro: " + 2 * radio);
        System.out.println("Color: " + color);
        double area1 = 2 * 3.1416 * radio * radio;
        double area = area1;

        System.out.println(area);
    }

    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    public boolean esIgual(boolean considerarDecimales, Circunferencia otro) {
        double radio1 = this.radio;
        double radio2 = otro.getRadio();
        if (considerarDecimales) {
            if (radio1 == radio2)
                return true;
            else
                return false;
        } else {
            if (Math.abs(radio1 - radio2) < 1)
                return true;
            else
                return false;
        }
    }
}
