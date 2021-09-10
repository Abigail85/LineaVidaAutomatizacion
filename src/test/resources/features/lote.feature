# language: es
Característica: proyecto-linea-de-vida
  Como usuario proyecto linea de vida
  Quiero ingresar a Especificaciones Lote
  Para realizar varias acciones


  Escenario: crear  Especificacion
    Cuando se crea una especificacion
    Entonces debe ver como resultado el mensaje "Especificacion creada exitosamente"

  Escenario: Editar  Especificaciones
    Cuando se editan las especificaciones
    Entonces debe ver como resultado el anuncio "Especificacion actualizado exitosamente"

  Escenario: Ver los Detalles de las Especificaciones
    Cuando se ven los detalles de las especificaciones con ID "1"
    Entonces debe ver como como resultado los datos de la Especificacion lote

  Escenario: Eliminar  Especificacion
    Cuando se elimina una especificacion
    Entonces debe ver como resultado el aviso "especificacion eliminada exitosamente"