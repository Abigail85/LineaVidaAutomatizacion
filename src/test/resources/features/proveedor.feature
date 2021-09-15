# language: es
Característica: gestionar proveedores
  Como usuario proyecto linea de vida
  Quiero ingresar a proveedor
  Para realizar varias acciones


  Escenario: crear  Proveedor
    Cuando se crea un proveedor
    Entonces debe ver como resultado el mensaje "proveedor creado exitosamente"

  Escenario: Editar  Proveedor
    Cuando se edita el proveedor con nit "56778"
    Entonces debe ver como resultado el anuncio "proveedor actualizado exitosamente"

  Escenario: Ver los Detalles del Proveedor
    Cuando se ven los detalles del Proveedor con nit "12"
    Entonces debe ver como como resultado los datos del proveedor

  Escenario: Eliminar  Proveedor
    Cuando se elimina un proveedor con nit "811031385"
    Entonces debe ver como resultado el aviso "proveedor eliminado exitosamente"