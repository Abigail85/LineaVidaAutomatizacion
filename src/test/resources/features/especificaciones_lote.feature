# language: es
Característica: proyecto-linea-de-vida
  Como usuario proyecto linea de vida
  Quiero ingresar al menuu factura
  Para realizar varias acciones


  Escenario: crear  Nueva Especificacion
    Cuando un usuario "logueado" crea " una nueva especificacion" en linea-de-vida
    Entonces debe ver como resultado un mensaje "especificación creada exitosamente"

  Escenario: Editar  Especificación
    Cuando un usuario "logueado" edita " un  Proveedor" en linea-de-vida
    Entonces debe ver como resultado un mensaje1 "especificación actualizada exitosamente"

  Escenario: Ver los Detalles de la especificación
    Cuando un usuario "logueado" ve los detalles " de un  Proveedor" en linea-de-vida
    Entonces debe ver como resultado una "Pantalla con los datos de la especificacion"

  Escenario: Eliminar  especificación
    Cuando un usuario "logueado" elimina " un  Proveedor" en linea-de-vida
    Entonces debe ver como resultado un mensaje2 "especificacion eliminada exitosamente"