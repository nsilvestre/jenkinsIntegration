package com.company.framework.utils;

import com.company.framework.base.BaseUtil;
import java.util.Map;


public class JsonConfigReader {

    String path = System.getProperty("user.dir");
    String jsonFileConfigPath;

    public Map<String, Object> getBrowserJsonConfig(String fileConfig) {
        jsonFileConfigPath = path + BaseUtil.getWebdriverConfigPath() + fileConfig + ".json";
        return getConfig(jsonFileConfigPath);
    }

    public Map<String, Object> getAppiumJsonConfig(String fileConfig) {
        jsonFileConfigPath = path + BaseUtil.getAppiumConfigPath() + fileConfig + ".json";
        return getConfig(jsonFileConfigPath);
    }

    public Map<String, Object> getRestJsonConfig(String fileConfig) {
        jsonFileConfigPath = path + BaseUtil.getRestConfigPath() + fileConfig + ".json";
        return getConfig(jsonFileConfigPath);
    }

    public Map<String, Object> getDbJsonConfig(String fileConfig) {
        jsonFileConfigPath = path + BaseUtil.getDbConfigPath() + fileConfig + ".json";
        return getConfig(jsonFileConfigPath);
    }

    public Map<String, Object> getSoapJsonConfig(String fileConfig) {
        jsonFileConfigPath = path + BaseUtil.getSoapConfigPath() + fileConfig + ".json";
        return getConfig(jsonFileConfigPath);
    }

    public Map<String, Object> getDbNonSqlJsonConfig(String fileConfig) {
        jsonFileConfigPath = path + BaseUtil.getDbNonSqlConfigPath() + fileConfig + ".json";
        return getConfig(jsonFileConfigPath);
    }

    public Map<String, Object> getConfig(String jsonFileConfigPath) {
        return JsonReader.getJsonObject(jsonFileConfigPath);
    }

}
