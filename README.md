<img width="488" height="157" alt="image" src="https://github.com/user-attachments/assets/b1159ed3-7899-4c9c-95b3-efb3f0fd8712" />

# 🧠 Actividad Formativa – Integrando sobrecarga, sobreescritura y polimorfismo 👤

**Nombre completo:** Camilo Pinto
**Carrera:** Analista Programador
**Asignatura:** Desarrollo Orientado a Objetos II
**Caso:** SpeedFast

---

# 📘 Descripción general del sistema

Este proyecto corresponde a una actividad de la asignatura **Desarrollo Orientado a Objetos II**.

El sistema representa distintos tipos de pedidos de la empresa de reparto a domicilio **SpeedFast**, utilizando conceptos fundamentales de la Programación Orientada a Objetos, principalmente:

* Herencia
* Sobreescritura de métodos
* Sobrecarga de métodos
* Polimorfismo
* Constructores
* Encapsulamiento
* Colecciones dinámicas mediante `ArrayList`

SpeedFast ofrece tres tipos de servicio:

* **Comida:** pedidos provenientes de restaurantes.
* **Encomienda:** documentos o paquetes.
* **Compra Express:** compras de supermercado o farmacia.

Cada tipo de pedido posee criterios diferentes para la asignación de un repartidor.

---

# 🧱 Estructura del proyecto

```text
src/
│
├── cl.duoc.models/
│   │
│   ├── Pedido.java
│   ├── PedidoComida.java
│   ├── PedidoEncomienda.java
│   └── PedidoExpress.java
│
└── org.example/
    │
    └── Main.java
```

---

# 📂 Descripción de las clases

## Pedido

Clase base del sistema.

Representa un pedido genérico de SpeedFast y contiene la información común a los distintos tipos de pedidos.

### Atributos

* `idPedido`
* `direccionEntrega`
* `tipoPedido`

### Constructores

La clase posee dos constructores:

* Constructor con parámetros.
* Constructor vacío.

Esto permite aplicar **sobrecarga de constructores**.

### Métodos principales

* `getIdPedido()`
* `getDireccionEntrega()`
* `getTipoPedido()`
* `asignarRepartidor()`
* `asignarRepartidor(String nombreRepartidor)`

Los dos métodos `asignarRepartidor()` corresponden a una **sobrecarga de métodos**, ya que poseen el mismo nombre pero diferente cantidad de parámetros.

El método `asignarRepartidor()` sin parámetros entrega un mensaje general de asignación.

---

# 🍔 PedidoComida

Clase que hereda de **Pedido** mediante `extends`.

Representa los pedidos provenientes de restaurantes.

### Comportamiento

Para este tipo de pedido se requiere un repartidor que cuente con **mochila térmica**.

La clase sobrescribe los métodos:

```java
asignarRepartidor()
```

y

```java
asignarRepartidor(String nombreRepartidor)
```

mediante `@Override`.

La versión sin parámetros busca realizar la asignación considerando la disponibilidad de una mochila térmica.

La versión sobrecargada permite indicar el nombre del repartidor y realizar la validación correspondiente.

---

# 📦 PedidoEncomienda

Clase que hereda de **Pedido**.

Representa documentos o paquetes que deben ser entregados mediante el servicio de encomiendas.

### Comportamiento

Antes de asignar un repartidor se considera la:

* Validación del peso.
* Validación del embalaje.

La clase sobrescribe:

```java
asignarRepartidor()
```

y:

```java
asignarRepartidor(String nombreRepartidor)
```

permitiendo que el comportamiento de asignación sea específico para las encomiendas.

---

# 🛒 PedidoExpress

Clase que hereda de **Pedido**.

Representa las compras realizadas mediante el servicio de Compras Express, como compras de supermercado o farmacia.

### Comportamiento

Para este tipo de pedido se debe considerar:

* La cercanía del repartidor.
* La disponibilidad inmediata.

La clase sobrescribe los métodos:

```java
asignarRepartidor()
```

y:

```java
asignarRepartidor(String nombreRepartidor)
```

permitiendo implementar una lógica específica para este tipo de servicio.

---

# 🔄 Sobrecarga de métodos

La **sobrecarga** se implementa mediante el método `asignarRepartidor()`.

En la clase `Pedido` existen dos versiones:

```java
public void asignarRepartidor()
```

y:

```java
public void asignarRepartidor(String nombreRepartidor)
```

Ambos métodos tienen el mismo nombre, pero reciben diferentes parámetros.

Esto permite ejecutar el método de distintas maneras dependiendo de la información disponible.

Por ejemplo:

```java
pedido.asignarRepartidor();
```

o:

