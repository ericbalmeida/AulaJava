package poo.interfac;

public class DispenserNota5 implements IDispenserCaixaEletronico {

    private IDispenserCaixaEletronico proximoDispenser;

    @Override
    public void setProximoElo(IDispenserCaixaEletronico proximoElo) {
        //this.proximoDispenser = proximoElo;
    }

    @Override
    public void sacar(SaqueDinheiro saque) {
        if (saque.getValor() >= 5) {
            int notas = saque.getValor() / 5;
            int restante = saque.getValor() % 5;
            System.out.println("Liberando " + notas + " de 5 reais.");
            if (restante != 0) {
                this.proximoDispenser.sacar(new SaqueDinheiro(restante));
            }
        } else {
            this.proximoDispenser.sacar(saque);
        }
    }

}
