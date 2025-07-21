data class Task(val title: String, val isDone: Boolean){
} //Data Class
fun main() {
    println("Setup successful!")
    val tasks= mutableListOf(
        Task("Submit assignment", true), //Task One
        Task("Clean the house", false), // Task 2
        Task("Write a book", false)) //Task 3


for (task in tasks) { //for loop to print the needed emojies according to the boolean value
    val status = if (task.isDone) "✅" else "❌" //isDone is boolean and here means if its true to return right emojie and if not wrong emoji
    println("$status ${task.title}") //returns the emoji (if true right emoji if wrong X emoji)  then the task done.
}
}
