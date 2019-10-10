package Microservice2.Bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Hello world!
 *
 */

@SpringBootApplication
@RestController
public class App 
{
	@Autowired
	ServiceConfig configure = new ServiceConfig();
    public static void main( String[] args )
    {
    	SpringApplication.run(App.class, args);
    }
    @RequestMapping("/")
	public String getQuote() {
    	return configure.getQuote();
    }
}
