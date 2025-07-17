package com.Techlab.Articulo.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "articulo")
public class Articulo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codigo;
	
	private String idString;
	private String nombre;
	private String descripcion;
	private String categoria;
	private String imagenURL;
	private Integer precio;
	private Integer stock;
	private Double descuento;
	

	
	public Articulo() {}
	
	public Articulo(String idString, String nombre, String categoria, String imagenURL, String descripcion, Integer precio, Integer stock, Double descuento) {
		//this.codigo = codigo;
		
		this.idString = idString;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.categoria = categoria;
		this.imagenURL = imagenURL;
		this.precio = precio;
		this.stock = stock;
		this.descuento = descuento;
	}

	
	
	

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getIdString() {
		return idString;
	}

	public void setIdString(String idString) {
		this.idString = idString;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getImagenURL() {
		return imagenURL;
	}

	public void setImagenURL(String imagenURL) {
		this.imagenURL = imagenURL;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public String mostrar() {
		return "codigo= " + codigo +  ", nombre= " + nombre + ", idString= " + idString + ", stock= " + stock + ", precio= "  + precio + ", descuento= " + descuento;
		
	}
	
	public Double getDescuento() {
		return descuento;
	}

	public void setDescuento(Double descuento) {
		this.descuento = descuento;
	}

	@Override
	public String toString() {
		return mostrar();
		
	}

	
	

}
