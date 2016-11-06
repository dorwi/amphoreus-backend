package hello;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by dorwi on 07.11.16.
 */
public interface PublicationRepository extends CrudRepository<Publication, Long>{

    List<Publication> findByAuteur(String auteur);
}
