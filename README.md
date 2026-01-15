# Taller 8 – Implementación de Algoritmos de Recorrido de Grafos (BFS y DFS)

## Asignatura
Estructura de Datos

## Carrera
Computación – FEIRNNR

## Docente
Ing. Andrés Roberto Navas Castellanos

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

