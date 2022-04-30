/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.unlar.object;

/**
 *
 * @author FlorBarrera
 */
public class Pelicula {
    private String nombre;
    private String genero;
    private Float duracion;
    private String director;
    private Integer stock;
    private Integer anioEstreno;

    public Pelicula() {
    }

    public Pelicula(String nombre, String genero, Float duracion, String director, Integer stock, Integer anioEstreno) {
        this.nombre = nombre;
        this.genero = genero;
        this.duracion = duracion;
        this.director = director;
        this.stock = stock;
        this.anioEstreno = anioEstreno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Float getDuracion() {
        return duracion;
    }

    public void setDuracion(Float duracion) {
        this.duracion = duracion;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getAnioEstreno() {
        return anioEstreno;
    }

    public void setAnioEstreno(Integer anioEstreno) {
        this.anioEstreno = anioEstreno;
    }

    public void setCategoria(Categoria categoria) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setTitulo(String lejos_de_casa) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
}