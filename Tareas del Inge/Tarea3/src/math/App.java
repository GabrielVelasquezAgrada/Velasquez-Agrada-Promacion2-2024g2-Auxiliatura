package math;

public class App {
    public static void main(String[] args) throws Exception {
        VectorOperation operation = new VectorOperation();

        // Creando dos vectores
        Vector a = new Vector(34, 56);
        Vector b = new Vector(6, 34);

        // Sumar dos enteros
        Integer resultSum = operation.add(34, 3);

        // Restar dos enteros
        Integer resultSub = operation.subtract(34, 3);

        // Multiplicar dos enteros
        Integer resultMul = operation.multiply(34, 3);

        // Sumar dos vectores
        Vector vectorSum = operation.add(a, b);

        // Restar dos vectores
        Vector vectorSub = operation.subtract(a, b);

        // Multiplicar vector por escalar
        Vector vectorMul = operation.multiply(a, 2);

        // Imprimir resultados
        operation.print(resultSum);
        operation.print(resultSub);
        operation.print(resultMul);
        operation.print(vectorSum);
        operation.print(vectorSub);
        operation.print(vectorMul);
    }
}