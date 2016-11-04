/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.controller;

import co.edu.udea.entity.Item;
import co.edu.udea.entity.Producto;
import co.edu.udea.modelo.ProductoDAO;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


/**
 *
 * @author Yoiner Esteban Gomez Ayala yoiner.gomez22@gmail.com
 */
@ManagedBean(name = "cc")
@SessionScoped
public class CarroCompra {

    private List<Item> carro = new ArrayList<Item>();
    private double total;
    
    
    
    /**
     * Creates a new instance of ProductoController
     */
    public CarroCompra() {
    }


    public List<Item> getCarro() {
        return carro;
    }

    public void setCarro(List<Item> carro) {
        this.carro = carro;
    }

    public double getTotal() {
        total = 0;
        for(Item i : carro){
            total = total+(i.getCantidad()*i.getP().getPrecio().doubleValue());
        }
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    private String addCarro(Producto p){
        for (Item item : carro) {
            if (item.getP().getId()==p.getId()) {
                item.setCantidad(item.getCantidad()+1);
                return "cart";
            }
            
        }
        Item i = new Item();
        i.setCantidad(1);
        i.setP(p);
        carro.add(i);
        return "cart";
    }
    
    public void update(){
        
    }
    
    public void remove(Item i){
        for(Item item : carro){
            if(item.equals(i)){
                carro.remove(item);
            }
        }
    }
    
    public String payment(){
        return "payment";
    }
    
}
