
// vetores tipos (primitivos):

int[] numeros = { 2,4,5,6,87};
double[] notas ={2.44, 4.33,121.33, 45.000};
float[] precos= {23.213, 434.142, 656.789,343.231};
char[] vogais = {'a', 'b', 'c', 'd', 'e'};
boolean[] booleanos = {true, false, true, true};
byte[] vetorMenor8Bit = {30, 20, 50, 60, 80};
short[] numeros = {100, 200, 300, 400, 500};
long[] numeros = {10000000000L, 20000000000L, 30000000000L, 40000000000L, 50000000000L};

// vetores tipos (objetos):

String[] vetorStrings = { "tenso", "demais", "mesmo" };
Object[] objetos = {1, "Olá", 3.14, true};
Pessoa[] pessoas = {        // Vetor de objetos de uma classe personalizada chamada MinhaClasse (substitua MinhaClasse pelo nome da sua classe)
    new Pessoa("Alice", 25),
    new Pessoa("Bob", 30),
    new Pessoa("Charlie", 22)
};



// teste com vetor char[]:


public class ExemploCharArray {
    public static void main(String[] args) {
        // Declarando e inicializando um vetor de caracteres
        char[] vogais = {'a', 'e', 'i', 'o', 'u'};
        
        // Acessando e exibindo os elementos do vetor
        System.out.println("Vogais:");
        for (int i = 0; i < vogais.length; i++) {
            System.out.println("Posição " + i + ": " + vogais[i]);
        }
        
        // Modificando um elemento do vetor
        vogais[1] = 'x';
        
        // Exibindo o vetor após a modificação
        System.out.println("\nVogais após a modificação:");
        for (int i = 0; i < vogais.length; i++) {
            System.out.println("Posição " + i + ": " + vogais[i]);
        }
    }
}

/* saida: 
 
Vogais:
Posição 0: a
Posição 1: e
Posição 2: i
Posição 3: o
Posição 4: u

Vogais após a modificação:
Posição 0: a
Posição 1: x
Posição 2: i
Posição 3: o
Posição 4: u

*/

