Feature: Register information in order to create your account

  Background:
    Given user must be on demo aut web application
  Scenario Outline: Adding contact information
    Given user enter contact information as <FirstName>, <LastName>, <Phone> and <Email>
    And user introduce mailing info <Address>, <City>, <State>, <PostalCode> and select his <Country>
    And user create his login credentials as <UserName>, <Password>, and user confirm his <Password>
    When user click on submit button
    Then Application must direct the user to register web page and displays the <UserName>

    Examples:
      |FirstName|LastName|Phone       |Email            |Address            |City       |State  |PostalCode|Country      |UserName |Password|
      |Gilberto |Sanchez |333-487-9876|gilberto@mail.com|Test Address 408   |Guadalajara|Jalisco|20354     |MEXICO       |gsanchez |123     |
      |Lorena   |Perez   |477-567-9874|lorena@Yahoo.com |Lorenas Address 973|Campo Real |Madrid |21243     |SPAIN        |lperez   |abc     |
      |Arturo   |Castillo|932-934-7234|arturo@gmail.com |Downwoody Point 343|Atlanta    |Georgia|3435      |UNITED STATES|acastillo|castillo|