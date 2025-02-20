Feature: PetStore API Testing

  Background:
    * url 'https://petstore.swagger.io/v2'
    * def newdata = read('new-pet.json')
    * def updateData = read('update-data.json')



  Scenario: Añadir una mascota a la tienda
    Given path 'pet'
    And request newdata.newPet
    When method post
    Then status 200
    And match response.id == newdata.newPet.id


  Scenario: Consultar la mascota por ID
    Given path 'pet', newdata.newPet.id
    When method get
    Then status 200
    And match response.status == newdata.newPet.status


  Scenario: Actualizar la mascota
    Given path 'pet'
    And request updateData.updatedPet
    When method put
    Then status 200
    And match response.name == updateData.updatedPet.name
    And match response.status == updateData.updatedPet.status


  Scenario: Consultar mascotas por status
    Given path 'pet', 'findByStatus'
    And param status = updateData.updatedPet.status
    When method get
    Then status 200
    And match response contains updateData.updatedPet