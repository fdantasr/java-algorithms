package computer_aided_instruction;

public class Cubo extends FormaTridimensional{

    @Override
    public double areaCubo(double aresta) {
        double area = 6 * Math.pow(aresta, 2);
        return area;
    }
}
