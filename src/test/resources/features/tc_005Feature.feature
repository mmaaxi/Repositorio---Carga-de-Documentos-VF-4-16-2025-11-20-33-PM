Feature: Verificar indicador de progreso durante la carga del documento

  Scenario: Indicador de progreso refleja la carga en tiempo real
    Given El usuario ha iniciado la aplicación
    When El usuario inicia la carga de un documento grande
    Then Se muestra el indicador de progreso

  Scenario: Verificar progreso en tiempo real
    Given El indicador de progreso es visible
    When El usuario observa el progreso durante la carga
    Then El indicador refleja el avance en tiempo real

  Scenario: Carga completa y finalización
    Given El progreso del indicador es visible
    When Se completa la carga del documento
    Then El indicador llega al 100% y se notifica la finalización