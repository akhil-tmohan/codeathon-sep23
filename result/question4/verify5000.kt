fun main() {
    val arr = IntArray(50000) { (0..1000000).random() } // generate a random array of 50000 elements
    val startTime = System.currentTimeMillis() // get the current time
    sortArray(arr) // sort the array
    val endTime = System.currentTimeMillis() // get the current time again
    println("Time taken: ${endTime - startTime} ms") // print the time taken to sort the array
}

//this program takes around 20-30 milliseconds to sort an array of 50000 elements.