/**
 * 
 */
package sn.uvs.courses;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import sn.uvs.courses.model.Commande;
import sn.uvs.courses.repository.CommandeRepository;

/**
 * @author podisto
 *
 */
@Component
public class InitData implements CommandLineRunner {

	@Autowired
	private CommandeRepository commandeRepository;

	@Override
	public void run(String... args) throws Exception {
		// instancier la classe Commande cad creer un objet Commande
		Commande commandeDeBarham = new Commande();
		commandeDeBarham.setQuantite(3);
		commandeDeBarham.setAddresse("HLM Grand Yoff");
		commandeDeBarham.setTelephone("770000000");
		commandeDeBarham.setDateCreation(new Date());
		commandeDeBarham.setPlat("Mbahal");
		commandeDeBarham.setPrix(600);
		commandeDeBarham.setNom("Thioub");
		commandeDeBarham.setPrenom("Barham");
		// commandeRepository.save(commandeDeBarham);

		Commande commandeDeDiassy = new Commande();
		commandeDeDiassy.setQuantite(1);
		commandeDeDiassy.setAddresse("Diamalaye");
		commandeDeDiassy.setTelephone("770000001");
		commandeDeDiassy.setDateCreation(new Date());
		commandeDeDiassy.setPlat("Tieb");
		commandeDeDiassy.setPrix(1000);
		commandeDeDiassy.setNom("Diassy");
		commandeDeDiassy.setPrenom("Mamadou");
		// commandeRepository.save(commandeDeDiassy);
	}
}
