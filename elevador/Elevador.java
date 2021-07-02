package elevador;

public class Elevador {
    int andarAtual;
    int totalAndares;
    int capacidadeElevador;
    int qtdePassageiros;
    int lugaresVagos;

    public void Inicializa(int andarAtual, int totalAndares, int capacidadeElevador, int qtdePassageiros){
        this.andarAtual = andarAtual;
        this.totalAndares = totalAndares;
        this.capacidadeElevador = capacidadeElevador;
        this.qtdePassageiros = qtdePassageiros;
        this.lugaresVagos = capacidadeElevador - qtdePassageiros;
    }

    public void Entra(int qtdeEntra){
        if (qtdeEntra <= this.lugaresVagos && qtdeEntra >=0){
            this.qtdePassageiros += qtdeEntra;
            this.lugaresVagos -= qtdeEntra;
            System.out.printf("Os passageiros subiram no elevador. A quantidade atual de passageiros é de %d.", qtdePassageiros);
        }
        else{
            System.out.println("Não há espaço no elevador!");
        }
    }

    public void Sai(int qtdeSai){
        if (qtdeSai <= this.qtdePassageiros && qtdeSai >= 0){
            this.lugaresVagos += qtdeSai;
            this.qtdePassageiros -= qtdeSai; 
            System.out.printf("Os passageiros desceram do elevador. A quantidade atual de passageiros é de %d.", qtdePassageiros);
            }
            else{
                System.out.println("Não há passageiros suficientes no elevador!");
            }
    }

    public void Sobe(){
        if (this.andarAtual < this.totalAndares && this.andarAtual >=0){
            this.andarAtual += 1;
            System.out.printf("O elevador sobe um andar, o andar atual é o %dº",this.andarAtual);
        }
        else{
            System.out.print("Está no último andar, não é possível subir!");
        }
    }

    public void Desce(){
        if (this.andarAtual <= this.totalAndares && this.andarAtual >0){
            this.andarAtual -= 1;
            System.out.printf("O elevador desce um andar, o andar atual é o %dº",this.andarAtual);
        }
        else{
            System.out.print("Está no térreo, não é possível descer!");
        }
    }
}