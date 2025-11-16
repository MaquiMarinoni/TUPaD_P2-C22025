# 🎵 Colecciones - Actividad 4

<div align="center">

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![ArrayList](https://img.shields.io/badge/Collections-ArrayList-blue?style=for-the-badge)
![UML](https://img.shields.io/badge/UML-Diagram-green?style=for-the-badge)

*🌟 Práctica completa de ArrayList en Java desde el análisis hasta la implementación 💻*

</div>

---

## 📋 Enunciado del Problema

Una **fábrica de instrumentos musicales** posee una lista con todas sus sucursales. Cada sucursal tiene su nombre y una lista con todos los instrumentos a la venta. De cada uno de ellos se sabe:

- 🏷️ **ID alfanumérico** único
- 💰 **Precio** de venta  
- 🎼 **Tipo de instrumento**: Percusión, Viento o Cuerda

El sistema debe permitir gestionar y consultar la información de todos los instrumentos distribuidos en las diferentes sucursales.

---

## 📁 Estructura del Proyecto

```
Colecciones_Actividad4/
└── src/
    └── Colecciones/
        ├── 📄 Fabrica.java
        ├── 🎼 Instrumento.java  
        ├── ▶️ Main.java
        ├── 🏢 Sucursal.java
        └── 🏷️ TipoInstrumento.java
```

> 💡 **Nota**: Al ejecutar `Main.java` se mostrarán todos los ejercicios del 1 al 4 en funcionamiento.

---

## 🎯 Conceptos Aplicados

### 🏗️ Fundamentos de POO
- **Clases y Objetos** - Modelado de entidades del mundo real
- **Estado, Identidad y Comportamiento** - Pilares de la orientación a objetos
- **Encapsulamiento** - Protección de datos mediante modificadores de acceso
- **Métodos getter/setter** - Acceso controlado a atributos privados
- **Palabra `this`** - Referencia al objeto actual
- **Constructores** - Inicialización de objetos
- **Método `toString`** - Representación textual de objetos

### 🔧 Características Avanzadas
- **Miembros estáticos** - Elementos compartidos por todas las instancias
- **Enumerados** - Tipos de datos con valores constantes predefinidos
- **Principio "Tell, don't ask"** - Delegación de responsabilidades

### 📊 Diseño y Modelado
- **Diagrama de clases UML** - Representación visual del sistema
- **Relaciones de asociación y dependencia** - Conexiones entre clases

### 📚 Colecciones y Algoritmos
- **Listas de objetos con `ArrayList`** - Estructura de datos dinámica
- **Ciclo For Each** - Iteración simplificada sobre colecciones  
- **Uso de iteradores** - Recorrido seguro de colecciones
- **Algoritmos con colecciones** - Búsqueda, filtrado y manipulación

---

## 🎯 Objetivos de Desarrollo

### 1️⃣ **Diagrama UML**
Desarrollar el diagrama de clases que modele el sistema completo con:
- ✅ Clases identificadas
- ✅ Atributos y métodos
- ✅ Relaciones entre clases
- ✅ Tipos de datos y multiplicidades

![Diagrama UML](Diagrama_Colecciones_Actividad4.png)

### 2️⃣ **Implementación en Java**

#### 🅰️ **Método `listarInstrumentos`**
*Mostrar todos los instrumentos de todas las sucursales*

```java
public void listarInstrumentos() {
    for (Sucursal sucursal : sucursales) {
        System.out.println("🏢 " + sucursal.getNombre());
        sucursal.listarInstrumentos();
    }
}
```

**✨ Funcionalidad**: Recorre todas las sucursales e imprime la información completa de cada instrumento.

---

#### 🅱️ **Método `instrumentosPorTipo`**
*Filtrar instrumentos por tipo específico*

```java
public ArrayList<Instrumento> instrumentosPorTipo(TipoInstrumento tipo) {
    ArrayList<Instrumento> instEncontrados = new ArrayList<>();
    for (Instrumento instrumento : instrumentos) {
        if (instrumento.getTipo() == tipo) {
            instEncontrados.add(instrumento);
        }
    }
    return instEncontrados;
}
```

**✨ Funcionalidad**: Retorna una nueva lista conteniendo únicamente los instrumentos que coincidan con el tipo solicitado (Percusión, Viento o Cuerda).

---

#### 🅲️ **Método `borrarInstrumento`**
*Eliminar instrumento por ID*

```java
public Instrumento borrarInstrumento(String ID) {
    Instrumento insABorrar = buscarInstrumento(ID);
    this.instrumentos.remove(insABorrar);
    return insABorrar;
}
```

**✨ Funcionalidad**: Localiza un instrumento por su ID único y lo elimina de la sucursal correspondiente, retornando el objeto eliminado.

---

#### 🅳️ **Método `porcInstrumentosPorTipo`**
*Calcular porcentajes de instrumentos por tipo en una sucursal*

```java
public double[] porcInstrumentosPorTipo(String nombreSuc) {
    double[] porcentajes = new double[TipoInstrumento.values().length];
    Sucursal sucEncontrada = buscarSucursal(nombreSuc);
    if (sucEncontrada != null) {
        porcentajes = sucEncontrada.porcInstrumentosPorTipo();
    }
    return porcentajes;
}
```

**✨ Funcionalidad**: Calcula y retorna un array con los porcentajes de cada tipo de instrumento en la sucursal especificada.

---

## 🚀 Cómo Ejecutar

1. **Compilar el proyecto**:
   ```bash
   javac src/Colecciones/*.java
   ```

2. **Ejecutar la aplicación**:
   ```bash
   java -cp src Colecciones.Main
   ```

3. **Resultado esperado**: Se mostrarán en consola las demostraciones de todos los ejercicios del 1 al 4.

---

## 🎓 Aprendizajes Clave

| Concepto | Aplicación en el Proyecto |
|----------|---------------------------|
| 📊 **ArrayList** | Gestión dinámica de listas de sucursales e instrumentos |
| 🔍 **Búsqueda** | Localización de instrumentos y sucursales por criterios específicos |
| 🗑️ **Eliminación** | Remoción segura de elementos de colecciones |
| 📈 **Cálculos** | Algoritmos para obtener porcentajes y estadísticas |
| 🎯 **Filtrado** | Selección de elementos basada en tipos enumerados |

---

## 🏆 Características Destacadas

- ✅ **Diseño orientado a objetos** completo
- ✅ **Manejo robusto de colecciones** con ArrayList
- ✅ **Implementación de algoritmos** de búsqueda y filtrado
- ✅ **Uso de enumerados** para tipos de instrumentos
- ✅ **Aplicación de principios SOLID** en el diseño
- ✅ **Código limpio y documentado**

---

<div align="center">

*💻 Desarrollado como práctica de Colecciones en Java - Actividad 4*

</div>
