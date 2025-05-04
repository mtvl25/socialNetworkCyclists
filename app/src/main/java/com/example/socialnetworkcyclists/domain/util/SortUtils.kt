package com.example.socialnetworkcyclists.domain.util

/**
 * Utilities para algoritmos de ordenamiento y búsqueda
 * con complejidad O(n log n) para colecciones en memoria.
 */
object SortUtils {
    /**
     * Implementa Merge Sort de forma genérica.
     * Complejidad: O(n log n) tiempo, O(n) espacio adicional.
     *
     * @param list Lista de elementos comparables a ordenar.
     * @return Una nueva lista ordenada.
     */
    fun <T : Comparable<T>> mergeSort(list: List<T>): List<T> {
        if (list.size <= 1) return list
        val mid = list.size / 2
        val left = mergeSort(list.subList(0, mid))
        val right = mergeSort(list.subList(mid, list.size))
        return merge(left, right)
    }

    /**
     * Implementa Merge Sort genérico usando una función de extracción de clave.
     * @param list Lista de elementos a ordenar.
     * @param selector Función que extrae la clave Comparable de cada elemento.
     * @return Una nueva lista ordenada según la clave.
     */
    fun <T, R: Comparable<R>> mergeSortBy(
        list: List<T>,
        selector: (T) -> R
    ): List<T> {
        if (list.size <= 1) return list
        val mid = list.size / 2
        val left = mergeSortBy(list.subList(0, mid), selector)
        val right = mergeSortBy(list.subList(mid, list.size), selector)
        return mergeBy(left, right, selector)
    }

    private fun <T, R: Comparable<R>> mergeBy(
        left: List<T>,
        right: List<T>,
        selector: (T) -> R
    ): List<T> {
        val result = mutableListOf<T>()
        var i = 0
        var j = 0
        while (i < left.size && j < right.size) {
            if (selector(left[i]) <= selector(right[j])) {
                result.add(left[i++])
            } else {
                result.add(right[j++])
            }
        }
        while (i < left.size) result.add(left[i++])
        while (j < right.size) result.add(right[j++])
        return result
    }

    /**
     * Funde dos listas ordenadas en una sola ordenada.
     */
    private fun <T : Comparable<T>> merge(
        left: List<T>,
        right: List<T>
    ): List<T> {
        val result = mutableListOf<T>()
        var i = 0
        var j = 0
        while (i < left.size && j < right.size) {
            if (left[i] <= right[j]) {
                result.add(left[i++])
            } else {
                result.add(right[j++])
            }
        }
        // Agregar remanentes
        while (i < left.size) result.add(left[i++])
        while (j < right.size) result.add(right[j++])
        return result
    }
}



object SearchUtils {
    /**
     * Implementa Binary Search en una lista ordenada.
     * Complejidad: O(log n).
     *
     * @param list Lista ordenada donde buscar.
     * @param key  Elemento a buscar.
     * @return Índice de la posición si se encuentra, o -1 si no.
     */
    fun <T : Comparable<T>> binarySearch(list: List<T>, key: T): Int {
        var low = 0
        var high = list.size - 1
        while (low <= high) {
            val mid = (low + high) ushr 1  // divide por 2 de forma segura
            val midVal = list[mid]
            when {
                midVal < key  -> low = mid + 1
                midVal > key  -> high = mid - 1
                else           -> return mid
            }
        }
        return -1  // no encontrado
    }
}
