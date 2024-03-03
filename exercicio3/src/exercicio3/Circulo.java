package exercicio3;
public class Calculadora {
    
    public double calcular(double raio) {
        return Math.PI * raio * raio;
    }
    
    public double calcular(double lado1, double lado2) {
        return lado1 * lado2;
    }
    
    public int calcular(int lado1, int lado2, int lado3) {
        return lado1 + lado2 + lado3;
    }
    
    public double calcular(int base, double altura) {
        return (base * altura) / 2;
    }
    
    public double calcular(int[] x, int[] y) {
        double area = 0;
        for (int i = 0; i < x.length - 1; i++) {
            area += (x[i] * y[i + 1]) - (x[i + 1] * y[i]);
        }
        return Math.abs(area / 2);
    }
    
    // Retorna o texto "Uso incorreto" para qualquer outro tipo de parâmetro
    public String calcular(String mensagem) {
        return "Uso incorreto";
    }
    
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        
        // Exemplos de uso dos diferentes comportamentos do método calcular()
        double areaCirculo = calc.calcular(5.0);
        System.out.println("Área do círculo: " + areaCirculo);
        
        double areaQuadrado = calc.calcular(4.0, 4.0);
        System.out.println("Área do quadrado: " + areaQuadrado);
        
        int perimetroTriangulo = calc.calcular(3, 4, 5);
        System.out.println("Perímetro do triângulo: " + perimetroTriangulo);
        
        double areaTriangulo1 = calc.calcular(6, 8.0);
        System.out.println("Área do triângulo: " + areaTriangulo1);
        
        int[] x = {0, 5, 10};
        int[] y = {0, 10, 0};
        double areaTriangulo2 = calc.calcular(x, y);
        System.out.println("Área do triângulo a partir das coordenadas cartesianas: " + areaTriangulo2);
        
        String mensagem = calc.calcular("mensagem qualquer");
        System.out.println(mensagem);
    }
}