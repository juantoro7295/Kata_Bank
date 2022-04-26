package co.sofka.kata.cuenta.app;

import co.sofka.kata.cuenta.dominio.Cuenta;
import co.sofka.kata.cuenta.dominio.Fecha;
import co.sofka.kata.cuenta.dominio.Monto;

public class App {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta();

        cuenta.depositar(new Monto(1000),new Fecha("10/01/2021"));
        cuenta.depositar(new Monto(2000),new Fecha("13/01/2021"));
        cuenta.retirar(new Monto(500),new Fecha("14/01/2021"));
        
    }
}
