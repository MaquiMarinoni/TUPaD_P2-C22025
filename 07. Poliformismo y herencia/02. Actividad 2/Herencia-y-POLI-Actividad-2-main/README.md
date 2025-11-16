# 📚 **Proyectos Java - Videos de Herencia y Polimorfismo**

Este repositorio contiene **4 mini-proyectos** en Java orientados a la Programación Orientada a Objetos 🧠. Cada uno demuestra conceptos fundamentales como `protected`, uso de `super`, `upcasting`, y `instanceof`.  
¡Ideal para principiantes que quieran entender cómo funciona la herencia y el polimorfismo en Java! 🚀

---

## 📼 1 - Video1: `protected` 🔐

📂 **Paquete:** `org.example.vehiculos`  
🔧 **Clases:** `Vehiculo`, `Auto`, `Moto`, `Main`, `MiLista`, `OtraClase`

### 🎯 Objetivo
Aprender cómo funciona el modificador de acceso `protected`. Se muestra cómo los atributos y métodos `protected` pueden **accederse desde clases hijas**, pero **no desde clases externas** fuera del paquete.

### 🧠 Conceptos clave
- `protected` permite el acceso dentro del mismo paquete o desde subclases.
- No se puede acceder a `marca` directamente desde `Main` o `OtraClase`, pero sí desde `Auto` o `Moto`.
- También se ve que atributos privados de `ArrayList` **no se heredan**, como en `MiLista`.

### ▶️ Ejemplo
```java
Vehiculo v = new Vehiculo();
System.out.println(v.marca); // ❌ No compila: 'marca' es protected
```

---

## 📼 2 - Video2: `super` 🧬

📂 **Paquete:** `org.example`  
🔧 **Clases:** `Vehiculo`, `Auto`, `Moto`, `Principal`

### 🎯 Objetivo
Comprender cómo llamar al **constructor de la clase padre** usando `super(...)`.

### 🧠 Conceptos clave
- Uso de `super()` en constructores de subclases.
- Inicialización de atributos heredados desde `Vehiculo`.
- Sobrescritura del método `toString()` para mostrar info completa.

### 🚗 Ejemplo
```java
Auto a = new Auto(true, "MarcaFalsa", "XYZ", "ABC123");
a.acelerar(); // Acelerando...
System.out.println(a); // Vehiculo{marca=MarcaFalsa, modelo=XYZ, patente=ABC123}
```

---

## 📼 3 - Video3: `UpCasting` 🎭

📂 **Paquete:** `org.example`  
🔧 **Clases:** `Vehiculo`, `Auto`, `Moto`, `Concesionaria`, `Principal`

### 🎯 Objetivo
Demostrar cómo funciona el **upcasting**, es decir, tratar un objeto de una subclase como si fuera de la clase padre.

### 🧠 Conceptos clave
- `Vehiculo v = new Auto(...);` → Esto es upcasting.
- Permite manejar distintos tipos de vehículos en una misma colección.
- Uso de `instanceof` para verificar el tipo real.

### 🧪 Código
```java
Concesionaria c = new Concesionaria();
c.agregarVehiculo(new Auto(...));
c.agregarVehiculo(new Moto(...));
```

📋 Output:
```
true
Es un auto
false
```

---

## 📼 4 - Video4: `instanceof` 🕵️‍♂️

📂 **Paquete:** `org.example`  
🔧 **Clases:** `Vehiculo`, `Auto`, `Moto`, `Concesionaria`, `Main`

### 🎯 Objetivo
Refuerzo del operador `instanceof` para detectar el tipo de objeto en tiempo de ejecución.

### 🧠 Conceptos clave
- Aunque todos los objetos están guardados como `Vehiculo`, con `instanceof` podemos detectar si son `Auto` o `Moto`.
- Nos permite aplicar lógica distinta según el tipo real del objeto.

### 📦 Bonus
Ideal para lógica condicional más elaborada:
```java
if (v instanceof Moto moto) {
    moto.hacerWheelie();
}
```

---

## 🚀 Cómo ejecutar los proyectos

1. Cloná el proyecto:
   ```bash
   git clone https://github.com/tu-usuario/proyecto-vehiculos-java.git
   cd proyecto-vehiculos-java
   ```

2. Abrí el proyecto en tu IDE favorito (IntelliJ, Eclipse, VS Code).

3. Ejecutá el `main` correspondiente:
   - `Video1` → `Main.java`
   - `Video2` → `Principal.java`
   - `Video3` → `Principal.java`
   - `Video4` → `Main.java`

---

## 📚 ¿Qué vas a aprender?

✔️ Modificadores de acceso en Java (`protected`, `private`, `public`)  
✔️ Cómo funciona la herencia y el uso de `super()`  
✔️ Qué es el `upcasting` y por qué es útil  
✔️ Cómo usar `instanceof` para lógica basada en tipos  

---

## ✍️ Autor

Hecho con 💻 + ☕  
por **Ignacio Molina** — *aprendiendo y enseñando Java paso a paso*
