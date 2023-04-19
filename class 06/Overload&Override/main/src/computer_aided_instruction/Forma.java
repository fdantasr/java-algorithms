package computer_aided_instruction;

public class Forma {
    public static void main(String[] args) {
    
        FormaBidimensional formaBidimensional = new FormaBidimensional();
        FormaTridimensional formaTridimensional = new FormaTridimensional();
    }
    public double areaCubo(double aresta) {
        double area = 6 * Math.pow(aresta, 2);
        return area;
    }
}