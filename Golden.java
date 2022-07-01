public class Golden extends Cachorro {
    protected String dono;
    protected String nome;

    public Golden(String dono, String nome) {
        this.dono = dono;
        this.nome = nome;
    }

    public String donoCachorro() {
        return this.dono;
    }

    public String nomeCachorro() {
        return this.nome;
    }
}
