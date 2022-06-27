package Dalmata;

import java.util.ArrayList;
import java.util.List;

public class PetShop
{
    private int countDalmatas;
    private int countCachorros;
    private ArrayList l = new ArrayList<Cachorro>();

    public PetShop()
    {
        countDalmatas = 0;
    }

    public void addCachorro(Cachorro c)
    {
        l.add(c);
    }

    public void addCachorro(Dalmata c)
    {
        l.add(c);
        countDalmatas++;
    }

    public int CountDalmatas()
    {
        return countDalmatas;
    }

    public int CountCachorros()
    {
        return l.size();
    }

    public static void main(String[] args) 
    {
        PetShop s = new PetShop();

        s.addCachorro(new Cachorro());
        s.addCachorro(new Dalmata());
        s.addCachorro(new Cachorro());

        System.out.println("há " + s.CountDalmatas() + " dalmatas na loja");
    }
}
