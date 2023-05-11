public class ExamenFinal extends Examen implements Comparable{
  private Double notaOral;
  private String descripcion;

  public ExamenFinal(final Alumno alumno, final String titulo, final String enunciado,
      final Double nota, final Double notaOral, final String descripcion) {
    super(alumno, titulo, enunciado, nota);
    this.notaOral = notaOral;
    this.descripcion = descripcion;
  }

  @Override
  public boolean aprobado() {
    return getNota()>=4 && notaOral>=4;
  }

  public double promedio() {
    return(getNota()+notaOral)/2;
  }

  @Override
  public int compareTo(final Object o) {
    ExamenFinal comparacionExamen = (ExamenFinal) o;
    /*if(promedio()>comparacionExamen.promedio()) {
      return -1;
    }
    else if(promedio()<comparacionExamen.promedio()){
      return 1;
      }
    return 0;*/

    if(promedio()==comparacionExamen.promedio()){
      return 0;
    }
    return promedio()<comparacionExamen.promedio()?1:-1;
  }
}
