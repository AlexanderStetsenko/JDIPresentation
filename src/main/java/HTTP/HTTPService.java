package HTTP;
//import com.epam.http.requests.RestMethod;


import com.epam.http.annotations.GET;
import com.epam.http.requests.RestMethod;
import com.epam.http.requests.RestMethodTypes;
import org.codehaus.groovy.runtime.metaclass.MethodMetaProperty;

import java.net.Authenticator;
import java.util.Map;

/**
 * Created by Александр on 13.03.2017.
 */
public class HTTPService {

   public  RestMethodTypes get;
   public  Map<String, String> requestHeader;


      public RestMethod main = new RestMethod("http://10.10.230.74:3001/api/getUsers");


}






