package lab2.task1;

public class Complex {
    private int real;
    private int imaginary;

    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex() {
        real = 0;
        imaginary = 0;
    }

    public Complex(Complex complex) {
        this.real = complex.real;
        this.imaginary = complex.imaginary;
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImaginary() {
        return imaginary;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }

    public void addWithComplex(Complex complex) {
        int addReal = this.real + complex.real;
        int addImaginary = this.imaginary + complex.imaginary;
        int result = addReal + addImaginary;
    }

    public void showNumber(Complex complex) {
        System.out.println(complex);
    }
}
