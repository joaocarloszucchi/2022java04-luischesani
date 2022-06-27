class Cachorro{
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

class Pinscher extends Cachorro{
    private String racao_favorita;
    private boolean abandonado; 

    public Pinscher(){
        altura = 0.15f;
        peso = 2.5f;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public String getCor(){
        return cor;
    }
    public void setRacao(String racao){
        this.racao_favorita = racao;
    }
    public String getRacao(){
        return racao_favorita;
    }
    public void setAbandono(boolean abandono){
        this.abandonado = abandono;
    }
    public boolean getAbandono(){
        return abandonado;
    }
}
