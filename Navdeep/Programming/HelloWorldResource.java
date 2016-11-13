package helloworld ;

// REF:  http://restlet.com/technical-resources/restlet-framework/guide/2.3/editions/jse/overview

import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

/**
 * Resource which has only one representation.
 */
public class HelloWorldResource extends ServerResource {

    @Get
    public String represent() {
        return "The gammer current score is : ";
    }
    
    @Post
    public String represent() {
        return "Posting the details of the gamer.";
    }

    @Put
    public String represent() {
        return "Updating the details of the gamer.";
    }
    
    @Delete
    public String represent() {
        return "Deleting the details of the gamer.";
    }
}
