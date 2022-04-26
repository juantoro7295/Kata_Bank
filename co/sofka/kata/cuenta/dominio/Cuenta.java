package co.sofka.kata.cuenta.dominio;

public class Cuenta {

    private Fecha fecha;
    private Monto monto;
    private int saldo;

    public Cuenta( ) {
    }

    public void depositar(Monto monto, Fecha fecha){
        this.saldo += monto.getMonto();

    }
    public void retirar(Monto monto, Fecha fecha){
        this.saldo -= monto.getMonto();
    }



}
