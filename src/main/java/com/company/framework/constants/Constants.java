package com.company.framework.constants;


public interface Constants {

    String PROPS_URL = "url";

    String PROPS_WIN_CHROME_PATH = "win.browser.chrome.path";
    String PROPS_WIN_IE_PATH = "win.browser.ie.path";
    String PROPS_WIN_FIREFOX32_PATH = "win.browser.gecko.x32.path";
    String PROPS_WIN_FIREFOX64_PATH = "win.browser.gecko.x64.path";

    String PROPS_MAC_CHROME_PATH = "mac.browser.chrome.path";
    String PROPS_MAC_FIREFOX_PATH = "mac.browser.gecko.path";

    String PROPS_LINUX_CHROME_PATH = "linux.browser.chrome.path";
    String PROPS_LINUX_FIREFOX_PATH = "linux.browser.gecko.path";

    /* Other constants */
    String SYSTEM_PROP_CHROME = "webdriver.chrome.driver";
    String SYSTEM_PROP_IE = "webdriver.edge.driver";
    String SYSTEM_PROP_FIREFOX = "webdriver.gecko.driver";
    String PROPS_MAIL_LIST = "mailList";

    String PROPS_APPIUM_SERVER_ADDRESS = "appium.server.address";
    String PROPS_APPIUM_SERVER_PORT = "appium.server.port";

    String PROPS_APPIUM_DRIVER_EXECUTABLE = "appium.driver.executable";
    String PROPS_APPIUM_JS = "appium.js";

    String PROPS_WIN_APPIUM_DRIVER_EXECUTABLE = "appium.win.driver.executable";
    String PROPS_WIN_APPIUM_JS = "appium.win.js";

    /* Config File constants */
    String PROPS_WEBDRIVER_CONFIG = "webdriver.configs.path";
    String PROPS_APPIUM_CONFIG = "appium.configs.path";
    String PROPS_REST_CONFIG = "rest.configs.path";
    String PROPS_DB_CONFIG = "db.configs.path";
    String PROPS_DBNONSQL_CONFIG = "dbnonsql.configs.path";
    String PROPS_SOAP_CONFIG = "soap.configs.path";


    /* Grid */
    String PROPS_GRID_SERVER = "grid.server.url";
}
