package au.com.icmconsulting.hackathon;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

/**
 * Created by helderklemp on 14/12/16.
 */
public class Hello implements RequestHandler<String, String> {
    public String handleRequest(String input, Context context) {
        String output = "Hello, " + input + "!";
        return output;
    }
}
