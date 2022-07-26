package fr.bouget.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.bouget.spring.model.Apprenant;

/**
 * Interface pour l'entity Apprenant
 * 
 */

@Repository
public interface ApprenantRepository  extends JpaRepository<Apprenant, Integer> {

	// rien à ajouter car toutes les fonctionnalités CRUD sont existantes dans la 
	// classe JpaRepository... c'est cool !) 
}
