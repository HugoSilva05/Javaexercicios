package conta;
import java.util.*;
import conta.*;
import java.text.DecimalFormat;

public class TesteConta {
    public static void main(String[] args) {
        Conta mtds = new Conta();
        Scanner sc = new Scanner(System.in);

        System.out.println("Olá, qual seu nome?");
        String nome = sc.next();
        
        while (true){
            System.out.printf("\nOlá %s! \nEste é o painel de controle da conta. \n\nQual operação você deseja realizar? \n\n1. Saldo \n2. Saque \n3. Depósito \n4. Consulta de rendimento \n5. Dados da conta \n", nome);
            int opc = sc.nextInt();

            switch(opc){
                case 1:
                mtds.consultaSaldo();
                break;

                case 2:
                System.out.println("Digite o valor a ser sacado: \n");
                double qtdeSaque = sc.nextDouble();
                mtds.sacar(qtdeSaque);
                break;

                case 3:
                System.out.println("Digite o valor a ser depositado: \n");
                double qtdeDeposito = sc.nextDouble();
                mtds.depositar(qtdeDeposito);
                break;

                case 4:
                System.out.println("Digite o rendimento mensal:");
                double juro = sc.nextDouble();
                System.out.println("Agora digite a quantidade de meses em que o dinheiro irá render:");
                int qtdeMeses = sc.nextInt();

                mtds.calculaRendimento(juro, qtdeMeses);
                break;

                case 5:
                mtds.dadosConta();
                break;

                default:
                System.out.println("Digite um número válido!");
                break;
            }
        }
    }
}