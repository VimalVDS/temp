$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/vimal/eclipse-workspace/BDDFramework/src/main/java/Feature/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login feature",
  "description": "",
  "id": "login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Login scenario",
  "description": "",
  "id": "login-feature;login-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "title is Rediffmail",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user enter username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 6
    },
    {
      "cells": [
        "vimalkumar",
        "123456"
      ],
      "line": 7
    },
    {
      "cells": [
        "suresh",
        "123456"
      ],
      "line": 8
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 9,
      "value": "#Then user click on go button"
    }
  ],
  "line": 10,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});