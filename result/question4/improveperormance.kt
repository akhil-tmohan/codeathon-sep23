To improve the performance of the program for an array of 50000 elements, we can use a more efficient sorting algorithm such as quicksort or mergesort. Here's an updated program that uses mergesort:

fun sortArray(arr: IntArray): IntArray {
    mergeSort(arr, 0, arr.size - 1) // sort the array using mergesort
    return arr // return the sorted array
}

fun mergeSort(arr: IntArray, left: Int, right: Int) {
    if (left >= right) return // base case
    val mid = (left + right) / 2 // find the middle index
    mergeSort(arr, left, mid) // sort the left half
    mergeSort(arr, mid + 1, right) // sort the right half
    merge(arr, left, mid, right) // merge the two halves
}

fun merge(arr: IntArray, left: Int, mid: Int, right: Int) {
    val leftArr = arr.copyOfRange(left, mid + 1) // create a copy of the left half
    val rightArr = arr.copyOfRange(mid + 1, right + 1) // create a copy of the right half
    var i = 0 // index for left half
    var j = 0 // index for right half
    var k = left // index for merged array
    while (i < leftArr.size && j < rightArr.size) {
        if (leftArr[i] <= rightArr[j]) {
            arr[k++] = leftArr[i++]
        } else {
            arr[k++] = rightArr[j++]
        }
    }
    while (i < leftArr.size) {
        arr[k++] = leftArr[i++]
    }
    while (j < rightArr.size) {
        arr[k++] = rightArr[j++]
    }
}

//This program uses mergesort to sort the array, which has a time complexity of O(n log n) and is more efficient than the built-in sort() function for large arrays.