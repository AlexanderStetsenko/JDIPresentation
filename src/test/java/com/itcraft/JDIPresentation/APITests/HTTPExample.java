package com.itcraft.JDIPresentation.APITests;

import HTTP.HTTPService;
import com.itcraft.JDIPresentation.uiTests.TestsBase;
import org.testng.annotations.Test;



//import static HTTP.HTTPService.main;

/**
 * Created by Александр on 13.03.2017.
 */
public class HTTPExample{
    @Test
    public static void isAliveTest() {

        HTTPService httpService = new HTTPService();



        System.out.println(httpService.main.get().status);
        String respons = httpService.main.get().body.toString();





    }
}
