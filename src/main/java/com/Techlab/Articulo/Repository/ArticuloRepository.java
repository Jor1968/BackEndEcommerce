package com.Techlab.Articulo.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.Techlab.Articulo.Model.Articulo;

	public interface ArticuloRepository extends JpaRepository<Articulo, Integer> {

		
		
	}

