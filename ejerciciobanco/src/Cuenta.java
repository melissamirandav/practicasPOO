public abstract class Cuenta {

  private Cliente cliente;
  private double saldo;

  public Cuenta(Cliente cliente, double saldo) {
    this.cliente = cliente;
    this.saldo = saldo;
  }

}
