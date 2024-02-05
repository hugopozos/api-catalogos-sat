
# API CATALOGOS SAT

Este proyecto, desarrollado en Spring Boot, ofrece una solución eficiente para consultar una base de datos (SQLITE3) que almacena información crucial sobre CFDIs 4.0 (Comprobantes Fiscales Digitales por Internet). La aplicación proporciona REST API fácil de usar para acceder a datos precisos relacionados con los CFDIs, facilitando así la gestión y consulta de información fiscal de manera efectiva.






## Tablas consultadas

 - cfdi_40_claves_unidades
 - cfdi_40_codigos_postales
 - cfdi_40_colonias
 - cfdi_40_estados
 - cfdi_40_formas_pago
 - cfdi_40_metodos_pago
 - cfdi_40_monedas
 - cfdi_40_municipios
 - cfdi_40_objetos_impuestos
 - cfdi_40_productos_servicios
 - cfdi_40_regimenes_fiscales
 - cfdi_40_tipos_relaciones
 - cfdi_40_usos_cfdi




## Instalacion

Para descargar este repositorio ejecuta el siguiente comando en una terminal.

```bash
  https://github.com/hugopozos/api-catalogos-sat.git
  cd api-catalogos-sat
```

## Referencia de la API

Para obtener información sobre las tablas y sus campos se debe seguir la siguiente
estructura de consulta donde (tabla) es el nombre de la tabla a consultar sustituyendo
espacios por guiones y sin escribir cfdi_40_


#### Obtener por ID

```
  GET /api/(tabla)/{id}
```
#### Obtener todos
Para obtener todos los registros de las tablas de forma paginada se debe seguir la siguiente estructura.

```
  GET /api/(tabla)/all?page=1&size=10
```


### Ejemplo de uso

#### Obtener por ID

```
  GET /api/codigos-postales/{id}
```
#### Obtener todos

```
  GET /api/codigos-postales/all?page=1&size=10
```

