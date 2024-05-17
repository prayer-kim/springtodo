package kr.re.kitri.hellogram.todo.service;

import kr.re.kitri.hellogram.todo.model.Todo;
import kr.re.kitri.hellogram.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {
    @Autowired
    TodoRepository todoRepository;

    @Override
    public List<Todo> getAllTodos() {
        return todoRepository.selectAllTodos();
    }

    @Override
    public Todo getTodoById(int todoId) {

        return todoRepository.selectTodoById(todoId);
    }

    @Override
    public int writeTodo(Todo todo) {

        return todoRepository.insertTodo(todo);
    }

    @Override
    public int removeTodoById(int todoId) {
        todoRepository.deleteTodoById(todoId);
        return 1;
    }

    @Override
    public int modifyTodo(Todo todo) {
        return todoRepository.updateTodo(todo);
    }
}
