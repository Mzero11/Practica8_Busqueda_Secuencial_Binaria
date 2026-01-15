# Taller 8 – Implementación de Algoritmos de Recorrido de Grafos (BFS y DFS)

## Asignatura
Estructura de Datos

## Carrera
Computación – FEIRNNR

## Docente
Ing. Andrés Roberto Navas Castellanos

## Integrantes

- Mateo Fabián Silva Aguilar

- Ariel Ismael González Astudillo

---

## Objetivo del Proyecto

Implementar correctamente los algoritmos de recorrido de grafos:

- **BFS (Búsqueda en Anchura)**
- **DFS (Búsqueda en Profundidad)**

aplicados a **grafos dirigidos y no dirigidos**, cargados desde archivos de texto, permitiendo:

- Seleccionar el **grafo**
- Elegir el **vértice de origen**
- Mostrar **orden de visita**
- Mostrar **distancias mínimas (niveles) en BFS**
- Soportar **grafos de cualquier dimensión n×n**

---

## Descripción General

El proyecto implementa una solución modular en Java utilizando las siguientes clases:

- `Graph` → Representa el grafo y carga la matriz de adyacencia desde un archivo `.txt`
- `BFS` → Implementa el algoritmo de búsqueda en anchura y calcula distancias
- `DFS` → Implementa el algoritmo de búsqueda en profundidad
- `MainDemo` → Menú interactivo para ejecutar las pruebas

Los grafos se cargan desde archivos ubicados en la carpeta `src/data`.

---

## Estructura del Proyecto
```
src/
├── data/
│ ├── g_dirigido_matriz.txt
│ ├── g_nodirigido_matriz.txt
│ └── g_nuevo_matriz.txt (opcional)
│
├── Graph.java
├── BFS.java
├── DFS.java
└── MainDemo.java
```

---

## Formato de los Archivos `.txt`

Los grafos deben estar representados como **matrices de adyacencia**:

- Valores `0` y `1`
- Matriz cuadrada **n×n**
- Separación por espacios

Ejemplo (4×4):

0 1 0 1

1 0 1 0

0 1 0 1

1 0 1 0


El sistema detecta automáticamente el número de vértices (`n`).

---

## Menú Interactivo

Al ejecutar el programa se muestra el siguiente menú:



===== MENÚ DE GRAFOS =====

Grafo Dirigido

Grafo No Dirigido

Nuevo Grafo

Salir


### Opciones del menú

- **Opción 1:** Carga `g_dirigido_matriz.txt`
- **Opción 2:** Carga `g_nodirigido_matriz.txt`
- **Opción 3:** Carga automáticamente `g_nuevo_matriz.txt` si existe
    - El programa funciona con cualquier dimensión

---

## Selección del Vértice de Origen

Para cada ejecución, el sistema solicita:



Ingrese el vértice de origen (1 a n):


Donde `n` es el número de vértices del grafo cargado.

Internamente los índices se manejan desde `0`, pero en consola se muestran desde `1`.

---

## Salida en Consola

Para cada grafo y origen seleccionado, el programa muestra:

- **Orden de visita BFS**
- **Distancias (niveles) BFS**
- **Orden de visita DFS**

Ejemplo:

=== RESULTADOS DESDE EL VÉRTICE 1 ===

Tipo de grafo: Dirigido

BFS: [1, 2, 3, 9]

Distancias BFS:

Vértice 1 -> 0

Vértice 2 -> 1

Vértice 3 -> 1

...

DFS: [1, 2, 3, 7]


---

## Evidencia para el Informe

A partir de la salida en consola se construyen tablas que incluyen:

- Vértice
- Orden de visita BFS
- Distancia (nivel)

Estas tablas se presentan **por dataset y por vértice de origen**, como lo solicita el taller.

---

## Requisitos

- **Java JDK 17 o superior**
- **IntelliJ IDEA (Community Edition)**
- Sistema operativo Windows / Linux / macOS

---

## Ejecución

1. Abrir el proyecto en IntelliJ IDEA
2. Verificar que los archivos `.txt` estén en `src/data`
3. Ejecutar la clase `MainDemo`
4. Interactuar con el menú en consola

---

## Conclusiones

- BFS permite obtener **distancias mínimas en grafos no ponderados**
- DFS es útil para **exploración y análisis estructural del grafo**
- El sistema es **flexible**, **reutilizable** y **escalable**
- La solución soporta **grafos dirigidos, no dirigidos y de cualquier dimensión**

---

## Referencias

- OpenDSA Project – Graph Traversals
- Skiena, *The Data Structures and Algorithms Design Manual*
- Oracle Java Documentation – Collections Framework