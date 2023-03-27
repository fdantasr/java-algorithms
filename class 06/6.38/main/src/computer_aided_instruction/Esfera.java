package computer_aided_instruction;

public class Esfera extends FormaTridimensional {

    public double areaEsfera(double raio) {
        double area = 4 * Math.PI * Math.pow(raio, 2);
        return area;
    }
}
