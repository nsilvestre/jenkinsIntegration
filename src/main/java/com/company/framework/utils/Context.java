package com.company.framework.utils;

import com.jayway.restassured.response.Response;
import cucumber.api.DataTable;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.WebDriver;

import java.util.*;

public class Context {
    private final Map<String, Object> context = new HashMap<String, Object>();

    public Context setValue(String key, DataTable value) {
        context.put(key, value);

        return this;
    }

    public Context setValue(String key, HashMap value) {
        context.put(key, value);

        return this;
    }

    public Context setValue(String key, String value) {
        context.put(key, value);

        return this;
    }

    public Context setValue(String key, Map value) {
        context.put(key, value);

        return this;
    }

    public Context setValue(String key, Response value) {
        context.put(key, value);

        return this;
    }

    public Context setValue(String key, HashMap<String, Object>[] value) {
        context.put(key, value);

        return this;
    }

    public Context setValue(String key, AppiumDriverLocalService value) {
        context.put(key, value);

        return this;
    }

    ////////////////// New variables for Refactor //////////////////
    public Context setValue(String key, WebDriver value) {
        context.put(key, value);

        return this;
    }
    ////////////////////////////////////////////////////////////////

    @SuppressWarnings("unchecked")
    public Object getValue(String key) {
        return context.get(key);
    }

}
