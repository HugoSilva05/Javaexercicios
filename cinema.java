import java.util.*;
public class cinema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Assentos comuns das fileiras Sala Alpha
        int AlphaA = 24;
        int AlphaB = 24;
        int AlphaC = 23;
        int AlphaD = 23;
        int AlphaE = 23;
        int AlphaF = 23;
        
        //Total de assentos comuns sala Alpha
        int AlphaTotal = AlphaA + AlphaB + AlphaC + AlphaD + AlphaE + AlphaF;
        
        //Assentos para pessoas com deficiência das fileiras Sala Alpha
        int AlphaAPcD = 2;
        int AlphaBPcD = 2;
        int AlphaCPcD = 2;
        int AlphaDPcD = 2;
        int AlphaEPcD = 2;
        int AlphaFPcD = 2;
        
        //Total de assentos para pessoas com deficiência sala Alpha
        int AlphaPcDTotal = AlphaAPcD + AlphaBPcD + AlphaCPcD + AlphaDPcD + AlphaEPcD + AlphaFPcD;

        //Assentos comuns das fileiras Sala Beta
        int BetaA = 24;
        int BetaB = 24;
        int BetaC = 24;
        int BetaD = 24;
        int BetaE = 24;

        //Total Sala Beta
        int BetaTotal = BetaA + BetaB + BetaC + BetaD + BetaE;

        //Assentos para pessoas com deficiência das fileiras Sala Beta
        int BetaAPcD = 2;
        int BetaBPcD = 1;
        int BetaCPcD = 1;
        int BetaDPcD = 1;
        int BetaEPcD = 1;

        //Total de assentos para pessoas com deficiência sala Beta
        int BetaPcDTotal = BetaAPcD + BetaBPcD + BetaCPcD + BetaDPcD + BetaEPcD ;

        int QtdeIngressos, sala, assento, fileira;

        String nome;

        System.out.println("Olá, seja bem vindo ao nosso cinema! \nPrimeiramente, qual o seu nome?");
        nome = sc.next();

        System.out.println("Certo "+nome+", hoje temos dois filmes no nosso catálogo nas salas Alpha e Beta, sendo: \n1. Alpha: As Branquelas \n2. Beta: A Chegada \nPor favor digite o número correspondente a sala e filme desejados: ");
        sala = sc.nextInt();

        //Sala Alpha
        if(sala == 1){
            System.out.println("Certo, você escolheu a sala Alpha, temos os seguintes tipos de assentos: \n1. Assento comum \n2. Assento para pessoas com Deficiência \nDigite o número correspondente ao tipo de assento desejado: ");
            assento = sc.nextInt();
            //Assento comum
            if (assento == 1){
                System.out.println("Certo, você escolheu o assento comum. Temos "+ AlphaTotal +" ingressos.\nSendo divididos nas fileiras: \n1. Fileira A: "+AlphaA+"\n2. Fileira B: "+AlphaB+"\n3. Fileira C: "+AlphaC+"\n4. Fileira D: "+AlphaD+"\n5. Fileira E: "+AlphaE+"\n6. Fileira F: "+AlphaF+"\nDigite o número correspondente a fileira desejada:");
                fileira = sc.nextInt();

                System.out.println("Quase lá, quantos ingressos você deseja?");
                QtdeIngressos = sc.nextInt();
                switch (fileira){
                    case 1:
                    if ((QtdeIngressos > 0) && (QtdeIngressos <= AlphaA)){
                        AlphaA = AlphaA - QtdeIngressos;
                        System.out.print(nome+", seus ingressos foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom filme.");
                        sc.close();
                    }
                    else{
                        System.out.print("Selecione uma quantidade de ingressos entre 1 e "+AlphaA);
                        sc.close();
                    }
                    break;

                    case 2:
                    if ((QtdeIngressos > 0) && (QtdeIngressos <= AlphaB)){
                        AlphaB = AlphaB - QtdeIngressos;
                        System.out.print(nome+", seus ingressos foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom filme.");
                        sc.close();
                    }
                    else{
                        System.out.print("Selecione uma quantidade de ingressos entre 1 e "+AlphaB);
                        sc.close();
                    }
                    break;

                    case 3:
                    if ((QtdeIngressos > 0) && (QtdeIngressos <= AlphaC)){
                        AlphaC = AlphaC - QtdeIngressos;
                        System.out.print(nome+", seus ingressos foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom filme.");
                        sc.close();
                    }
                    else{
                        System.out.print("Selecione uma quantidade de ingressos entre 1 e "+AlphaC);
                        sc.close();
                    }
                    break;

                    case 4:
                    if ((QtdeIngressos > 0) && (QtdeIngressos <= AlphaD)){
                        AlphaD = AlphaD - QtdeIngressos;
                        System.out.print(nome+", seus ingressos foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom filme.");
                        sc.close();
                    }
                    else{
                        System.out.print("Selecione uma quantidade de ingressos entre 1 e "+AlphaD);
                        sc.close();
                    }
                    break;

                    case 5:
                    if ((QtdeIngressos > 0) && (QtdeIngressos <= AlphaE)){
                        AlphaE = AlphaE - QtdeIngressos;
                        System.out.print(nome+", seus ingressos foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom filme.");
                        sc.close();
                    }
                    else{
                        System.out.print("Selecione uma quantidade de ingressos entre 1 e "+AlphaE);
                        sc.close();
                    }
                    break;

                    case 6:
                    if ((QtdeIngressos > 0) && (QtdeIngressos <= AlphaF)){
                        AlphaF = AlphaF - QtdeIngressos;
                        System.out.print(nome+", seus ingressos foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom filme.");
                        sc.close();
                    }
                    else{
                        System.out.print("Selecione uma quantidade de ingressos entre 1 e "+AlphaF);
                        sc.close();
                    }
                    break;

                    default:
                    System.out.print("Erro: Dite um número entre 1 e 6.");
                    break;
                }
            }
            //Assento PcD
            else if (assento == 2){
                System.out.println("Certo, você escolheu o assento para pessoas com deficiência. Temos "+ AlphaPcDTotal +" ingressos.\nSendo divididos nas fileiras: \n1. Fileira A: "+AlphaAPcD+"\n2. Fileira B: "+AlphaBPcD+"\n3. Fileira C: "+AlphaCPcD+"\n4. Fileira D: "+AlphaDPcD+"\n5. Fileira E: "+AlphaEPcD+"\n6. Fileira F: "+AlphaFPcD+"\nDigite o número correspondente a fileira desejada:");
                fileira = sc.nextInt();

                System.out.println("Quase lá, quantos ingressos você deseja?");
                QtdeIngressos = sc.nextInt();
                switch (fileira){
                    case 1:
                    if ((QtdeIngressos > 0) && (QtdeIngressos <= AlphaAPcD)){
                        AlphaAPcD = AlphaAPcD - QtdeIngressos;
                        System.out.print(nome+", seus ingressos foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom filme.");
                        sc.close();
                    }
                    else{
                        System.out.print("Selecione uma quantidade de ingressos entre 1 e "+AlphaAPcD);
                        sc.close();
                    }
                    break;

                    case 2:
                    if ((QtdeIngressos > 0) && (QtdeIngressos <= AlphaBPcD)){
                        AlphaBPcD = AlphaBPcD - QtdeIngressos;
                        System.out.print(nome+", seus ingressos foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom filme.");
                        sc.close();
                    }
                    else{
                        System.out.print("Selecione uma quantidade de ingressos entre 1 e "+AlphaBPcD);
                        sc.close();
                    }
                    break;

                    case 3:
                    if ((QtdeIngressos > 0) && (QtdeIngressos <= AlphaCPcD)){
                        AlphaCPcD = AlphaCPcD - QtdeIngressos;
                        System.out.print(nome+", seus ingressos foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom filme.");
                        sc.close();
                    }
                    else{
                        System.out.print("Selecione uma quantidade de ingressos entre 1 e "+AlphaCPcD);
                        sc.close();
                    }
                    break;

                    case 4:
                    if ((QtdeIngressos > 0) && (QtdeIngressos <= AlphaDPcD)){
                        AlphaDPcD = AlphaDPcD - QtdeIngressos;
                        System.out.print(nome+", seus ingressos foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom filme.");
                        sc.close();
                    }
                    else{
                        System.out.print("Selecione uma quantidade de ingressos entre 1 e "+AlphaDPcD);
                        sc.close();
                    }
                    break;

                    case 5:
                    if ((QtdeIngressos > 0) && (QtdeIngressos <= AlphaEPcD)){
                        AlphaEPcD = AlphaEPcD - QtdeIngressos;
                        System.out.print(nome+", seus ingressos foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom filme.");
                        sc.close();
                    }
                    else{
                        System.out.print("Selecione uma quantidade de ingressos entre 1 e "+AlphaEPcD);
                        sc.close();
                    }
                    break;

                    case 6:
                    if ((QtdeIngressos > 0) && (QtdeIngressos <= AlphaFPcD)){
                        AlphaFPcD = AlphaFPcD - QtdeIngressos;
                        System.out.print(nome+", seus ingressos foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom filme.");
                        sc.close();
                    }
                    else{
                        System.out.print("Selecione uma quantidade de ingressos entre 1 e "+AlphaFPcD);
                        sc.close();
                    }
                    break;

                    default:
                    System.out.print("Erro: Dite um número entre 1 e 6.");
                    break;
                }
            }
            //Erro ao escolher assento
            else{
                System.out.print("Erro: Digite 1 ou 2");
            }
        }
        //Sala Beta
        else if(sala == 2){
            System.out.println("Certo, você escolheu a sala Beta, temos os seguintes tipos de assentos: \n1. Assento comum \n2. Assento para pessoas com Deficiência \nDigite o número correspondente ao tipo de assento desejado: ");
            assento = sc.nextInt();

             //Assento comum
             if (assento == 1){
                System.out.println("Certo, você escolheu o assento comum. Temos "+BetaTotal+" ingressos.\nSendo divididos nas fileiras: \n1. Fileira A: "+BetaA+"\n2. Fileira B: "+BetaB+"\n3. Fileira C: "+BetaC+"\n4. Fileira D: "+BetaD+"\n5. Fileira E: "+BetaE+"\nDigite o número correspondente a fileira desejada:");
                fileira = sc.nextInt();

                System.out.println("Quase lá, quantos ingressos você deseja?");
                QtdeIngressos = sc.nextInt();
                switch (fileira){
                    case 1:
                    if ((QtdeIngressos > 0) && (QtdeIngressos <= BetaA)){
                        BetaA = BetaA - QtdeIngressos;
                        System.out.print(nome+", seus ingressos foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom filme.");
                        sc.close();
                    }
                    else{
                        System.out.print("Selecione uma quantidade de ingressos entre 1 e "+BetaA);
                        sc.close();
                    }
                    break;

                    case 2:
                    if ((QtdeIngressos > 0) && (QtdeIngressos <= BetaB)){
                        BetaB = BetaB - QtdeIngressos;
                        System.out.print(nome+", seus ingressos foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom filme.");
                        sc.close();
                    }
                    else{
                        System.out.print("Selecione uma quantidade de ingressos entre 1 e "+BetaB);
                        sc.close();
                    }
                    break;

                    case 3:
                    if ((QtdeIngressos > 0) && (QtdeIngressos <= BetaC)){
                        BetaC = BetaC - QtdeIngressos;
                        System.out.print(nome+", seus ingressos foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom filme.");
                        sc.close();
                    }
                    else{
                        System.out.print("Selecione uma quantidade de ingressos entre 1 e "+BetaC);
                        sc.close();
                    }
                    break;

                    case 4:
                    if ((QtdeIngressos > 0) && (QtdeIngressos <= BetaD)){
                        BetaD = BetaD - QtdeIngressos;
                        System.out.print(nome+", seus ingressos foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom filme.");
                        sc.close();
                    }
                    else{
                        System.out.print("Selecione uma quantidade de ingressos entre 1 e "+BetaD);
                        sc.close();
                    }
                    break;

                    case 5:
                    if ((QtdeIngressos > 0) && (QtdeIngressos <= BetaE)){
                        BetaE = BetaE - QtdeIngressos;
                        System.out.print(nome+", seus ingressos foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom filme.");
                        sc.close();
                    }
                    else{
                        System.out.print("Selecione uma quantidade de ingressos entre 1 e "+BetaE);
                        sc.close();
                    }
                    break;

                    default:
                    System.out.print("Erro: Dite um número entre 1 e 5.");
                    break;
                }
             }
             //Assento PcD
             else if(assento == 2){
                System.out.println("Certo, você escolheu o asssento para pessoas com deficiência. Temos "+ BetaPcDTotal+" ingressos.\nSendo divididos nas fileiras: \n1. Fileira A: "+BetaAPcD+"\n2. Fileira B: "+BetaBPcD+"\n3. Fileira C: "+BetaCPcD+"\n4. Fileira D: "+BetaDPcD+"\n5. Fileira E: "+BetaEPcD+"\nDigite o número correspondente a fileira desejada:");
                fileira = sc.nextInt();

                System.out.println("Quase lá, quantos ingressos você deseja?");
                QtdeIngressos = sc.nextInt();
                switch (fileira){
                    case 1:
                    if ((QtdeIngressos > 0) && (QtdeIngressos <= BetaAPcD)){
                        BetaAPcD = BetaAPcD - QtdeIngressos;
                        System.out.print(nome+", seus ingressos foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom filme.");
                        sc.close();
                    }
                    else{
                        System.out.print("Selecione uma quantidade de ingressos entre 1 e "+BetaAPcD);
                        sc.close();
                    }
                    break;

                    case 2:
                    if ((QtdeIngressos > 0) && (QtdeIngressos <= BetaBPcD)){
                        BetaBPcD = BetaBPcD - QtdeIngressos;
                        System.out.print(nome+", seus ingressos foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom filme.");
                        sc.close();
                    }
                    else{
                        System.out.print("Selecione uma quantidade de ingressos entre 1 e "+BetaBPcD);
                        sc.close();
                    }
                    break;

                    case 3:
                    if ((QtdeIngressos > 0) && (QtdeIngressos <= BetaCPcD)){
                        BetaCPcD = BetaCPcD - QtdeIngressos;
                        System.out.print(nome+", seus ingressos foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom filme.");
                        sc.close();
                    }
                    else{
                        System.out.print("Selecione uma quantidade de ingressos entre 1 e "+BetaCPcD);
                        sc.close();
                    }
                    break;

                    case 4:
                    if ((QtdeIngressos > 0) && (QtdeIngressos <= BetaDPcD)){
                        BetaDPcD = BetaDPcD - QtdeIngressos;
                        System.out.print(nome+", seus ingressos foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom filme.");
                        sc.close();
                    }
                    else{
                        System.out.print("Selecione uma quantidade de ingressos entre 1 e "+BetaDPcD);
                        sc.close();
                    }
                    break;

                    case 5:
                    if ((QtdeIngressos > 0) && (QtdeIngressos <= BetaEPcD)){
                        BetaEPcD = BetaEPcD - QtdeIngressos;
                        System.out.print(nome+", seus ingressos foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom filme.");
                        sc.close();
                    }
                    else{
                        System.out.print("Selecione uma quantidade de ingressos entre 1 e "+BetaEPcD);
                        sc.close();
                    }
                    break;

                    default:
                    System.out.print("Erro: Dite um número entre 1 e 5.");
                    break;
                }
             }
             //Erro ao escolher assento
             else{
                 System.out.print("Erro: Digite 1 ou 2");
             }
        }
        //Erro ao escolher sala
        else{
            System.out.print("Erro: Digite 1 ou 2.");
        }
    }
}