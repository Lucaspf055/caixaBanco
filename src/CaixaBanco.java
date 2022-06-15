import java.util.ArrayList;

public class CaixaBanco {
    private Integer usuarioLogado;
    private Boolean logado = false;

    private ArrayList<Usuario> usuarios = new ArrayList<>();

    public  void setUsuarios(){
        usuarios.add(new Usuario(2000.00, "111.222.333-11", "22", "Lucas"));

    }

    public Integer verificaLogin(String cpf) {
        if (logado) {
            return -2;
        }

        Integer i = 0, userExist = -1;

        for (i = 0; i < usuarios.size(); i++){
            if (cpf.equals(usuarios.get(i).getCpf())) {
                userExist = i;
                break;
            }
        }

        return userExist;
    }

    public void logar(String cpf, String senha) {
        Integer userExist = verificaLogin(cpf);

        if (userExist == -1) {
            System.out.println("usuario nao existe no sistema");
        } else if (userExist == -2) {
            System.out.printf("ja existe um usuario logado no sistema.\nporfavor falor logalt primeiro");
        }
        else{
            if (senha.equals(usuarios.get(userExist).getSenha())) {
                usuarioLogado = userExist;
                logado = true;
                System.out.printf("usuario logado: %s", usuarios.get(usuarioLogado).getNome());

            }
            else System.out.printf("senha errada");
        }
    }


    public void deposita
    public void sacar(Double valor){
        if ((usuarios.get(usuarioLogado).getSaldo() - valor) < -600)
            System.out.printf("\nvoce utrapassou o seu limite");

        else {
            usuarios.get(usuarioLogado).setSaldo(usuarios.get(usuarioLogado).getSaldo() - valor);
            System.out.printf("saldo atual: %.2f", usuarios.get(usuarioLogado).getSaldo());
        }
    }
    public void registro(String cpf, String senha, String nome) {r(Double valor) {
        usuarios.get(usuarioLogado).setSaldo(valor + usuarios.get(usuarioLogado).getSaldo());
        System.out.printf("\nSaldo atual : %.2f", usuarios.get(usuarioLogado).getSaldo());

    }

        usuarios.add(new Usuario(00.00, cpf, senha, nome));
        System.out.printf("Usuario %s foi adicionado", nome);
    }
}