package kr.re.kitri.hellogram.todo.controller;

import kr.re.kitri.hellogram.todo.model.Todo;
import kr.re.kitri.hellogram.todo.service.TodoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoController {
    public final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    // 전체보기
    @GetMapping("/todos")
    public List<Todo> todos() {

        return todoService.getAllTodos();
    }

    // 상세보기
    @GetMapping("/todos/{todoId}")
    public Todo todoDetails(@PathVariable int todoId){

        return todoService.getTodoById(todoId);
    }

    // 등록하기
    @PostMapping("/todos")
    public int writeTodo(@RequestBody Todo todo){

        return todoService.writeTodo(todo);
    }

    // 삭제하기
    @DeleteMapping("/todos/{todoId}")
    public int removeTodo(@PathVariable int todoId){
        return todoService.removeTodoById(todoId);
    }

    // 수정하기
    @PutMapping("/todos")
    public int modifyTodo(@RequestBody Todo todo){
        return todoService.modifyTodo(todo);
    }
}
