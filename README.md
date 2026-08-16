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



# 🍔 PedidoComida

Clase que hereda de **Pedido** mediante `extends`.

Representa los pedidos provenientes de restaurantes.

### Comportamiento

Para este tipo de pedido se requiere un repartidor que cuente con **mochila térmica**.



# 📦 PedidoEncomienda

Clase que hereda de **Pedido**.

Representa documentos o paquetes que deben ser entregados mediante el servicio de encomiendas.


# 🛒 PedidoExpress

Clase que hereda de **Pedido**.

Representa las compras realizadas mediante el servicio de Compras Express, como compras de supermercado o farmacia.




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



# 🔗 Repositorio GitHub

https://github.com/cpintomartinezsoc-cmyk/Poo2Actividad1.git

**Fecha de entrega:**
17/08/2026
