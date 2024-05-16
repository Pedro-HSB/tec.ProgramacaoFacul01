public class Retangulo {
    private double largura,altura;
    public void main(String[] args) {

    }

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void area(){
        System.out.println("a area e " + (this.largura*this.altura));
    }

    public void perimetro(){
        System.out.println("a perimetro e " + (2*(this.largura+this.altura)));
    }

    public void diagonal(){
        System.out.printf("a diagonal e %.3f" , (Math.sqrt((this.largura*this.largura)+(this.altura*this.altura))));
    }
}
