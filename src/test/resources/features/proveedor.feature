# language: es
Característica: proyecto-linea-de-vida
  Como usuario proyecto linea de vida
  Quiero ingresar a proveedor
  Para realizar varias acciones


  Escenario: crear  Proveedor
    Cuando un usuario "logueado" crea  un  Proveedor en linea-de-vida
    Entonces debe ver como resultado un mensaje "Proveedor creado exitosamente"

  Escenario: Editar  Proveedor
    Cuando un usuario "logueado" edita  un  Proveedor en linea-de-vida
    Entonces debe ver como resultado un mensaje1 "Proveedor editado exitosamente"

  Escenario: Ver los Detalles del Proveedor
    Cuando un usuario "logueado" ve los detalles de un Proveedor en linea-de-vida
    Entonces debe ver como resultado una Pantalla con "los datos del proveedor"

  Escenario: Eliminar  Proveedor
    Cuando un usuario "logueado" elimina un  Proveedor en linea-de-vida
    Entonces debe ver como resultado un mensaje2 "Proveedor eliminado exitosamente"