abstract class Shape {
    public abstract double calcularÁrea();
}

class Retângulo extends Shape {
    private double altura;
    private double largura;

    public Retângulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public double calcularÁrea() {
        return altura * largura;
    }
}

class Círculo extends Shape {
    private double raio;

    public Círculo(double raio) {
        this.raio = raio;
    }

    public double calcularÁrea() {
        return Math.PI * raio * raio;
    }
}

class TesteShapes {
    public static void main(String[] args) {
        Retângulo retângulo = new Retângulo(4, 5);
        Círculo círculo = new Círculo(3);

        double áreaRetângulo = retângulo.calcularÁrea();
        double áreaCírculo = círculo.calcularÁrea();

        System.out.println("Área do Retângulo: " + áreaRetângulo);
        System.out.println("Área do Círculo: " + áreaCírculo);
    }
}
