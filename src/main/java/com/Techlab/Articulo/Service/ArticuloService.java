package com.Techlab.Articulo.Service;

import java.util.ArrayList;
import java.util.stream.*;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.Techlab.Articulo.Model.Articulo;
import com.Techlab.Articulo.Repository.ArticuloRepository;

@Service
public class ArticuloService {
	private final ArticuloRepository repo;
	@Autowired
	public ArticuloService(ArticuloRepository repo) {
		this.repo = repo;
	}
	//private List<Articulo> articulos = new ArrayList<>();
	//private int contadorId = 1;
	
	

	@GetMapping
	public List<Articulo> listarTodos(){
		//return Arrays.asList(new Articulo("Cafe", 200, 100));
		//return articulos;
		return repo.findAll();

}
	
	public Articulo obtenerPorId(int id){
		/*return articulos.stream()
		.filter(p -> p.getCodigo() == id)
		.findFirst()
		.orElse(null);
		*/
		return repo.findById(id).orElse(null);
	}
	
	public Articulo guardar(Articulo p){
		/*p.setCodigo(contadorId++);
		articulos.add(p);
		return p;
		*/
		return repo.save(p);
		
	}
	
	public Articulo actualizar(int id,Articulo dato){
		Articulo p = obtenerPorId(id);
		if (p != null){
			p.setNombre(dato.getNombre());
			p.setPrecio(dato.getPrecio());
			p.setStock(dato.getStock());
			return repo.save(p);
			
		}
		//return p;
		return null;
		
	}
	
	public Boolean eliminar(int id){
		//return articulos.removeIf(p -> p.getCodigo() == id);
		if(repo.existsById(id)) {
			repo.deleteById(id);
			return true;
		}
		return false;
		
	}
}
