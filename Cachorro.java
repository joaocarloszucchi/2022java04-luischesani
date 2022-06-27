public class Cachorro{
    protected String cor;
    protected float altura;
    protected float peso;

    public Cachorro(){ //construtor
        
    }
    public float imc(){
        return peso / (altura * altura);
    }
    public String getCor(){
        return cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public void setAltura(float altura){
        this.altura = altura;
    }
    public float getTamanho(){
        return altura;
    }
}

//Pode ser extendida para raças de cachorro por exemplo.