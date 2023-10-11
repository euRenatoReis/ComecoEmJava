
// vetores tipos (primitivos):

public class MapasArraysVetores {

    public static void main(String[] args) throws Exception {

        int[] numeros = { 2, 4, 5, 6, 87 };
        double[] notas = { 2.44, 4.33, 121.33, 45.000 };
        float[] precos = { 231, 44, 66, 33 };
        char[] vogais = { 'a', 'b', 'c', 'd', 'e' };
        boolean[] booleanos = { true, false, true, true };
        byte[] vetorMenor8Bit = { 30, 20, 50, 60, 80 };
        short[] numerosCurtos = { 100, 200, 300, 400, 500 };
        long[] numerosLongos = { 10000000000L, 20000000000L, 30000000000L, 40000000000L, 50000000000L };

        // Vetores de tipos (objetos):
        String[] vetorStrings = { "tenso", "demais", "mesmo" };
        Object[] objetos = { 1, "Olá", 3.14, true };

        System.out.print(vetorStrings);
        System.out.print(notas);
        System.out.print(numeros);
        System.out.print(precos);
        System.out.print(vogais);
        System.out.print(booleanos);
        System.out.print(vetorMenor8Bit);
        System.out.print(numerosCurtos);
        System.out.println(numerosLongos);
        System.out.print(objetos);

        somar(3, 2);
    }

    static void somar(int x, int y) {

        System.out.println(x + y);
    }
}
