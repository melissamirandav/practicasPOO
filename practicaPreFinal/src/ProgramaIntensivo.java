import java.util.ArrayList;
import java.util.List;

public class ProgramaIntensivo extends OfertaAcademica{
  private Double descuento;
  private List<OfertaAcademica> ofertaAcademicaList;

  public ProgramaIntensivo(final String nombre, final String descripcion, final Double descuento) {
    super(nombre, descripcion);
    this.descuento = descuento;
    ofertaAcademicaList = new ArrayList<>();
  }

  public void agregarOfertaAcademica(OfertaAcademica ofertaAcademica){
    ofertaAcademicaList.add(ofertaAcademica);
  }

  @Override
  public double calcularPrecio() {
    Double precioTotal = 0.0;
    for (OfertaAcademica ofertaAcademica : ofertaAcademicaList) {
      precioTotal += ofertaAcademica.calcularPrecio();
    }
    return precioTotal-(precioTotal*descuento);
  }
}
