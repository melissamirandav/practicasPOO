public class ProductoFactory {
private static ProductoFactory instance;

private ProductoFactory() {

  }

  public static ProductoFactory getInstance() {
      if (instance == null) {
        instance = new ProductoFactory();
  }
      return instance;
  }

  public Producto crearProducto(String codigo) {
    switch (codigo){
      case "CAJA10X10":
        return new Caja(10.0, 10.0, 10.0, 10.0);
      case "PELOTAFUTBOL":
        return new Pelota(20.0,30.0);
      case"PELLOTATENIS":
        return new Pelota(5.0,0.32);

    }
    return null;
  }
}
