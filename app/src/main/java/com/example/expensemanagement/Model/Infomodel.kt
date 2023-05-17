package com.example.expensemanagement.Model

class Infomodel {

    var id = 0
    var awt: Int = 0
    var categry: String
    var note: String
    var isexpense = 0

    constructor(id: Int, awt: Int, categry: String, note: String, isexpense: Int) {
        this.id = id
        this.awt = awt
        this.categry = categry
        this.note = note
        this.isexpense = isexpense
    }
}
