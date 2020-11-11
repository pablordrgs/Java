package fundamentos;

public class Temperatura
{

    public static void main(String[] args)
    {
        // (ºF - 32) * 5/9 = ºC
        int tempF = 86;
        int tempC;

        tempC = (tempF - 32) * 5/9;
        System.out.println(tempC + "ºC");

    }
}
