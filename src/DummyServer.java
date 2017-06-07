import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/submit")
public class DummyServer {
    @GET
    @Produces("text/plain")
    public String getDummyMessage() {

        return "I am a dummy message";
    }
}
