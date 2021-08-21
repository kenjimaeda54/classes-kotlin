package listBooks

import repository.Books

val listBook = mutableListOf(

    Books(
        author = "Joao",
        name = "Terra Seca",
        year = 1889,
    ),
    Books(
        author = "Fernando",
        name = "Terra Molhada",
        year = 2014,
        company = "Editora Veja"
    ),
    Books(
        author = "Pedro",
        name = "Seca",
        year = 1560,
        company = "Sam franciso"
    ),
    Books(
        author = "Erika",
        name = "Seca MOlahda",
        year = 1860,
        company = "Samaritano"
    ),
    Books(
        author = "Fernandinho",
        name = "MOlhado",
        year = 1360,
    ),
    Books(
        author = "Sabaita",
        name = "Indio",
        year = 1560,
        company = "Samaritano"
    ),


    )

val listBooksWithNull = mutableListOf(
    Books(
        author = "Joao",
        name = "Terra Seca",
        year = 1889,
    ),
    null,
    Books(
        author = "Fernando",
        name = "Terra Molhada",
        year = 2014,
        company = "Editora Veja"
    ),
    Books(
        author = "Pedro",
        name = "Seca",
        year = 1560,
        company = "Sam franciso"
    ),
    null,
    Books(
        author = "Erika",
        name = "Seca MOlahda",
        year = 1860,
        company = "Samaritano"
    ),
    Books(
        author = "Fernandinho",
        name = "MOlhado",
        year = 1360,
    ),
    Books(
        author = "Sabaita",
        name = "Indio",
        year = 1560,
        company = "Samaritano"
    ),
)