$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("register.feature");
formatter.feature({
  "line": 1,
  "name": "Register information in order to create your account",
  "description": "",
  "id": "register-information-in-order-to-create-your-account",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Adding contact information",
  "description": "",
  "id": "register-information-in-order-to-create-your-account;adding-contact-information",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "user enter contact information as \u003cFirstName\u003e, \u003cLastName\u003e, \u003cPhone\u003e and \u003cEmail\u003e",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user introduce mailing info \u003cAddress\u003e, \u003cCity\u003e, \u003cState\u003e, \u003cPostalCode\u003e and select his \u003cCountry\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user create his login credentials as \u003cUserName\u003e, \u003cPassword\u003e, and user confirm his \u003cPassword\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user click on submit button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Application must direct the user to register web page and displays the \u003cUserName\u003e",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "register-information-in-order-to-create-your-account;adding-contact-information;",
  "rows": [
    {
      "cells": [
        "FirstName",
        "LastName",
        "Phone",
        "Email",
        "Address",
        "City",
        "State",
        "PostalCode",
        "Country",
        "UserName",
        "Password"
      ],
      "line": 13,
      "id": "register-information-in-order-to-create-your-account;adding-contact-information;;1"
    },
    {
      "cells": [
        "Gilberto",
        "Sanchez",
        "333-487-9876",
        "gilberto@mail.com",
        "Test Address 408",
        "Guadalajara",
        "Jalisco",
        "20354",
        "MEXICO",
        "gsanchez",
        "123"
      ],
      "line": 14,
      "id": "register-information-in-order-to-create-your-account;adding-contact-information;;2"
    },
    {
      "cells": [
        "Lorena",
        "Perez",
        "477-567-9874",
        "lorena@Yahoo.com",
        "Lorenas Address 973",
        "Campo Real",
        "Madrid",
        "21243",
        "SPAIN",
        "lperez",
        "abc"
      ],
      "line": 15,
      "id": "register-information-in-order-to-create-your-account;adding-contact-information;;3"
    },
    {
      "cells": [
        "Arturo",
        "Castillo",
        "932-934-7234",
        "arturo@gmail.com",
        "Downwoody Point 343",
        "Atlanta",
        "Georgia",
        "3435",
        "UNITED STATES",
        "acastillo",
        "castillo"
      ],
      "line": 16,
      "id": "register-information-in-order-to-create-your-account;adding-contact-information;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user must be on demo aut web application",
  "keyword": "Given "
});
formatter.match({
  "location": "RegisterSteps.userMustBeOnDemoAutWebApplication()"
});
formatter.result({
  "duration": 4636552770,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Adding contact information",
  "description": "",
  "id": "register-information-in-order-to-create-your-account;adding-contact-information;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "user enter contact information as Gilberto, Sanchez, 333-487-9876 and gilberto@mail.com",
  "matchedColumns": [
    0,
    1,
    2,
    3
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user introduce mailing info Test Address 408, Guadalajara, Jalisco, 20354 and select his MEXICO",
  "matchedColumns": [
    4,
    5,
    6,
    7,
    8
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user create his login credentials as gsanchez, 123, and user confirm his 123",
  "matchedColumns": [
    9,
    10
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user click on submit button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Application must direct the user to register web page and displays the gsanchez",
  "matchedColumns": [
    9
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Gilberto",
      "offset": 34
    },
    {
      "val": "Sanchez",
      "offset": 44
    },
    {
      "val": "333-487-9876",
      "offset": 53
    },
    {
      "val": "gilberto@mail.com",
      "offset": 70
    }
  ],
  "location": "RegisterSteps.userEnterFirstNameLastNamePhoneAndEmail(String,String,String,String)"
});
formatter.result({
  "duration": 3274813343,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test Address 408",
      "offset": 28
    },
    {
      "val": "Guadalajara",
      "offset": 46
    },
    {
      "val": "Jalisco",
      "offset": 59
    },
    {
      "val": "20354",
      "offset": 68
    },
    {
      "val": "MEXICO",
      "offset": 89
    }
  ],
  "location": "RegisterSteps.userEnterAddressCityStatePostalCodeAndSelectHisCountry(String,String,String,String,String)"
});
formatter.result({
  "duration": 3420874374,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "gsanchez",
      "offset": 37
    },
    {
      "val": "123",
      "offset": 47
    },
    {
      "val": "123",
      "offset": 73
    }
  ],
  "location": "RegisterSteps.userCreateHisLoginCredentialsAsUserNamePasswordAndUserConfirmHisPassword(String,String,String)"
});
formatter.result({
  "duration": 2144885619,
  "status": "passed"
});
formatter.match({
  "location": "RegisterSteps.userClickOnSubmitButton()"
});
formatter.result({
  "duration": 2792640859,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "gsanchez",
      "offset": 71
    }
  ],
  "location": "RegisterSteps.ApplicationMustDirectTheUserToRegisterWebPageAndDisplaysTheUserName(String)"
});
formatter.result({
  "duration": 1044179315,
  "status": "passed"
});
formatter.after({
  "duration": 1077536763,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user must be on demo aut web application",
  "keyword": "Given "
});
formatter.match({
  "location": "RegisterSteps.userMustBeOnDemoAutWebApplication()"
});
formatter.result({
  "duration": 3623533001,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Adding contact information",
  "description": "",
  "id": "register-information-in-order-to-create-your-account;adding-contact-information;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "user enter contact information as Lorena, Perez, 477-567-9874 and lorena@Yahoo.com",
  "matchedColumns": [
    0,
    1,
    2,
    3
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user introduce mailing info Lorenas Address 973, Campo Real, Madrid, 21243 and select his SPAIN",
  "matchedColumns": [
    4,
    5,
    6,
    7,
    8
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user create his login credentials as lperez, abc, and user confirm his abc",
  "matchedColumns": [
    9,
    10
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user click on submit button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Application must direct the user to register web page and displays the lperez",
  "matchedColumns": [
    9
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Lorena",
      "offset": 34
    },
    {
      "val": "Perez",
      "offset": 42
    },
    {
      "val": "477-567-9874",
      "offset": 49
    },
    {
      "val": "lorena@Yahoo.com",
      "offset": 66
    }
  ],
  "location": "RegisterSteps.userEnterFirstNameLastNamePhoneAndEmail(String,String,String,String)"
});
formatter.result({
  "duration": 3088126417,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Lorenas Address 973",
      "offset": 28
    },
    {
      "val": "Campo Real",
      "offset": 49
    },
    {
      "val": "Madrid",
      "offset": 61
    },
    {
      "val": "21243",
      "offset": 69
    },
    {
      "val": "SPAIN",
      "offset": 90
    }
  ],
  "location": "RegisterSteps.userEnterAddressCityStatePostalCodeAndSelectHisCountry(String,String,String,String,String)"
});
formatter.result({
  "duration": 3273433660,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "lperez",
      "offset": 37
    },
    {
      "val": "abc",
      "offset": 45
    },
    {
      "val": "abc",
      "offset": 71
    }
  ],
  "location": "RegisterSteps.userCreateHisLoginCredentialsAsUserNamePasswordAndUserConfirmHisPassword(String,String,String)"
});
formatter.result({
  "duration": 1726910318,
  "status": "passed"
});
formatter.match({
  "location": "RegisterSteps.userClickOnSubmitButton()"
});
formatter.result({
  "duration": 1514343193,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "lperez",
      "offset": 71
    }
  ],
  "location": "RegisterSteps.ApplicationMustDirectTheUserToRegisterWebPageAndDisplaysTheUserName(String)"
});
formatter.result({
  "duration": 1142295409,
  "status": "passed"
});
formatter.after({
  "duration": 1013264442,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user must be on demo aut web application",
  "keyword": "Given "
});
formatter.match({
  "location": "RegisterSteps.userMustBeOnDemoAutWebApplication()"
});
formatter.result({
  "duration": 3942725399,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Adding contact information",
  "description": "",
  "id": "register-information-in-order-to-create-your-account;adding-contact-information;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "user enter contact information as Arturo, Castillo, 932-934-7234 and arturo@gmail.com",
  "matchedColumns": [
    0,
    1,
    2,
    3
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user introduce mailing info Downwoody Point 343, Atlanta, Georgia, 3435 and select his UNITED STATES",
  "matchedColumns": [
    4,
    5,
    6,
    7,
    8
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user create his login credentials as acastillo, castillo, and user confirm his castillo",
  "matchedColumns": [
    9,
    10
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user click on submit button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Application must direct the user to register web page and displays the acastillo",
  "matchedColumns": [
    9
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Arturo",
      "offset": 34
    },
    {
      "val": "Castillo",
      "offset": 42
    },
    {
      "val": "932-934-7234",
      "offset": 52
    },
    {
      "val": "arturo@gmail.com",
      "offset": 69
    }
  ],
  "location": "RegisterSteps.userEnterFirstNameLastNamePhoneAndEmail(String,String,String,String)"
});
formatter.result({
  "duration": 3125124507,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Downwoody Point 343",
      "offset": 28
    },
    {
      "val": "Atlanta",
      "offset": 49
    },
    {
      "val": "Georgia",
      "offset": 58
    },
    {
      "val": "3435",
      "offset": 67
    },
    {
      "val": "UNITED STATES",
      "offset": 87
    }
  ],
  "location": "RegisterSteps.userEnterAddressCityStatePostalCodeAndSelectHisCountry(String,String,String,String,String)"
});
formatter.result({
  "duration": 3702799089,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "acastillo",
      "offset": 37
    },
    {
      "val": "castillo",
      "offset": 48
    },
    {
      "val": "castillo",
      "offset": 79
    }
  ],
  "location": "RegisterSteps.userCreateHisLoginCredentialsAsUserNamePasswordAndUserConfirmHisPassword(String,String,String)"
});
formatter.result({
  "duration": 2015473672,
  "status": "passed"
});
formatter.match({
  "location": "RegisterSteps.userClickOnSubmitButton()"
});
formatter.result({
  "duration": 1808701293,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "acastillo",
      "offset": 71
    }
  ],
  "location": "RegisterSteps.ApplicationMustDirectTheUserToRegisterWebPageAndDisplaysTheUserName(String)"
});
formatter.result({
  "duration": 965259848,
  "status": "passed"
});
formatter.after({
  "duration": 1072642928,
  "status": "passed"
});
});