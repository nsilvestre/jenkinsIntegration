package com.company.framework.utils;

import com.company.framework.constants.EatsaCons;
import com.company.framework.constants.OutOfStockCons;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;

import java.util.HashMap;
import java.util.Map;


public class APIUtils {

    public static int markItemAsOOS(String item){
        String baseURI = getOutOfStockBaseURI(item, "item");
        return OutOfStockAPIExecutor(baseURI, "true");
    }


    public static int markItemAsInStock(String item){
        String baseURI = getOutOfStockBaseURI(item, "item");
        return OutOfStockAPIExecutor(baseURI, "false");
    }


    public static int markModifierAsOOS(String modifier){
        String baseURI = getOutOfStockBaseURI(modifier, "modifier");
        return OutOfStockAPIExecutor(baseURI, "true");
    }


    public static int markModifierAsInStock(String modifier){
        String baseURI = getOutOfStockBaseURI(modifier, "modifier");
        return OutOfStockAPIExecutor(baseURI, "false");
    }


    /* Create the Out of Stock API URL. It receives the element to change the status and its type (item or modifier) */
    private static String getOutOfStockBaseURI(String element, String OOSType) {
        String baseURI = "";

        switch (EatsaCons.CURRENT_PARNER){
            case "iOS":
                baseURI = OutOfStockCons.EATSA_API_URL+ OutOfStockCons.EATSA_STORE;
                break;
            case "ROTI":
                baseURI = OutOfStockCons.ROTI_API_URL+ OutOfStockCons.ROTI_STORE;
                break;
            case "WOWBAO":
                baseURI = OutOfStockCons.WOWBAO_API_URL+ OutOfStockCons.WOWBAO_STORE;
                break;
            case "DELIVEROO":
                baseURI = OutOfStockCons.DELIVEROO_API_URL+ OutOfStockCons.DELIVEROO_STORE;
                break;
        }

        if(OOSType.equals("item"))
            baseURI = baseURI+"/item_stocks/"+ OutOfStockCons.getItemID(element);
        else if(OOSType.equals("modifier"))
            baseURI = baseURI+"/modifier_stocks/"+ OutOfStockCons.getModifierID(element);

        return baseURI;
    }


    /* Get the Auth Token based on the current Partner */
    private static String getAuthToken(){
        String token = "";

        switch (EatsaCons.CURRENT_PARNER){
            case "iOS":
                token = "98b91547303bf94a6d9634eeb421fe68a5cb4b71";
                break;
            case "ROTI":
                token = "c8a52019edf0c2193e133a9d256e185c";
                break;
            case "WOWBAO":
                token = "59d56d668046c9afaf05c4b0d022be0a491d94e4";
                break;
            case "DELIVEROO":
                token = "a42704262247470b5b49c2b21452891c";
                break;
        }

        return token;
    }


    /* Out of Stock API executor */
    private static int OutOfStockAPIExecutor(String baseURI, String value) {

        RestAssured.baseURI = baseURI;

        Map<String, String> bodyTrue = new HashMap<>();
        bodyTrue.put("out_of_stock", value);

        RequestSpecification httpRequest = RestAssured.given()
                .header("content-type", "application/json; charset=utf-8")
                .header("x-request-id", "x-request-id")
                .header("x-authtoken", getAuthToken())
                .body(bodyTrue);

        Response response = httpRequest.put();

        return response.statusCode();

    }


}
