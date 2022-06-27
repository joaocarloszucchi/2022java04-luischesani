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
    public void setTamanho(float tamanho){
        this.tamanho = tamanho;
    }
    public float getTamanho(){
        return tamanho;
    }
}

//Pode ser extendida para raças de cachorro por exemplo.