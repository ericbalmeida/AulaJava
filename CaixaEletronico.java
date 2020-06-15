package poo.interfac;

import java.util.Scanner;

public class CaixaEletronico {

    private IDispenserCaixaEletronico dispenser100;

    public CaixaEletronico() {
        this.dispenser100 = new DispenserNota100();
        IDispenserCaixaEletronico dispenser50 = new DispenserNota50();
        IDispenserCaixaEletronico dispenser20 = new DispenserNota20();
        IDispenserCaixaEletronico dispenser10 = new DispenserNota10();
        IDispenserCaixaEletronico dispenser5 = new DispenserNota5();

        dispenser100.setProximoElo(dispenser50);
        dispenser50.setProximoElo(dispenser20);
        dispenser20.setProximoElo(dispenser10);
        dispenser10.setProximoElo(dispenser5);
    }

    public static void main(String[] args) {
        CaixaEletronico caixa = new CaixaEletronico();
        while (true) {
            int valor = 0;
            System.out.println("Informe uma quantia para saque: ");
            Scanner input = new Scanner(System.in);
            valor = input.nextInt();

            if (valor % 5 != 0) {
                System.out.println("O valor deve ser em múltiplos de 5");
                return;
            }

            caixa.dispenser100.sacar(new SaqueDinheiro(valor));
        }
    }
}
