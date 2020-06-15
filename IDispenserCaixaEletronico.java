package poo.interfac;

public interface IDispenserCaixaEletronico {

    void setProximoElo(IDispenserCaixaEletronico proximoElo);

    void sacar(SaqueDinheiro saque);
}
