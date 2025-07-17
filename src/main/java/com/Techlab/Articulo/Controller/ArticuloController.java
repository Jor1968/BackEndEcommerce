package com.Techlab.Articulo.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Techlab.Articulo.Model.Articulo;
import com.Techlab.Articulo.Service.ArticuloService;

@RestController
@RequestMapping("/api/Articulos")
@CrossOrigin(origins = "https://jor1968.github.io/Mercado_Michi-Nuevo-FRONTPARABACKEND")
//http://localhost:9090/Articulos
public class ArticuloController {
	//test
	private final ArticuloService articuloService;
	
	@Autowired
	public ArticuloController(ArticuloService articuloService) {
		this.articuloService = articuloService;
		//crearArticulo(new Articulo("cAFE", 2300, 100, 1));
	}
	
	

	@GetMapping
	public List<Articulo> listarArticulos(){
		return articuloService.listarTodos();
		
	}
	
	@GetMapping("/{id}")
	public Articulo obtenerArticulo(@PathVariable int id) {
		return articuloService.obtenerPorId(id);
	}
	@GetMapping("/{id}/{nombreDetalle}")
	public Object obtenerArticuloDetalle(@PathVariable int id, String nombreDetalle) {
		Articulo art = articuloService.obtenerPorId(id);
		switch(nombreDetalle) {
		case "codigo":
			return art.getCodigo();
		case "idString":
			return art.getIdString();
		case "nombre":
			return art.getNombre();
		case "descripcion":
			return art.getDescripcion();
		case "categoria":
			return art.getCategoria();
		case "imagenURL":
			return art.getImagenURL();
		case "precio":
			return art.getPrecio();
		case "stock":
			return art.getStock();
		case "descuento":
			return art.getDescuento();
		default:
			return null;
		}

	}
	
	
	@PostMapping
	public Articulo crearArticulo(@RequestBody Articulo nuevoArticulo) {
		return articuloService.guardar(nuevoArticulo);
	}
	
	@PutMapping("/{id}")
	public Articulo actualizarArticulo(@PathVariable int id, @RequestBody Articulo datos) {
		return articuloService.actualizar(id, datos);
		
	}
	
	@DeleteMapping("/{id}")
	public void EliminarArticulo(@PathVariable int id) {
		articuloService.eliminar(id);
		
	}
	
	
	
	
	


	
	
}
