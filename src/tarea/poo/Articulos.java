/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea.poo;

/**
 *
 * @author esteb
 */
public class Articulos {
    public int SKU;
    private int Existencias;
    private double Precio;
    private double Costo;
    public String Descripcion;
    
    public Articulos(int SKU,double Costo,String Descripcion){
        this.SKU=SKU;
        this.Costo=Costo;
        this.Descripcion=Descripcion;
        
    }
    public Articulos(){
        this(0,0.00,"Sin Descripcion");
        }
    public int getSKU(){
        return this.SKU;
    }
    public void setSKU(int SKU){
        this.SKU=SKU;
    }
    public int getExistencias(){
         return this.Existencias;
     }
    public void setExistencias (int Existencia){
         this.Existencias=Existencia;
     }
    public double getPrecio(){
         return this.Precio;
     }
    public void setPredio(double Precio){
         this.Precio=Precio;
     }
    public double getCosto(){
         return this.Costo;
     }
    public void setCosto(double Costo){
         this.Costo=Costo;
     }
    public String getDescripcion(){
        return this.Descripcion;
    }
    public void setDescipcion(String Descripcion){
        this.Descripcion=Descripcion;
    }
    public void compra(int e, double c) {
       setExistencias(e);
       setCosto(c);
        
    }
       public boolean venta(int n){
           if(getExistencias()>=n){
               setExistencias(getExistencias()-n);
           return true;
       }else{ return false;
           }
           }
       public double verificarExistencias(){
           return Existencias;
         
       }
       public void actualizaPrecio(double precio){
           this.Precio=precio;
       }
}
    
