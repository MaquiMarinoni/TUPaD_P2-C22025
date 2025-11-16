# 🚗 Proyecto Java – Colecciones y Estadísticas de Objetos

Este proyecto está centrado en el uso de **colecciones en Java** y operaciones comunes como recorridos, sumatorias, cálculos de promedio, y determinación de valores máximos y mínimos en una lista de objetos. Los ejemplos están basados en una colección de objetos `Auto`.

## 📚 Tabla de Contenidos

- Ciclo For Each en Java
- Promedio y Sumatoria en una Colección
- Máximos y Mínimos en una Colección
- Conclusión y aprendizaje

---

## 🔁 Parte 1: Ciclo For Each en Java

Esta sección demuestra cómo recorrer una colección de objetos utilizando el bucle `for-each`, que ofrece una forma sencilla y legible de iterar sobre listas.

### ✨ Objetivo

Recorrer una lista de autos (`ArrayList<Auto>`) e imprimir su información por consola.

### 🧪 Código de ejemplo

```java
public void mostrarAutos() {
    if (autos.isEmpty()) {
        System.out.println("No hay autos");
    } else {
        // Mostrando con for-each
        for (Auto auto : autos) {
            System.out.println(auto);
        }
    }
}
```
## 🧩 Parte 2: Promedio y Sumatoria en una Colección

En esta parte se calcula la suma total de kilómetros recorridos por los autos y se obtiene el promedio.

### ✨ Objetivo

Aplicar lógica de acumulación y cálculo promedio sobre una lista de objetos personalizados (`Auto`).

### 📦 Código

```java
public int sumatoriaKmsRecorridos() {
    int acumulador = 0;
    for (Auto auto : autos) {
        acumulador += auto.getKmsRecorridos();
    }
    return acumulador;
}

public int cantAutos() {
    return autos.size();
}

public double promedioKmsRecorridos() {
    return (cantAutos() > 0 ? (double) sumatoriaKmsRecorridos() / cantAutos() : 0);
}
```
## 🧩 Parte 3: Máximos y Mínimos

Esta sección muestra cómo encontrar el auto que más y menos kilómetros ha recorrido, aplicando comparaciones simples dentro de bucles.

### ✨ Objetivo

Determinar los objetos con valores extremos en una colección (máximos y mínimos).

### 📦 Código

```java
public ArrayList<Auto> autosMasKmsRecorridos() {
    ArrayList<Auto> listaDeMaximos = new ArrayList<>();
    int kmsMax = -1;

    for (Auto auto : autos) {
        if (auto.getKmsRecorridos() == kmsMax) {
            listaDeMaximos.add(auto);
        } else if (auto.getKmsRecorridos() > kmsMax) {
            kmsMax = auto.getKmsRecorridos();
            listaDeMaximos.clear();
            listaDeMaximos.add(auto);
        }
    }
    return listaDeMaximos;
}

public Auto autoMenosKmsRecorridos() {
    Auto autoMin = null;
    int kmsMin = Integer.MAX_VALUE;

    for (Auto auto : autos) {
        if (auto.getKmsRecorridos() < kmsMin) {
            kmsMin = auto.getKmsRecorridos();
            autoMin = auto;
        }
    }
    return autoMin;
}
```
## 🧠 Parte 4: Conclusión y aprendizaje

Este proyecto refuerza los conceptos esenciales de programación orientada a objetos y manipulación de colecciones en Java:

- Uso de `ArrayList` para almacenar y manejar objetos.
- Aplicación del ciclo `for-each` para recorrer listas.
- Cálculo de sumatorias, promedios, máximos y mínimos.

Estas herramientas son clave para desarrollar sistemas robustos y eficientes en Java, facilitando la reutilización, escalabilidad y mantenimiento del código.

