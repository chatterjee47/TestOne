$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("loginpage.feature");
formatter.feature({
  "line": 1,
  "name": "Login Feature",
  "description": "",
  "id": "login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Successful Login with Valid Credentials",
  "description": "",
  "id": "login-feature;successful-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@loginpage"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User Navigate to LogIn Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enters Credentials to LogIn",
  "rows": [
    {
      "cells": [
        "Admin",
        "admin123"
      ],
      "line": 7
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Message displayed Login Successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Verify title of the page",
  "keyword": "And "
});
formatter.match({
  "location": "loginpagetest.user_Navigate_to_LogIn_Page()"
});
formatter.result({
  "duration": 11379415600,
  "status": "passed"
});
formatter.match({
  "location": "loginpagetest.user_enters_Credentials_to_LogIn(DataTable)"
});
