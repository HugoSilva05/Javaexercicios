package elevador;
import java.util.*;
public class TesteElevador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Olá, qual seu nome?\n");
        String nome = sc.next();

        System.out.printf("Certo %s, vamos configurar o início do nosso elevador.\nQual o total de andares do prédio?\n",nome);
        int totalAndar = sc.nextInt();

        System.out.print("Qual o andar de atual do elevador?\n");
        int andar = sc.nextInt();

        System.out.print("Qual a capacidade do elevador?\n");
        int capacidade = sc.nextInt();

        System.out.print("Qual a quantidade de passageiros atual do elevador?\n");
        int passageiros = sc.nextInt();

        Elevador Elevador = new Elevador();
        Elevador.Inicializa(andar, totalAndar, capacidade, passageiros);

        while (true){
            System.out.printf("\nOlá %s, este é o painel de controle do elevador.\nQual ação você deseja executar? \n1. Adicionar Passageiro(s)\n2. Remover Passageiro(s)\n3. Subir um andar\n4. Descer um andar\n",nome);
            int opc = sc.nextInt();
            switch(opc){
                case 1:
                System.out.println("Quantos passageiros deseja adicionar?");
                int qtdeEntrando = sc.nextInt();
                Elevador.Entra(qtdeEntrando);
                break;

                case 2:
                System.out.println("Quantos passageiros deseja remover?");
                int qtdeSaindo = sc.nextInt();
                Elevador.Sai(qtdeSaindo);
                break;

                case 3:
                Elevador.Sobe();
                break;

                case 4:
                Elevador.Desce();
                break;

                default:
                System.out.println("Insira um número válido!");
                break;
            }
        }
    }
}