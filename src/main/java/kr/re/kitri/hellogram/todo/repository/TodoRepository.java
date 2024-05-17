package kr.re.kitri.hellogram.todo.repository;

import kr.re.kitri.hellogram.todo.model.Todo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface TodoRepository {
    List<Todo> selectAllTodos();

    Todo selectTodoById(int todoId);

    int insertTodo(Todo todo);

    int deleteTodoById(int todoId);

    int updateTodo(Todo todo);
}
