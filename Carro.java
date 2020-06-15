package poo.interfac;

public class Carro implements ICarro{
    private double consumo;
    private double tanqueCombustivel;

    @Override
    public void andar(double distancia) {
    }

    @Override
    public void abastecer(double quantidade) {
    }

    @Override
    public double consultarTanque() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    } 
}
