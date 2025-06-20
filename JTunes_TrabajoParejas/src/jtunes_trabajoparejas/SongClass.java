
package jtunes_trabajoparejas;

import javax.swing.ImageIcon;


public class SongClass {
    private int codigo;
    private String nombre;
    private double precio;
    private int sumaEstrellas;
    private int totalReviews;
    private ImageIcon imagenDisco;
    
    public SongClass(int codigo, String nombre, double precio, ImageIcon imagenDisco){
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.imagenDisco = imagenDisco;
        sumaEstrellas =0;
        totalReviews=0;
        
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public ImageIcon getImagenDisco() {
        return imagenDisco;
    }
    
    public void addStars(int stars){
        if(stars>=0 && stars<=5){
        this.sumaEstrellas+=stars;
        totalReviews++;
        }
    }
    
    public double rating(){
        if(totalReviews!=0){
            return (double) sumaEstrellas/totalReviews;
        }else{
            return 0.0;
        }
    }
    
    
}
