Feature: Validacion de Documentacion Api

#  Background: Load main page


 Scenario: Cargar Pagina Nasa API
    Given I load Nasa Page
    And click 'NasaApiListing' link on 'Left Panel' page
    And reClick 'NasaApiListing' link on 'Left Panel' page
    And click 'Earth' link on 'Left Panel' page
    And click 'Imagering' sublink on 'LeftPanel' page
    Then verify the 'GETUrl' isEquals to 'urlGetText' in page
    #And click 'Logout' button on 'Header' page