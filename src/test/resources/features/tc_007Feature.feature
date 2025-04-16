Feature: Verificar correcta visualización de documentos cargados en la interfaz

  Scenario: Cargar y verificar documento en la interfaz
    Given El usuario ha cargado un documento válido
    Then El documento aparece en la lista de documentos cargados
    And Los detalles del documento (nombre, formato, tamaño) se muestran correctamente