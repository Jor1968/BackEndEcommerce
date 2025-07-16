package com.Techlab.Articulo.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "articulo")
public class Articulo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codigo;
	
	private String nombre;
	private Double precio;
	private Integer stock;
	

	
	public Articulo() {}
	
	public Articulo(String nombre, Double precio, Integer stock) {
		//this.codigo = codigo;
		this.precio = precio;
		this.nombre = nombre;
		this.stock = stock;
	}

	
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public String mostrar() {
		return "codigo= " + codigo +  ", nombre= " + nombre + ", stock= " + stock + ", precio= "  + precio;
		
	}
	
	@Override
	public String toString() {
		return mostrar();
		
	}

	
	

}
