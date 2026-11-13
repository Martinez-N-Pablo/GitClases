
import java.util.HashMap;

public class Inevntario {

    private HashMap<String, Producto> productos;

    public Inevntario() {
        productos = new HashMap<>();
    }

    public boolean agregarProducto(Producto producto) {
        if (producto == null || productos.containsKey(producto.getCodigo())) {
            return false;
        }

        productos.put(producto.getCodigo(), producto);
        return true;
    }

    public Producto buscarProducto(String codigo) {
        return productos.get(codigo);
    }

    public boolean actualizarStock(String codigo, int cantidad) {
        Producto producto = productos.get(codigo);

        if (producto == null) {
            return false;
        }

        int nuevaCantidad = producto.getCantidad() + cantidad;

        if (nuevaCantidad < 0) {
            return false;
        }

        producto.setCantidad(nuevaCantidad);
        return true;
    }

    public double calcularValorTotal() {
        double total = 0;

        for (Producto producto : productos.values()) {
            total += producto.getPrecio() * producto.getCantidad();
        }

        return total;
    }

    public void mostrarProductosBajoStock(int limite) {
        for (Producto producto : productos.values()) {
            if (producto.getCantidad() < limite) {
                producto.mostrarInformacion();
                System.out.println("----------------");
            }
        }
    }
}
