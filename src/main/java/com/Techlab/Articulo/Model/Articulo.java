package com.Techlab.Articulo.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "articuloPP")
public class Articulo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long codigo;
	
	private String nombre;
	private Double precio;
	private Long stock;

	
	public Articulo() {}
	
	public Articulo(String nombre, Double precio, Long stock, Long codigo) {
		this.codigo = codigo;
		this.precio = precio;
		this.nombre = nombre;
		this.stock = stock;
	}

	
	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
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

	public Long getStock() {
		return stock;
	}

	public void setStock(Long stock) {
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
