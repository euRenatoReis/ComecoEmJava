
public class App {

    public static void main(String[] args) throws Exception {

   /*      int variavelNumeroInteiro = 1;
        double numerosComCasasDecimais = 211223232323.00;
        float numerosComCasasDecimaisMenosQueDouble = 1.0f;
        char armazenaUmUnicoCaractere = 'A';
        boolean armazenaSentencas = true;
        byte armazenaNumerosInteirosPequenos = 10;
        short armazenaNumerosInteirosCurtos = 9;
        long armazenaNumerosInteirosLongos = 200220202;
        String armazenaPalavras = "aspas duplas please"; */

        // Declaração da classe Pessoa no nível de classe
        class Pessoa {

            // Atributos dessa pessoa
            String nome;
            int idade;

            // Construtor da pessoa
            public Pessoa(String nome, int idade) {
                this.nome = nome;
                this.idade = idade;
            }

            // Método
            public void saudacao() {
                System.out.println("Olá, meu nome é: " + nome + " e tenho " + idade + " anos.");
            }
        }

        // Criação de uma instância de Pessoa
        Pessoa pessoa1 = new Pessoa("João", 24);

        // Chamada do método saudacao()
        pessoa1.saudacao();
    }
}
