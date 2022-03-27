package fr.wrestling.center.Service.utilisateur;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.wrestling.center.DAO.utilisateur.UtilisateurRepository;
import fr.wrestling.center.entity.utilisateur.Utilisateur;

@Service
public class UtilisateurService implements Serializable{

	private static final long serialVersionUID = -8669000248004301986L;
	
	@Autowired
	private UtilisateurRepository utilisateurRepository;
	
	
	public Long sauvegarderNouvelUtilisateur(Utilisateur utilisateur) {
		return utilisateurRepository.save(utilisateur).getId();
	}
	
}
