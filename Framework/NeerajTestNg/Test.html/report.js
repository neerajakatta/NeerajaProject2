$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Home.feature");
formatter.feature({
  "line": 1,
  "name": "This feature file is designed to validate Home page functionalities in below listed scenarios",
  "description": "",
  "id": "this-feature-file-is-designed-to-validate-home-page-functionalities-in-below-listed-scenarios",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "This scenario is designed to validate all the display conditions",
  "description": "",
  "id": "this-feature-file-is-designed-to-validate-home-page-functionalities-in-below-listed-scenarios;this-scenario-is-designed-to-validate-all-the-display-conditions",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@Regressiontest"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "As an user i want to launch firefox browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "an application is opened verify home page is displayed",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "verify to login admin page",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "verify the tabs order",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "verify the broken links",
  "keyword": "Then "
});
formatter.match({
  "location": "TC_01_Brokenlinkvalidation.LaunchApplication()"
});
formatter.result({
  "duration": 9524799706,
  "status": "passed"
});
formatter.match({
  "location": "TC_01_Brokenlinkvalidation.VerifyingHomePage()"
});
formatter.result({
  "duration": 330115766,
  "status": "passed"
});
formatter.match({
  "location": "TC_01_Brokenlinkvalidation.logintoadminHomepage()"
});
formatter.result({
  "duration": 2462438420,
  "status": "passed"
});
formatter.match({
  "location": "TC_01_Brokenlinkvalidation.verifyTabsOrder()"
});
formatter.result({
  "duration": 2540082354,
  "status": "passed"
});
formatter.match({
  "location": "TC_01_Brokenlinkvalidation.VerifyBrokenLinks()"
});
formatter.result({
  "duration": 203483184,
  "status": "passed"
});
});