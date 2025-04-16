Feature: Validar error al cargar documento con formato no soportado

  Escenario: Intentar cargar un documento con formato no permitido
    Dado que el usuario tiene un documento con formato no soportado
    Cuando el usuario selecciona el documento con formato no soportado
    Y hace clic en el botón "Cargar documento"
    Entonces el sistema rechaza el documento
    Y muestra un mensaje de error relacionado con el formato