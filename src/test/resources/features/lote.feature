# language: es
Característica: proyecto-linea-de-vida
  Como usuario proyecto linea de vida
  Quiero ingresar a Especificaciones Lote
  Para realizar varias acciones


  Escenario: crear  Especificacion
    Cuando un usuario "logueado" crea una especificacion de un lote en linea-de-vida
    Entonces debe ver como resultado4 un mensaje4 dentro de "http://localhost:8888/proyecto-linea-de-vida/proyecto-linea-de-vida/public/"

  Escenario: Editar  Especificaciones
    Cuando un usuario "logueado" edita las especificaciones de un lote en linea-de-vida
    Entonces debe ver como resultado5 un mensaje5 dentro de "http://localhost:8888/proyecto-linea-de-vida/proyecto-linea-de-vida/public/"

  Escenario: Ver los Detalles de las Especificaciones
    Cuando un usuario "logueado" ve los detalles de las especificaciones de un lote en linea-de-vida
    Entonces debe ver como como resultado6 una pantalla1 con los datos de las especificaciones dentro de "http://localhost:8888/proyecto-linea-de-vida/proyecto-linea-de-vida/public/"


  Escenario: Eliminar  Especificacion
    Cuando un usuario "logueado" elimina una especificacion en linea-de-vida
    Entonces debe ver como resultado7 un mensaje7 dentro de  "http://localhost:8888/proyecto-linea-de-vida/proyecto-linea-de-vida/public/"