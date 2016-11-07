package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dorwi on 07.11.16.
 */

@RestController
public class PublicationController {

    PublicationRepository publicationRepository;

    @CrossOrigin
    @RequestMapping("/publications")
    public List<Publication> PublicationController() {
        List<Publication> list = new ArrayList<>();
        list.add(new Publication());
        list.add(new Publication());
        return list;
        //return (List<Publication>) publicationRepository.findAll();
    }
}
