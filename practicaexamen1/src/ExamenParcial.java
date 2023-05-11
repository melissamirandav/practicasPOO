public class ExamenParcial extends Examen{
private Integer numeroUnidad;
private Integer numeroReintentos;

  public ExamenParcial(final Alumno alumno, final String titulo, final String enunciado,
      final Double nota, final Integer numeroUnidad, final Integer numeroReintentos) {
    super(alumno, titulo, enunciado, nota);
    this.numeroUnidad = numeroUnidad;
    this.numeroReintentos = numeroReintentos;
  }


  @Override
  public boolean aprobado() {

    return getNota()>=4;
  }

  public boolean esRecuperable() {
    if(numeroUnidad<=3){
      return numeroReintentos <=3;
    }
    else {
      return numeroReintentos<=2;
    }

  }
}
