Feature: Validar error por documento que excede el tamaño máximo permitido

  Scenario: Intentar cargar un documento demasiado grande
    Given que el usuario ha seleccionado un documento cuyo tamaño excede el límite permitido
    When intenta cargar el documento
    Then el sistema debe identificar que el tamaño es superior al permitido
    And se muestra un mensaje de error: 'Archivo demasiado grande'