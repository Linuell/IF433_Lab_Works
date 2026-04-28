package week10

data class ApiResponse<T>(
    val status: String,
    val data: T
)