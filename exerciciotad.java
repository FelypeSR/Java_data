import java.util.Scanner;
public class exerciciotad {
    public static void main(String[] args){
    try (Scanner scanner = new Scanner(System.in)) {
      
      
        float valor =0;
        int auxiliar_valor =0;
        boolean auxiliar = false;
        //loop//
        while (true) {
            System.err.println("============1====================");
            System.err.println("Calculadora TAD");
            System.err.println("================================");
            System.out.println("opções");
            System.out.println("1- verificar valor \n 2- inserir valor \n-encerrar programa");
           int opcao = scanner.nextInt();
            
            

            
         switch (opcao) {
            case 1:
            if (!auxiliar) {
                System.out.println("sem valor inserido ainda");
            }
            else {
                System.err.println("valor inserido :" + valor + "\n valor corrigido: " + auxiliar_valor);

            }
            System.out.println("vo ve e te aviso");
                 break;

                case 2:
                
                System.out.println("insira o valor:");
                valor = scanner.nextFloat();
                
                if (valor < 40){
                    System.out.println("o valor é abaixo de 40, será corrigo para 50:");
                    auxiliar_valor = 50;
                }
                if (valor >= 50 && valor < 59){
                    System.out.println("o valor é acima  de 50, será corrigo para 60");
                    auxiliar_valor = 60;


                }
                if (valor > 60){
                    System.out.println("o valor é acima de 60, sera corrigo para 60");
                    auxiliar_valor = 60;

                }
                auxiliar = true;
                break;


        
            default:
            System.out.println("encerrando o programa");
                break;
        }
        
    }

}
}
}
