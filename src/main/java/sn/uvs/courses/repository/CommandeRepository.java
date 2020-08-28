/**
 * 
 */
package sn.uvs.courses.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import sn.uvs.courses.model.Commande;

/**
 * @author podisto
 *
 */
// Ajoute, Lire, Modifie, Supprime
// Create, Read, Update, Delete => CRUD
@Repository
public interface CommandeRepository extends CrudRepository<Commande, Integer> {
	
	@Query("SELECT c FROM Commande c WHERE c.prix = :lePrix")
	List<Commande> findAllByPrice(@Param("lePrix") int prix);
}
