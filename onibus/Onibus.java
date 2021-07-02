package onibus;

public class Onibus {
    String localAtual;
    int qtdeParadas;
    int capacidadeOnibus;
    int qtdePassageiros;
    int lugaresVagos;

    public void Inicializa(String localAtual, int capacidadeOnibus, int qtdePassageiros){
        this.localAtual = localAtual;
        this.capacidadeOnibus = capacidadeOnibus;
        this.qtdePassageiros = qtdePassageiros;
        this.lugaresVagos = capacidadeOnibus - qtdePassageiros;
    }

    public void Entra(int qtdeEntra){
        if (qtdeEntra <= this.lugaresVagos && qtdeEntra >= 0){
        this.lugaresVagos -= qtdeEntra;
        this.qtdePassageiros += qtdeEntra; 
        System.out.printf("Os passageiros subiram no ônibus. A quantidade atual de passageiros é de %d.", qtdePassageiros);
        }
        else{
            System.out.println("Não há espaço no ônibus!");
        }
    }

    public void Sai(int qtdeSai){
        if (qtdeSai <= this.qtdePassageiros && qtdeSai >= 0){
            this.lugaresVagos += qtdeSai;
            this.qtdePassageiros -= qtdeSai; 
            System.out.printf("Os passageiros desceram do ônibus. A quantidade atual de passageiros é de %d.", qtdePassageiros);
            }
            else{
                System.out.println("Não há passageiros suficientes no ônibus!");
            }
    }

    public void Parar(){
        this.qtdeParadas += 1;
        System.out.printf("O ônibus para.\nA quantidade total de paradas é de %d.", qtdeParadas);
    }

    public void Andar(){
        System.out.print("O ônibus anda\n");
    }
}