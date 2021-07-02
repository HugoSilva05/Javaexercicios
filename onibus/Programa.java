package onibus;
import onibus.*;
import java.util.*;
public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual seu nome?\n");
        String nome = sc.next();
        System.out.printf("\nCerto %s, nosso ônibus saírá de São Paulo com destino a Campos do Jordão.\nQual a capacidade total do nosso ônibus?\n", nome);
        int capacidade = sc.nextInt();
        System.out.printf("\nCerto, %d lugares.\nQuantos passageiros estão no começo da viagem?\n", capacidade);
        int passageiros = sc.nextInt();

        Onibus Onibus1 = new Onibus();
        Onibus1.Inicializa("São Paulo", capacidade, passageiros);
            
        while (true){
            System.out.printf("\nOlá %s, este é o painel de controle do ônibus.\nQual ação você deseja executar? \n1. Adicionar Passageiro(s)\n2. Remover Passageiro(s)\n3. Parar o ônibus\n4. Fazer o ônibus andar\n",nome);
            int opc = sc.nextInt();
            switch(opc){
                case 1:
                System.out.println("Quantos passageiros deseja adicionar?");
                int qtdeEntrando = sc.nextInt();
                Onibus1.Entra(qtdeEntrando);
                break;

                case 2:
                System.out.println("Quantos passageiros deseja remover?");
                int qtdeSaindo = sc.nextInt();
                Onibus1.Sai(qtdeSaindo);
                break;

                case 3:
                Onibus1.Parar();
                break;

                case 4:
                Onibus1.Andar();
                break;

                default:
                System.out.println("Insira um número válido!");
                break;
            }
        }
    }
}