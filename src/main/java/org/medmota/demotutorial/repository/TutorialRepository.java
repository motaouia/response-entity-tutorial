package org.medmota.demotutorial.repository;

import java.util.List;

import org.medmota.demotutorial.model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TutorialRepository extends JpaRepository<Tutorial, Long>{
	//returns all Tutorials with published having value as input published
	List<Tutorial> findByPublished(boolean published);
	
	//returns all Tutorials which title contains input title
	List<Tutorial> findByTitleContaining(String title);

}
