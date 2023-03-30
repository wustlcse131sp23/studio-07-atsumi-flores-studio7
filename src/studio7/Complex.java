package studio7;

public class Complex {
    private double real;
    private double imag;
    
    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }
    
    public Complex add(Complex other) {
        double newReal = this.real + other.real;
        double newImag = this.imag + other.imag;
        return new Complex(newReal, newImag);
    }
    
    public Complex multiply(Complex other) {
        double newReal = this.real * other.real - this.imag * other.imag;
        double newImag = this.real * other.imag + this.imag * other.real;
        return new Complex(newReal, newImag);
    }
    
    public String toString() {
        return real + " + " + imag + "i";
    }
}