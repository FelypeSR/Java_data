import java.util.Scanner;

public class pessoa {
    private String nome;
    private int idade;
    private double peso;
    private double altura;

    public pessoa(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public void adicionarPesoAnual(int anos) {
        if (idade < 0 ){
            System.err.println("não é possivel adicionar em pessoas com menos de um ano de idade");
        }
        if (idade > 14 || idade < 21){
            while (idade < 21){
                this.peso += 0.5;
                this.idade++;
            }

            }
         
        
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Peso: " + this.peso);
        System.out.println("Altura: " + this.altura);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String nome;
            int idade;
            double peso;
            double altura;

            while (true) {
                System.out.println("Olá \nDigite seu nome: ");
                nome = scanner.nextLine();

                System.out.println("Digite sua idade: ");
                idade = scanner.nextInt();

                System.out.println("Digite a altura dada em cm:");
                altura = scanner.nextDouble();

                System.out.println("Digite o peso:");
                peso = scanner.nextDouble();

                if (peso < 10 || peso >= 400) {
                    System.err.println("ERRO! \nO peso não pode ser menor que 10 \nPeso máximo de um adulto: aproximadamente 300 kg (obeso)");
                    scanner.nextLine(); // limpando o buffer
                    continue; // reinicia o loop
                }
                if (altura < 0 || altura >= 300) {
                    System.err.println("ERRO! \nA altura não pode ser menor que 0 e nem maior que 300 cm");
                    scanner.nextLine(); // limpando o buffer
                    continue; // reinicia o loop
                }
                if (idade < 0 || idade >= 99) {
                    System.err.println("ERRO! \nIdade inválida!");
                    scanner.nextLine(); // limpando o buffer
                    continue; // reinicia o loop
                }
                break; // sair do loop quando os valores são válidos
            }

            pessoa pessoa = new pessoa(nome, idade, peso, altura);
            pessoa.exibirInformacoes();

            System.out.println("Digite a quantidade de anos para adicionar peso:");
            int anos = scanner.nextInt();
            pessoa.adicionarPesoAnual(anos);
            System.out.println("Informações após adicionar peso:");
            pessoa.exibirInformacoes();
        }
    }
}
