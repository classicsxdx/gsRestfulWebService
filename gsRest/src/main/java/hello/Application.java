/*Spring RESTful tutorial from Spring docs
http://spring.io/guides/gs/rest-service/

	Jan 14, 2014*/

package hello;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;

/*The main() method defers to the SpringApplication helper class, 
providing Application.class as an argument to its run() method. 
This tells Spring to read the annotation metadata from Application 
and to manage it as a component in the Spring application context.*/

@ComponentScan
@EnableAutoConfiguration
public class Application {

	public static void main(String[] args) {
	SpringApplication.run(Application.class, args);
	

	}

}
