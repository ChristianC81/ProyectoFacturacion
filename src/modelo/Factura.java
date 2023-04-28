/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author chris
 */
public class Factura {
    int id_factura;
    ArrayList<Cliente> id_cliente;
    String ruc;
    Date fecha;
    ArrayList<ItemFactura> listaItemFactura;

    public Factura() {
    }

    public Factura(ArrayList<Cliente> id_cliente, String ruc, Date fecha, ArrayList<ItemFactura> listaItemFactura) {
        this.id_cliente = id_cliente;
        this.ruc = ruc;
        this.fecha = fecha;
        this.listaItemFactura = listaItemFactura;
    }

    public Factura(int id_factura, ArrayList<Cliente> id_cliente, String ruc, Date fecha, ArrayList<ItemFactura> listaItemFactura) {
        this.id_factura = id_factura;
        this.id_cliente = id_cliente;
        this.ruc = ruc;
        this.fecha = fecha;
        this.listaItemFactura = listaItemFactura;
    }

    public int getId_factura() {
        return id_factura;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }

    public ArrayList<Cliente> getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(ArrayList<Cliente> id_cliente) {
        this.id_cliente = id_cliente;
    }

  
    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public ArrayList<ItemFactura> getListaItemFactura() {
        return listaItemFactura;
    }

    public void setListaItemFactura(ArrayList<ItemFactura> listaItemFactura) {
        this.listaItemFactura = listaItemFactura;
    }
    
    public double  subtotal(){
        
        return 0;   
    }
     public double  iva(){
        
        return 0;   
    }
      public double  total(){
        
        return 0;   
    }
}
