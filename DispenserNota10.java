package poo.interfac;

public class DispenserNota10 implements IDispenserCaixaEletronico {

    private IDispenserCaixaEletronico proximoDispenser;

    @Override
    public void setProximoElo(IDispenserCaixaEletronico proximoElo) {
        this.proximoDispenser = proximoElo;
    }

    @Override
    public void sacar(SaqueDinheiro saque) {
        if (saque.getValor() >= 10) {
            int notas = saque.getValor() / 10;
            int restante = saque.getValor() % 10;
            System.out.println("Liberando " + notas + " de 10 reais.");
            if (restante != 0) {
                this.proximoDispenser.sacar(new SaqueDinheiro(restante));
            }
        } else {
            this.proximoDispenser.sacar(saque);
        }
    }

}
