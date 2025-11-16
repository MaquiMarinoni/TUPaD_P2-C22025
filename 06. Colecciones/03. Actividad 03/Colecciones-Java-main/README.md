# 🚀 ACTIVIDAD III - Búsqueda en Colecciones y Uso de Enums en Java

Este repositorio presenta un conjunto de ejercicios prácticos desarrollados en **Java** utilizando **NetBeans**, como parte de una actividad orientada a profundizar en la **búsqueda dentro de colecciones** y el uso avanzado de **Enums**. Los proyectos se enfocan en la implementación y manipulación de estructuras de datos, así como en el diseño de clases y enumeraciones que modelan situaciones del mundo real.

---

📚 **Tabla de Contenidos**
- [1. Buscar en una Colección de Objetos en Java](#actividad1)
- [2. Enums en Java: Código y UML](#actividad2)
- [3. Enums en Java: Métodos Útiles](#actividad3)
- [4. Enums en Java: Atributos y Métodos](#actividad4)
- [Resolución del Cuestionario de Multiple Choice](#cuestionario)



---

---

## ✅ Temas Abordados

<a name="actividad1"></a>
### 1. 🔍 Buscar en una Colección de Objetos en Java

**Objetivo:** Implementar un sistema de gestión de autos que permita buscar vehículos por su patente utilizando una `ArrayList`.

**Conceptos aplicados:**
- Búsqueda secuencial mediante índices.
- Búsqueda utilizando iteradores.
- Comparación de objetos usando `equals`.

---

<a name="actividad2"></a>
### 2. 🛠️ Enums en Java: Código y UML

**Objetivo:** Modelar personas y empresas según su nivel educativo utilizando un Enum `NivelEstudio`, junto con las clases `Persona` y `Empresa`.

**Conceptos aplicados:**
- Uso de Enums para representar categorías.
- Asociación entre clases.
- Representación UML del modelo.

📌 Diagrama UML:
---
![UML del ejercicio](https://raw.githubusercontent.com/AgusDM7/Colecciones-Java/main/Colecciones%20%20Actividad%203/MuestraEnums/UML%20ejercicio.png)


---

<a name="actividad3"></a>
### 3. 📦 Enums en Java: Métodos Útiles

**Objetivo:** Explorar métodos fundamentales de los Enums.

**Métodos utilizados:**
- `ordinal()` — Índice ordinal del Enum.
- `valueOf()` — Conversión de `String` a Enum.
- `values()` — Arreglo con todos los valores del Enum.

---

<a name="actividad4"></a>
### 4. 🌐 Enums en Java: Atributos y Métodos

**Objetivo:** Definir un Enum `Continente` con atributos personalizados (habitantes y superficie), e implementar un método para calcular la **densidad poblacional**.

**Conceptos aplicados:**
- Enums con atributos y constructores.
- Métodos específicos por valor Enum.

---

## 📘 Conclusión y Aprendizaje

Este proyecto permitie afianzar conocimientos fundamentales sobre **colecciones** y **Enums** en Java, elementos clave en el desarrollo de software orientado a objetos:

- Implementación de búsqueda en listas utilizando distintas estrategias.
- Aplicación de `equals()` para comparar objetos personalizados.
- Uso de **Enums** para representar información categórica de forma segura y estructurada.
- Incorporación de atributos y métodos en Enums para extender su funcionalidad.
- Representación visual del modelo con diagramas UML.

Estas prácticas consolidan la capacidad de diseñar sistemas robustos, reutilizables y adaptables, fomentando la escritura de código limpio y bien estructurado.

---

<a name="cuestionario"></a>
## 📋 Resolucion de Cuestionario de Campus: Enums en Java

A continuación, se presentan las preguntas de opción múltiple subidas al campus con el objetivo de reforzar los conocimientos adquiridos de los videos y practicas anteriores:

### ❓ Pregunta 1
**¿Cuál de las siguientes opciones es incorrecta sobre los enum en Java?**

✅ **Respuesta correcta:** a. *Pueden instanciarse con `new NivelEstudio()`.*

🔎 **Aclaración:** Los enums en Java **no se pueden instanciar** con `new`. Java crea internamente una única instancia de cada valor del enum (singleton), por lo que su ciclo de vida está controlado por el compilador y la JVM.


### ❓ Pregunta 2
**¿Cuál es la ventaja principal de usar enum en Java?**

✅ **Respuesta correcta:** c. *Permiten definir valores constantes y evitar ambigüedades.*

🔎 **Aclaración:** Los enums ayudan a representar de forma clara y segura un conjunto fijo de constantes con nombre, evitando errores comunes como el uso de cadenas de texto sueltas.


### ❓ Pregunta 3
**¿Cómo se representa un enum en UML?**

✅ **Respuesta correcta:** b. *Usando el estereotipo `<<enumeration>>`.*

🔎 **Aclaración:** En UML, los enums se representan con el estereotipo `<<enumeration>>` sobre el nombre, seguido por una lista de sus valores.



### ❓ Pregunta 4
**¿Qué hace el método `ordinal()` en un enum?**

✅ **Respuesta correcta:** a. *Retorna la posición del valor dentro del enum.*

🔎 **Aclaración:** `ordinal()` devuelve el índice de definición del valor dentro del enum, comenzando desde cero.



### ❓ Pregunta 5
**¿Qué sucede si ejecutamos `NivelEstudio.valueOf("primario")`?**

✅ **Respuesta correcta:** b. *Lanza una excepción porque los enum son sensibles a mayúsculas.*

🔎 **Aclaración:** El método `valueOf()` distingue entre mayúsculas y minúsculas. Si se pasa una cadena que no coincide exactamente con el nombre del valor (por ejemplo, "primario" en lugar de "PRIMARIO"), se lanza una excepción `IllegalArgumentException`.

---

## ⚡ Requisitos

- **JDK 17 o superior**
- **NetBeans IDE 17 o superior**

---

## ▶️ Ejecución del Proyecto

1. Clonar el repositorio:
   ```bash
   git clone [URL del repositorio]
