public class Triangulo extends Forma{
    private double base;
    private double altura;

    public Triangulo(double base,double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcArea() {
        return (this.base*this.altura)/2 ;
    }

    @Override
    public double calPerimetro() {
        return 2*(this.altura)+ (this.base);
    }
}
