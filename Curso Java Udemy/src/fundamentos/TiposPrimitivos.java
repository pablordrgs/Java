package fundamentos;

public class TiposPrimitivos
{
    public static void main(String[] args) {
        //Informações do funcionário

        //Tipos númericos inteiros
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 56789;
        long pontosAcumuludos = 3_234_845_223L;

        //Tipos numéricos reais
        float salario = 11_445_44F;
        double vendasAcumuladas = 2_991_797_103.01;

        //Tipo booleano
        boolean estaDeFerias = false; //true

        //Tipo caractere
        char status = 'A';

        //Dias de empresa
        System.out.println(anosDeEmpresa * 365);

        //Número de viagens
        System.out.println(numeroDeVoos / 2);

        //Pontos acumulados
        System.out.println(pontosAcumuludos / vendasAcumuladas);

        System.out.println(id + ": ganha -> " + salario);
        System.out.println("Férias? " + estaDeFerias);
        System.out.println("Status: " + status);
    }
}
