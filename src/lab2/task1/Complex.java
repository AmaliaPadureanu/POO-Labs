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
        int addReal = this.getReal() + complex.getReal();
        int addImaginary = this.getImaginary() + complex.getImaginary();
        int result = addReal + addImaginary;
        System.out.println(result);
    }

    public void showNumber() {
        System.out.println(real + "i" + imaginary);
    }
}
