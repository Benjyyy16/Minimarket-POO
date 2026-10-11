# Minimarket POO (Java)

Aplicación de consola para registrar el inventario de un minimarket. Proyecto académico de programación orientada a objetos en Java.

![Minimarket POO](https://github.com/user-attachments/assets/83eaabbc-e450-4aa5-85bc-81abacb5f861)

## Funcionalidades

- Registro de 6 productos desde consola con validaciones:
  - precio mayor que 0,
  - tipo restringido a `Lácteos`, `Bebidas`, `Carnes` o `Pastas`.
- Listado del inventario.
- API del inventario (`Minimarket`):
  - `agregarProducto`, `eliminarProductoPorCodigo`, `buscarProductoPorCodigo`
  - `getPorTipo`, `getLacteos`, `getPasta`, `cantidadProductos`

## Modelo

| Clase | Responsabilidad |
|---|---|
| `Producto` | Código, nombre, precio, peso y tipo (inmutable) |
| `Minimarket` | Inventario y operaciones de búsqueda/filtrado |
| `ClasePrincipal` | Entrada por consola y ejecución |

## Requisitos

- JDK 18 o superior
- Maven 3.8+

## Uso

```bash
git clone https://github.com/Benjyyy16/Minimarket-POO.git
cd Minimarket-POO
mvn -q compile exec:java
```

## Tests

```bash
mvn verify
```

Tests JUnit 5 en `src/test/java`. Se ejecutan automáticamente en cada Pull Request con GitHub Actions.

## Autor

[Benjamin Aguilar](https://github.com/Benjyyy16) · [aguilarb.tech](https://aguilarb.tech)
