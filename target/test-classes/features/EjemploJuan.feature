# language: es

Característica:Realizar compras de articulos
  como un nuevo cliente
  Quiero ingresar ala pagina www.mercadolibre.com
  Para realizar una compra de un articulo

  @EscenarioSinEjemplos
  Esquema del escenario: Agregar articulos al carrito de compras
    Dado que un nuevo cliente accede hasta la web de compras
    Cuando el agregar un producto al carro
    Entonces el ve los productos listado en el carro de compras
    Ejemplos:
      |  |

  @EscenarioConEjemplos
  Esquema del escenario: Agregar articulos al carrito de compras
    Dado que un nuevo cliente accede hasta la web de compras
    Cuando el agregar un producto al carro
      | <nombreProducto> | <cantidadAgregar> |
    Entonces el ve los productos listado en el carro de compras

    Ejemplos:
      | nombreProducto | cantidadAgregar |
      | Tapabocas N95  | 100             |