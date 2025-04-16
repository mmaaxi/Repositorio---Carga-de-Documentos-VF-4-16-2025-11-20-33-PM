Feature: Prueba de regresión: verificar funcionalidades tras actualización

  Background:
    Given que el sistema de carga de documentos está disponible

  Scenario: Verificar que las funcionalidades del sistema de carga funcionan correctamente tras una actualización
    When se realizan cambios o actualizaciones al sistema de carga de documentos
    Then el sistema sigue funcionando sin errores

  Scenario: Ejecutar la suite de pruebas de carga de documentos tras la actualización
    When ejecuto la suite completa de pruebas de carga de documentos
    Then todos los casos de prueba se ejecutan exitosamente sin romper funcionalidades existentes