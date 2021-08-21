package repository

data class Books(
    var author: String,
    var year: Long,
    var company: String? = null,
    var name: String,
)