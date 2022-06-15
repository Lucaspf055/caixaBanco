import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CaixaBanco caixa1 = new CaixaBanco();
        Scanner  scan = new Scanner(System.in);

        caixa1.setUsuarios();

        caixa1.registro("111.222.333-11", "22", "Lucas");

    }


}
