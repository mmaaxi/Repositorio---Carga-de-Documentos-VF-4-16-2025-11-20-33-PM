Feature: Validar carga de documento con formato soportado y tamaño válido

  Scenario: Cargar un documento válido
    Given un usuario está en la página de carga de documentos
    When selecciona un documento con formato soportado
    And hace clic en el botón 'Cargar documento'
    Then el sistema inicia el proceso de carga
    And se muestra el indicador de progreso correctamente
    And muestra un mensaje de éxito al finalizar la carga