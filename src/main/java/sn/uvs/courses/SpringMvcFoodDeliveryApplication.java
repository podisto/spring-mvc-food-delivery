package sn.uvs.courses;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import sn.uvs.courses.model.Commande;

@SpringBootApplication
public class SpringMvcFoodDeliveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMvcFoodDeliveryApplication.class, args);
		
		// instancier la classe Commande cad creer un objet Commande
		Commande commandeDeBarham = new Commande();
		
		commandeDeBarham.setQuantite(3);
		commandeDeBarham.setAddresse("HLM Grand Yoff");
		commandeDeBarham.setTelephone("770000000");
		commandeDeBarham.setDateCreation(new Date());
		commandeDeBarham.setPlat("Mbahal");
		commandeDeBarham.setPrix(400);
		commandeDeBarham.setNom("Thioub");
		commandeDeBarham.setPrenom("Barham");
		commandeDeBarham.getTotal();
		System.out.println("Commande = " +commandeDeBarham);
		
		Commande commandeDeDiassy = new Commande();
		System.out.println("commandeDeDiassy= " + commandeDeDiassy);
	}

}
