package math;

public class Vector {
    private int x;
    private int y;

    // Constructor
    public Vector(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // Método para sumar vectores
    public Vector add(Vector other) {
        return new Vector(this.x + other.x, this.y + other.y);
    }

    // Método para restar vectores
    public Vector subtract(Vector other) {
        return new Vector(this.x - other.x, this.y - other.y);
    }

    // Método para multiplicar vector por escalar
    public Vector multiply(int scalar) {
        return new Vector(this.x * scalar, this.y * scalar);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}