import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CaixaBanco caixa1 = new CaixaBanco();
        Scanner scan = new Scanner(System.in);

        caixa1.setUsuarios();

        Integer escolha = -1;
        System.out.printf("caixa eletronico \n");

        while (escolha != 5) {
            System.out.printf("\n1- login\n2- registro\n3- saque\n4- deposito\n5- sair\n\n");
            escolha = scan.nextInt();
            scan.nextLine();

            switch (escolha) {
                case 1:
                    System.out.println("cpf :");
                    String cpf = scan.nextLine();
                    System.out.printf("senha :");
                    String senha = scan.nextLine();

                    caixa1.logar(cpf, senha);
                    break;
                case 2:
                    System.out.printf("cpf :");
                    String _cpf = scan.nextLine();
                    System.out.printf("senha :");
                    String _senha = scan.nextLine();
                    System.out.printf("nome");
                    String nome = scan.nextLine();

                    caixa1.registra(_cpf, nome, _senha);
                    break;

                case 3:
                    System.out.printf("sair :");
                    String sair = scan.nextLine();
            }
        }
    }
}