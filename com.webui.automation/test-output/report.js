$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/achoudhury20/git/repo2/com.webui.automation/src/main/java/Featurefiles/newfeaturefile.Feature");
formatter.feature({
  "line": 1,
  "name": "searchflight",
  "description": "",
  "id": "searchflight",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "look for one-way trip flights",
  "description": "",
  "id": "searchflight;look-for-one-way-trip-flights",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "user is on the search page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "enters the search details and click on search button",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "list of available flight must be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Searchflightstepdefinition.user_is_on_the_search_page()"
});
formatter.result({
  "duration": 11813145900,
  "status": "passed"
});
formatter.match({
  "location": "Searchflightstepdefinition.enters_the_search_details_and_click_on_search_button()"
});
formatter.result({
  "duration": 2146937500,
  "status": "passed"
});
formatter.match({
  "location": "Searchflightstepdefinition.list_of_available_flight_must_be_displayed()"
});
formatter.result({
  "duration": 311000,
  "status": "passed"
});
});