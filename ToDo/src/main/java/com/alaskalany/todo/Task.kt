package com.alaskalany.todo

data class Task internal constructor(val label: String) {
    private var _done: Boolean = false
    var done: Boolean
        get() = _done
        set(value) {
            _done = value
        }
}