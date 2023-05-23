$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("bankTest.feature");
formatter.feature({
  "line": 2,
  "name": "XYZ Bank Test",
  "description": "",
  "id": "xyz-bank-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 87851768300,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "I am On Homepage",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 18,
  "name": "Bank Manager should open account successfully",
  "description": "",
  "id": "xyz-bank-test;bank-manager-should-open-account-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 17,
      "name": "@smoke"
    },
    {
      "line": 17,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "I click On Bank Manager Login Tab",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "I click On Open Account Tab",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I Search customer that is created first",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "I Select currency Pound",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I click on process button",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I should verify message Account created successfully",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I click on ok button on popup.",
  "keyword": "Then "
});
formatter.match({
  "location": "BankSteps.iClickOnBankManagerLoginTab()"
});
formatter.result({
  "duration": 522257300,
  "status": "passed"
});
formatter.match({
  "location": "BankSteps.iClickOnOpenAccountTab()"
});
formatter.result({
  "duration": 207532700,
  "status": "passed"
});
formatter.match({
  "location": "BankSteps.iSearchCustomerThatIsCreatedFirst()"
});
formatter.result({
  "duration": 561044500,
  "status": "passed"
});
formatter.match({
  "location": "BankSteps.iSelectCurrencyPound()"
});
formatter.result({
  "duration": 219803700,
  "status": "passed"
});
formatter.match({
  "location": "BankSteps.iClickOnProcessButton()"
});
formatter.result({
  "duration": 210160400,
  "status": "passed"
});
formatter.match({
  "location": "BankSteps.iShouldVerifyMessageAccountCreatedSuccessfully()"
});
formatter.result({
  "duration": 32895600,
  "status": "passed"
});
formatter.match({
  "location": "BankSteps.iClickOnOkButtonOnPopup()"
});
formatter.result({
  "duration": 12959200,
  "status": "passed"
});
formatter.after({
  "duration": 1012531600,
  "status": "passed"
});
});