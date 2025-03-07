package sammy.ktor.tutorials.model

enum class Priority {
    Low, Medium, High, Vital
}

data class Task(
    val name: String,
    val description: String,
    val priority: Priority
)