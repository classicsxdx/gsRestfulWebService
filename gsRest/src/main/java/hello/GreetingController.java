
/*Spring RESTful tutorial from Spring docs
http://spring.io/guides/gs/rest-service/

	Jan 14, 2014*/

package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Controller;

/*These libraries are specific to the javadoc tutorials*/
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class GreetingController {
	
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	/*The @RequestMapping annotation ensures that HTTP requests 
	 * to /greeting are mapped to the greeting() method.*/
	
	/*Use @RequestMapping(method=GET) to narrow this mapping. 
	 * but right now it works with GET,POST, and PUT*/
	
	/*@RequestParam binds the value of the query string parameter name into the 
	name parameter of the greeting() method. This query string parameter is not 
	required; if it is absent in the request, the defaultValue of "World" is used.*/
	
	@RequestMapping("/greeting")
	public @ResponseBody Greeting greeting(@RequestParam(value="name", required=false, defaultValue="World") String name) {
		
		/*This returns our JSON output to the screen*/
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
}
