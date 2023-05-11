public class Jugador implements Comparable<Jugador> {
  private Integer nroCamiseta;
  private String nombre;
  private boolean lesionado;
  private boolean titular;

  public Jugador(final Integer nroCamiseta, final String nombre, final boolean lesionado,
      final boolean titular) {
    this.nroCamiseta = nroCamiseta;
    this.nombre = nombre;
    this.lesionado = lesionado;
    this.titular = titular;
  }

  public Integer getNroCamiseta() {
    return nroCamiseta;
  }

  public String getNombre() {
    return nombre;
  }

  public boolean isLesionado() {
    return lesionado;
  }

  public boolean isTitular() {
    return titular;
  }

  public void setNroCamiseta(final Integer nroCamiseta) {
    this.nroCamiseta = nroCamiseta;
  }

  public void setNombre(final String nombre) {
    this.nombre = nombre;
  }

  public void setLesionado(final boolean lesionado) {
    this.lesionado = lesionado;
  }

  public void setTitular(final boolean titular) {
    this.titular = titular;
  }

  @Override
  public int compareTo(final Jugador o) {
    return nroCamiseta.compareTo(o.nroCamiseta);
  }


}
