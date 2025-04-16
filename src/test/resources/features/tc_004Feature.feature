Feature: Validar rechazo de carga para documento duplicado

  Scenario: Intentar cargar un documento duplicado
    Given que selecciono un documento que ya ha sido cargado previamente
    When intento cargar nuevamente el mismo documento
    Then el sistema muestra una advertencia de 'Documento duplicado'