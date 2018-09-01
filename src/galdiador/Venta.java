package galdiador;

public class Venta {
    private Double precioVentaTotal=0.0;
    private Producto producto;
    private Espectador espectador;

    private void calcularPrecioVenta(Vendedor vendedor, Producto producto){
        precioVentaTotal = vendedor.getNivelCarisma() + vendedor.getNivelExperiencia() + producto.getPrecio();
    }

    public void generarVenta(Vendedor vendedor, Espectador espectador, Producto producto){
        this.producto = producto;
        this.espectador = espectador;
        calcularPrecioVenta(vendedor, producto );
        System.out.println("El valor de la venta es de $" + this.getPrecioVentaTotal());
    }

    public Double getPrecioVentaTotal() {
        return precioVentaTotal;
    }
}
