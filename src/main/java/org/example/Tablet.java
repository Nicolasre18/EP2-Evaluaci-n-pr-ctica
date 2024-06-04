package org.example;

public class Tablet implements IProducto {
    private String nombre;
    private String marca;
    private double precio;

    //Definir el constructor
    public Tablet(String nombre, String marca, double precio) {
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
    }

    @Override
    public String getModelo() {
        return nombre;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public void imprimeDetallesProducto() {
        System.out.println("Tablet Nombre: " + nombre + "\n" + "Marca: " + marca + "\n" +"Precio: " + precio);
    }
}
