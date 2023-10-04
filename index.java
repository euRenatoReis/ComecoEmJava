
int variavelNumeroInteiro = 1;
double numerosComCasasDecimais = 211223232323.00;
float numerosComCasasDecimaisMenosQueDouble = 1.0;
char armazenaUmUnicoCaractere = 'A';
boolean armazenaSentencas = true; 
byte  armazenaNumerosInteirosPequenos = 10;
short armazenaNumerosInteirosCurtos = 9;
long  armazenaNumerosInteirosLongos = 200220202;
String armazenaPalavras = 'meuDeusMeusenhor';


public class Pessoa{

   // atributos dessa pessoa

   String nome = 'renato';
   int idade = 22;
   
   // construtor da pessoa

   public Pessoa(int idade, String nome){

        this.nome = nome; 
        this.idade = idade;
   }

   //Método
   public void saudacao(){

    System.out.println("ola meu Nome é: " + nome + "tenho:" + idade + "anos");

   }

}

Pessoa pessoa1 = new Pessoa("Joao", 24);