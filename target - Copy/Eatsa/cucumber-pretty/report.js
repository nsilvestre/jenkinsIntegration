$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/company/test/features/ANDROID/AddContact.feature");
formatter.feature({
  "line": 1,
  "name": "Add new contact",
  "description": "",
  "id": "add-new-contact",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Create contact",
  "description": "",
  "id": "add-new-contact;create-contact",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@working"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "\u003cconfig\u003e appium driver",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I tap Add button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I enter the first name and last name",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I enter the phone number",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I tap save",
  "keyword": "And "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "add-new-contact;create-contact;",
  "rows": [
    {
      "cells": [
        "config"
      ],
      "line": 13,
      "id": "add-new-contact;create-contact;;1"
    },
    {
      "cells": [
        "android_emulator"
      ],
      "line": 14,
      "id": "add-new-contact;create-contact;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 1057497,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Create contact",
  "description": "",
  "id": "add-new-contact;create-contact;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@working"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "android_emulator appium driver",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I tap Add button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I enter the first name and last name",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I enter the phone number",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I tap save",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "android_emulator",
      "offset": 0
    }
  ],
  "location": "MobileSteps.setup_appium(String)"
});
formatter.result({
  "duration": 8999670304,
  "status": "passed"
});
formatter.match({
  "location": "MainContactsSteps.iTapAddButton()"
});
formatter.result({
  "duration": 996566922,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewContactSteps.iEnterTheFirstNameAndLastName()"
});
formatter.result({
  "duration": 5585899768,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewContactSteps.iEnterThePhoneNumber()"
});
formatter.result({
  "duration": 40198,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewContactSteps.iTapSave()"
});
formatter.result({
  "duration": 638892797,
  "status": "passed"
});
formatter.after({
  "duration": 115658,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 17,
  "name": "Delete contact",
  "description": "",
  "id": "add-new-contact;delete-contact",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 16,
      "name": "@working"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "\u003cconfig\u003e appium driver",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "I select the contact",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "I tap the menu",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I tap delete",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I tap delete from the alert",
  "keyword": "And "
});
formatter.examples({
  "line": 25,
  "name": "",
  "description": "",
  "id": "add-new-contact;delete-contact;",
  "rows": [
    {
      "cells": [
        "config"
      ],
      "line": 26,
      "id": "add-new-contact;delete-contact;;1"
    },
    {
      "cells": [
        "android_emulator"
      ],
      "line": 27,
      "id": "add-new-contact;delete-contact;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 110721,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "Delete contact",
  "description": "",
  "id": "add-new-contact;delete-contact;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 16,
      "name": "@working"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "android_emulator appium driver",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "I select the contact",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "I tap the menu",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I tap delete",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I tap delete from the alert",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "android_emulator",
      "offset": 0
    }
  ],
  "location": "MobileSteps.setup_appium(String)"
});
formatter.result({
  "duration": 12003812846,
  "status": "passed"
});
formatter.match({
  "location": "MainContactsSteps.iSelectTheContact()"
});
formatter.result({
  "duration": 984436196,
  "status": "passed"
});
formatter.match({
  "location": "MainContactsSteps.iTapTheMenu()"
});
formatter.result({
  "duration": 2250006436,
  "status": "passed"
});
formatter.match({
  "location": "MainContactsSteps.iTapDelete()"
});
formatter.result({
  "duration": 1181864278,
  "status": "passed"
});
formatter.match({
  "location": "MainContactsSteps.iTapDeleteFromTheAlert()"
});
formatter.result({
  "duration": 2310291230,
  "status": "passed"
});
formatter.after({
  "duration": 37730,
  "status": "passed"
});
});