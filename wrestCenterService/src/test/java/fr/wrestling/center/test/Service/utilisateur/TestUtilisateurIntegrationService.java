package fr.wrestling.center.test.Service.utilisateur;

import java.util.Calendar;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import fr.wrestling.center.Service.utilisateur.UtilisateurService;
import fr.wrestling.center.entity.utilisateur.Utilisateur;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "classpath:context-config/utilisateur-testintegration.xml")
@EnableJpaRepositories
@SpringBootTest
public class TestUtilisateurIntegrationService {
	
	@Autowired
	private UtilisateurService utilisateurService;
	
	@Test
	public void sauvegarderNouvelUtilisateur() {
		Utilisateur utilisateur = new Utilisateur();
		utilisateur.setLogin("mehdi");
		utilisateur.setMotDePasse("motdepasse");
		utilisateur.setEmail("mehdi@test.fr");
		utilisateur.setDateCreation(Calendar.getInstance().getTime());
		utilisateur.setDerniereConnexion(Calendar.getInstance().getTime());
		
		Long nouvelUtilisateurId = this.utilisateurService.sauvegarderNouvelUtilisateur(utilisateur);
		
		System.out.println(nouvelUtilisateurId);
	}

}