```java
pedido.asignarRepartidor("Carlos");
```

También se utiliza sobrecarga en los constructores de la clase `Pedido`.

---

# 🔁 Sobreescritura de métodos

La **sobreescritura** se utiliza cuando las clases hijas redefinen el comportamiento de los métodos heredados desde `Pedido`.

Esto se realiza mediante la anotación:

```java
@Override
```

Cada tipo de pedido implementa su propia versión de:

```java
asignarRepartidor()
```

y:

```java
asignarRepartidor(String nombreRepartidor)
```

De esta forma, cada subclase puede aplicar las validaciones correspondientes a su propio tipo de servicio.

---

# 🧬 Polimorfismo

El polimorfismo se utiliza en la clase `Main` mediante referencias de tipo `Pedido` que almacenan objetos de diferentes subclases.

Por ejemplo:

```java
Pedido pedido1 = new PedidoComida(...);

Pedido pedido2 = new PedidoEncomienda(...);

Pedido pedido3 = new PedidoExpress(...);
```

Aunque las referencias son de tipo `Pedido`, los objetos corresponden a diferentes clases.

Esto permite almacenarlos en una misma colección:

```java
List<Pedido> pedidos = new ArrayList<>();
```

Posteriormente, mediante un recorrido:

```java
for (Pedido pedido : pedidos) {
    pedido.asignarRepartidor();
}
```

cada objeto ejecuta la implementación correspondiente a su clase.

De esta manera:

* `PedidoComida` valida la mochila térmica.
* `PedidoEncomienda` valida peso y embalaje.
* `PedidoExpress` considera cercanía y disponibilidad.

Esto demuestra el uso del **polimorfismo mediante sobreescritura**.

---

# 🖥️ Main

Clase principal del proyecto.

Su función consiste en probar el funcionamiento de las diferentes clases y demostrar los conceptos de Programación Orientada a Objetos implementados.

### Funciones principales

* Crear objetos `PedidoComida`.
* Crear objetos `PedidoEncomienda`.
* Crear objetos `PedidoExpress`.
* Almacenar los pedidos en una colección `List<Pedido>`.
* Utilizar `ArrayList`.
* Ejecutar métodos mediante polimorfismo.
* Probar la versión sobrescrita de `asignarRepartidor()`.
* Probar la versión sobrecargada de `asignarRepartidor(String nombreRepartidor)`.
* Mostrar mensajes descriptivos en consola.

---

# ▶️ Instrucciones para ejecutar el proyecto

1. Clonar el repositorio desde GitHub. (https://github.com/cpintomartinezsoc-cmyk/Poo2Actividad1.git)

2. Abrir el proyecto en **IntelliJ IDEA**.

3. Verificar que las clases se encuentren organizadas en sus respectivos paquetes.

4. Ejecutar la clase:

```text
org.example.Main
```

5. Revisar los resultados mostrados en la consola.

6. Verificar las distintas respuestas para cada tipo de pedido.

---

# 🧪 Prueba realizada

Durante la ejecución del programa se probaron los tres tipos de pedidos:

### Pedido de comida

Se verifica la asignación de un repartidor considerando la disponibilidad de una **mochila térmica**.

### Pedido de encomienda

Se verifica la asignación considerando la **validación del peso y embalaje**.

### Compra Express

Se verifica la asignación considerando la **cercanía y disponibilidad inmediata del repartidor**.

También se probaron las dos versiones del método:

```java
asignarRepartidor()
```

y:

```java
asignarRepartidor(String nombreRepartidor)
```

demostrando tanto **sobreescritura como sobrecarga**.

---

# 📚 Conceptos de POO utilizados

| Concepto            | Implementación                                                                 |
| ------------------- | ------------------------------------------------------------------------------ |
| **Herencia**        | `PedidoComida`, `PedidoEncomienda` y `PedidoExpress` utilizan `extends Pedido` |
| **Sobreescritura**  | Uso de `@Override` en las clases hijas                                         |
| **Sobrecarga**      | `asignarRepartidor()` y `asignarRepartidor(String nombreRepartidor)`           |
| **Polimorfismo**    | Referencias `Pedido` que apuntan a objetos de las clases hijas                 |
| **Encapsulamiento** | Atributos privados y métodos `get`                                             |
| **Constructores**   | Inicialización de los objetos mediante constructores                           |
| **ArrayList**       | Almacenamiento dinámico de pedidos                                             |
| **List**            | Referencia para trabajar con una colección de pedidos                          |

---

# 🔗 Repositorio GitHub

https://github.com/cpintomartinezsoc-cmyk/Poo2Actividad1.git

**Fecha de entrega:**
17/08/2026
