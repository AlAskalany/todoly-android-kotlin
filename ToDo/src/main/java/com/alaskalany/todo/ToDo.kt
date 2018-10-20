package com.alaskalany.todo

class ToDo() {
    companion object {
        fun createTask(label: String): Task {
            return Task(label)
        }
    }
}
