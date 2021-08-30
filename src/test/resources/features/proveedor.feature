# language: es
Característica: proyecto-linea-de-vida
  Como usuario proyecto linea de vida
  Quiero ingresar a proveedor
  Para realizar varias acciones


  Escenario: crear  Proveedor
    Cuando un usuario "logueado" crea un Proveedor en linea-de-vida
    Entonces debe ver como resultado un mensaje dentro de "http://localhost:8888/proyecto-linea-de-vida/proyecto-linea-de-vida/public/"

  Escenario: Editar  Proveedor
    Cuando un usuario "logueado" edita  un  Proveedor en linea-de-vida
    Entonces debe ver como resultado1 un mensaje1 dentro de "http://localhost:8888/proyecto-linea-de-vida/proyecto-linea-de-vida/public/"

  Escenario: Ver los Detalles del Proveedor
    Cuando un usuario "logueado" ve los detalles de un Proveedor en linea-de-vida
    Entonces debe ver como como resultado2 una pantalla con los datos del proveedor dentro de "http://localhost:8888/proyecto-linea-de-vida/proyecto-linea-de-vida/public/"

  Escenario: Eliminar  Proveedor
    Cuando un usuario "logueado" elimina un  Proveedor en linea-de-vida
    Entonces debe ver como resultado3 un mensaje3 dentro de "http://localhost:8888/proyecto-linea-de-vida/proyecto-linea-de-vida/public/"