$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("booking.feature");
formatter.feature({
  "line": 2,
  "name": "Title of your feature",
  "description": "I want to use this template for my feature file",
  "id": "title-of-your-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@CheapAir"
    }
  ]
});
formatter.scenario({
  "line": 6,
  "name": "User enter the details for booking ticket",
  "description": "",
  "id": "title-of-your-feature;user-enter-the-details-for-booking-ticket",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@Tickt_Booking"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User Launch the browser and CheapAir portal",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User Choose the mode of travel",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User enter the Source, Destination, date and passenger details",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User enter the search flights button",
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