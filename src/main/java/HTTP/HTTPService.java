package HTTP;
//import com.epam.http.requests.RestMethod;


import com.epam.http.annotations.GET;
import com.epam.http.requests.RestMethod;
import com.epam.http.requests.RestMethodTypes;

import java.net.Authenticator;
import java.util.Map;

/**
 * Created by Александр on 13.03.2017.
 */
public class HTTPService {

   public  RestMethodTypes get;
   public  Map<String, String> requestHeader;



      public RestMethod main = new RestMethod("https://www.google.com.ua/webhp?sourceid=chrome-instant&ion=1&espv=2&ie=UTF-8#q=c%23&*");
   //   public RestMethod main = new RestMethod("https://itechcraft.com/?s=c%23", requestHeaderMapInit(), get);

//   private Map<String, String> requestHeaderMapInit(){
//      requestHeader.put("Host", "mc.yandex.ru");
//      requestHeader.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:51.0) Gecko/20100101 Firefox/51.0");
//      requestHeader.put("Accept", "*/*");
//      requestHeader.put("Accept-Language", "en-US,en;q=0.5");
//      requestHeader.put("Accept-Encoding", "gzip, deflate, br");
//      requestHeader.put("Referer", "https://itechcraft.com/?s=c%23");
//      requestHeader.put("Cookie", "yandexuid=1118766831468835010; i=89TCiYnObQfRvdw247crs8lWg/H/tLpvtaQ8ubnaN7O5eVEruudR4fAVGVZ4qnE+tib9cFFbRpyw9yBRdPobIK8mf4A=; _ym_uid=14887994211016472645; Session_id=3:1488801568.5.0.1488801568873:EtgM2Q:1e.0|446199185.-1.0.0:3.1:78578345|159862.731693.Ujshxq7_1qsrgn-q6gae5JXW1FY; sessionid2=3:1488801568.5.0.1488801568873:EtgM2Q:1e.1|446199185.-1.0.0:3.1:78578345|159862.813718.m-qx6P5gAQxlfnKEGQHMYsH4umg; yp=1804161568.udn.czo3ODU3ODM0NTpnZzrQkNC70LXQutGB0LDQvdC00YAg0KHRgtC10YbQtdC90LrQvg%3D%3D; L=fH5FBnBEfUF9cUhTWnpfRAdKCVRtR0lhJRsNQTE2E0wICyYS.1488801568.12993.338319.d7cd1b1d6299168e485d9f76932f46f7; yandex_login=uid-aztymeqc; yabs-sid=118725651489419670; sync_ok_ua=ua");
//      requestHeader.put("Connection", "keep-alive");
//      return requestHeader;
//   }

}






