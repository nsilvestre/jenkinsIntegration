package com.company.framework.constants;

public class OutOfStockCons {

    /* Partners API URLs */
    public static final String EATSA_API_URL = "https://api.stage.keenwawa.com/api/v1/stores/";
    public static final String WOWBAO_API_URL = "https://api.wowbao-stage.keenwawa.com/api/v1/stores/";
    public static final String ROTI_API_URL = "https://api.roti-stage.keenwawa.com/api/v1/stores/";
    public static final String DELIVEROO_API_URL = "https://api.deliveroo-stage.keenwawa.com/api/v1/stores/";

    /* Partners default stores */
    public static final String EATSA_STORE = "418fdc10-5881-11e4-8ed6-0800200c9a66";
    public static final String ROTI_STORE = "ee2633d2-3a06-11e9-b210-d663bd873d93";
    public static final String WOWBAO_STORE = "8623b59e-978d-444e-a0ad-cedf3e1a393d";
    public static final String DELIVEROO_STORE = "379e0f56-242e-4483-9972-a34aef5482fe";


    /* ROTI items and modifiers*/
    public static final String SIGNATURE_RICE_PLATE = "505e5ca7-98f2-495c-9b76-1bb4128a86d8";

    public static final String PITA = "be0e9999-6fc6-422f-9973-9bb5f5be898d";


    /* Return Item ID */
    public static String getItemID(String item) {
        String itemId = "";

        switch (item) {
            case "Signature Rice Plate":
                itemId = SIGNATURE_RICE_PLATE;
        }

        return itemId;
    }

    /* Return Item ID */
    public static String getModifierID(String modifier) {
        String modifierId = "";

        switch (modifier) {
            case "Pita":
                modifierId = PITA;
        }

        return modifierId;
    }

}
