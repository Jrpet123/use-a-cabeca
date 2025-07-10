public class TesteObjects {

    int idade;
    String nome;
    double altura;

    public void criar() {
        System.out.println("Criando uma pessoa com os seguintes atributos: ");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("ALtura: " + altura);
    }

    public static void main(String[] args) {

       TesteObjects pessoa = new TesteObjects();

       pessoa.altura = 1.90;
       pessoa.idade = 23;
       pessoa.nome = "José";
       pessoa.criar();
    }
}
