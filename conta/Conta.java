package conta;

public class Conta {
    private String nomeTitular, agencia, dataAbertura;
    private int numeroConta;
    private double saldo;

    public void sacar(double saque){
        if (saque<=saldo && saque>0){
            saldo -= saque;
            System.out.printf("\nO saldo na conta é de %2f", saldo);
        }
        else if (saque>saldo){
            System.out.println("\nNão há saldo suficiente para o saque");
        }
        else{
            System.out.println("Informe um valor válido!");
        }
    }

    public void depositar(double deposito){
        if (deposito>0){
            saldo += deposito;
            System.out.printf("\nDepósito realizado! \nO Saldo na conta é de %2f", saldo);
        }
        else{
            System.out.println("\nInsira um valor válido!");
        }
    }

    public void calculaRendimento(double juros, int meses){
        double rendimento = saldo * (1+juros) * meses;
        System.out.printf("\nO rendimento da conta durante %d meses é de %2f", meses, rendimento);
    }

    public void consultaSaldo(){
        System.out.printf("O saldo da conta é de %2f", saldo);
    }

    public void dadosConta(){
        System.out.printf("Nome do titular: %s\nAgencia: %s\nNúmero da conta: %d\nData de abertura: %s", nomeTitular, agencia, numeroConta, dataAbertura);
    }
}