package flapper;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlapperController {

	@RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
	
}
