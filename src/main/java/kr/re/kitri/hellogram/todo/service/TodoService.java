package kr.re.kitri.hellogram.todo.service;

import kr.re.kitri.hellogram.todo.model.Todo;

import java.util.List;

public interface TodoService {
    // todo리스트 전체보기
    List<Todo> getAllTodos();

    // todo리스트 상세보기
    Todo getTodoById(int todoId);

    // todo리스트 등록
    int writeTodo(Todo todo);

    int removeTodoById(int todoId);

    int modifyTodo(Todo todo);
}
