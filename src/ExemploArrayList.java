import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ExemploArrayList {
    public static void main(String[] args) {
        ArrayList<Pessoa> agendaPessoas = new ArrayList<Pessoa>();
        Scanner scn = new Scanner(System.in);
        int opcao = -1;

        do{
            System.out.println("1 -Cadastrar pessoa na agenda.");
            System.out.println("2- Listar pessoas na agenda.");
            System.out.println("0 - Sair.");
            System.out.println("Digite a opção desejada ");
            opcao = scn.nextInt();


            if (opcao == 1) {
                cadastrar();
            }else if(opcao == 2) {
                listar();
            }else if( opcao == 0) {
                System.out.println("Encerrando");

            }else {
                System.out.println("Opção inválida!");
            }
        }while (opcao !=0);

    }
    private static void listar(ArrayList<Pessoa> agendaPessoas){

        for (Pessoa obj: agendaPessoas) {
            System.out.println(obj.toString());
        }
    }
    private static void cadastrar(ArrayList<Pessoa>agendaPessoas){
        Scanner scn = new Scanner(System.in);

        String nome = "";
        String telefone= "";
        String endereco = "";

        System.out.println("Digite o nome:");
        nome= scn.nextLine();

        System.out.println("Digite o endeco:");
        nome= scn.nextLine();

        System.out.println("Digite o telefone:");
        nome= scn.nextLine();

        Pessoa objPessoa = new Pessoa(nome, endereco, telefone);
        agendaPessoas.add(objPessoa);
    }
}