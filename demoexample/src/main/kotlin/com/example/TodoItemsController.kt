package com.example

import com.example.models.Todo
import io.micronaut.http.annotation.*

@Controller("/todo-items")
class TodoItemsController {
    private var todos = mutableListOf<Todo>()

    @Get
    fun getTodoItems(): List<Todo> {
        return todos
    }

    @Get("/{id}")
    fun getTodoItem(id: Int): Todo? {
        return todos.find { it.id == id }
    }

    @Post
    fun createTodoItem(@Body todo: Todo): Todo {
        todos.add(todo)
        return todo
    }

    @Put("/{id}")
    fun updateTodoItem(id: Int, @Body inputTodo: Todo): Todo {
        val todo = todos.find { it.id == id }
        if (todo != null) {
            todo.product = inputTodo.product
            todo.price = inputTodo.price
            todo.isComplete = inputTodo.isComplete
        }
        return inputTodo
    }

    @Delete("/{id}")
    fun deleteTodoItem(id: Int): String {
        val todo = todos.find { it.id == id }
        if (todo != null) {
            todos.remove(todo)
        }

        return "Deleted successfully!"
    }
}