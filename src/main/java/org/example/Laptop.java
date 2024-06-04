package org.example;

public class Laptop implements IProducto{
    private int cantidad;
    private String nombre;
    private String marca;
    private double precio;

    //Definir el constructor
    public Laptop(String nombre, String marca, double precio, int cantidad) {
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.cantidad = cantidad;
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
        System.out.println("Laptop Nombre: " + nombre + "\n" + "Marca: " + marca + "\n" +"Precio: " + precio);
    }
}

