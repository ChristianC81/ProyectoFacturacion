/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author chris
 */
public class ItemFactura {
    int id_itemfactura;
    int id_factura;
    String detalle;
    int cantidad;
    double precio;
    double iva;

    public ItemFactura() {
    }
    
    public ItemFactura(int id_factura, String detalle, int cantidad, double precio, double iva) {
        this.id_factura = id_factura;
        this.detalle = detalle;
        this.cantidad = cantidad;
        this.precio = precio;
        this.iva = iva;
    }

    public ItemFactura(int id_itemfactura, int id_factura, String detalle, int cantidad, double precio, double iva) {
        this.id_itemfactura = id_itemfactura;
        this.id_factura = id_factura;
        this.detalle = detalle;
        this.cantidad = cantidad;
        this.precio = precio;
        this.iva = iva;
    }
    
}
