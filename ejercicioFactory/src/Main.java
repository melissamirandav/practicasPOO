import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Main {
    ProductoFactory productoFactory = ProductoFactory.getInstance();

    Almacen almacen = new Almacen();
    almacen.agregarProducto(ProductoFactory.crearProducto("CAJA10X10"));
}
