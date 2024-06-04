package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Tienda implements ITienda {
    private final List<IProducto> productos;

    public Tienda() {
        this.productos = new ArrayList<>();
    }


    //Implementar los métodos
    @Override
    public void agregarProducto(IProducto producto) {
        productos.add(producto);
    }

    @Override
    public void listarProductos() {
        for (IProducto producto : productos) {
            producto.imprimeDetallesProducto();
        }
    }

    @Override
    public double obtenerPromedioPrecioProductos() {
        double suma=0;
        int contador = 0;
        for (IProducto producto : productos) {
            suma +=  producto.getPrecio();
            contador ++;
        }
        double promedio=suma/contador;
        return promedio;
    }

    @Override
    public IProducto obtenerProductoMasCostoso() {
        IProducto MasCostoso = productos.get(0);
        for (IProducto producto : productos) {
            if (producto.getPrecio() > MasCostoso.getPrecio()) {
                MasCostoso = producto;
            }
        }
        return MasCostoso;
    }

    //Punto extra. El valor a buscar puede ser parte del nombre.
    public Boolean buscarProductoPorNombre(String nombre) {
        //Implementar método
        for (IProducto producto : productos) {
                if (producto.getModelo().contains(nombre)) {
                    return true;
                }
            }
        return false;
    }
}
