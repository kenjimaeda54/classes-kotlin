package repository

data class Books(
    var author: String,
    var name: String,
    var year: Long,
    var company: String? = null
)