# language: es
Característica: proyecto-linea-de-vida
  Como usuario proyecto linea de vida
  Quiero ingresar a Especificaciones Lote
  Para realizar varias acciones


  Escenario: crear  Especificacione
    Cuando un usuario "logueado" crea  una especificacion de un lote en linea-de-vida
    Entonces debe ver como resultado un mensaje Especificación creada "exitosamente"



  Escenario: Eliminar  Especificacion
    Cuando un usuario "logueado" elimina una especificacion en linea-de-vida
    Entonces debe ver como resultado un mensaje Especificacion eliminada "exitosamente"