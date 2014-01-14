
/*Spring RESTful tutorial from Spring docs
http://spring.io/guides/gs/rest-service/

	Jan 14, 2014*/

package hello;

public class Greeting {
	
	private final long id;
	private final String content;
	
	public Greeting(long id, String content) {
		this.id = id;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
	
	
	

}
