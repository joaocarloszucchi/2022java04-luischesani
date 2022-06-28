package Dalmata;
import java.util.Random;

public class Dalmata extends Cachorro
{
    private int manchas;
    private String nome;

    public Dalmata()
    {
        Random r = new Random();
        manchas = r.nextInt(100);
    }

    public void Latir()
    {
        System.out.println("AU! AU!");
    }

    public int ContaNumManchas()
    {
        return manchas;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getNome() 
    {
        return nome;
    }

}
