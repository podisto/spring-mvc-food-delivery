/**
 * 
 */
package sn.uvs.courses.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import sn.uvs.courses.model.Commande;
import sn.uvs.courses.repository.CommandeRepository;

/**
 * @author podisto
 *
 */
// 4 principaux verbes HTTP HyperText Transfert Protocol
// POST (CREATE), GET (READ), PUT/PATCH (UPDATE), DELETE (DELETE) 
@Controller
@RequestMapping(value = "/commandes")
public class CommandeController {
	
	@Autowired
	private CommandeRepository commandeRepository;
	
	// récupérer toutes les commandes
	// http://localhost:8080/commandes
	@GetMapping("")
	public String list() {
		System.out.println("liste des commandes");
		Iterable<Commande> listeCommande = commandeRepository.findAll();
		
		for (Commande commande: listeCommande) {
			System.out.println("Commande=" + commande);
		}
		
		return "liste_commandes";
	}
	
	// recuperer une commande par son ID
	// http://localhost:8080/commandes/1
	@GetMapping("/{id}")
	public String getById(@PathVariable int id) {
		System.out.println("recuperer la commande avec l'id= " +id);
		Optional<Commande> optional = commandeRepository.findById(id);
		if (optional.isPresent()) {
			System.out.println("Commande= " +optional.get());
		} else {
			System.out.println("La commande avec l'id " +id+ " n'existe pas.");
		}
		return "details_commande";
	}
	
	@GetMapping("/recherche") // http://localhost:8080/commandes/recherche?prix=1000
	public String findByPrice(@RequestParam("prix") String prix) {
		System.out.println("rechercher commande dont prix egal " +prix);
		List<Commande> resultats = commandeRepository.findAllByPrice(Integer.valueOf(prix));
		if (resultats.isEmpty()) {
			System.out.println("Aucun plat trouvé");
		} else {
			for (Commande resultat: resultats) {
				System.out.println("Commandes trouvées " +resultat);
			}
		}
		
		return "listes_commande";
	}

}
