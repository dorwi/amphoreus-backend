package hello;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by dorwi on 07.11.16.
 */
@RepositoryRestResource(collectionResourceRel = "publications", path = "publications")
public interface PublicationRepository extends PagingAndSortingRepository<Publication, Long> {

    @CrossOrigin(origins = "http://localhost:9000")
    @Query(value = "SELECT p FROM Publication p where p.auteur like :auteur")
    List<Publication> findAuteurByRegexp(@Param("auteur") String auteur);

}
