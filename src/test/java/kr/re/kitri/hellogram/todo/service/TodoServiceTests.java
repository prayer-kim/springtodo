package kr.re.kitri.hellogram.todo.service;

import kr.re.kitri.hellogram.todo.model.Todo;
import kr.re.kitri.hellogram.todo.repository.TodoRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@SpringBootTest
public class TodoServiceTests {

    @Autowired
    private TodoRepository todoRepository;

    // 전체보기 테스트
    @Test
    public void testGetAllTodos(){
        List<Todo> todos = todoRepository.selectAllTodos();
        Assertions.assertFalse(todos.isEmpty());
    }

    // 상세보기 테스트
    @Test
    public void testGetTodoById(){
        // 1번으로 조회시 content가 "청소하기"일 경우 성공
        Todo todo = todoRepository.selectTodoById(1);

        Assertions.assertEquals("청소하기", todo.getContent());

    }

    // 할일 등록 테스트
    @Test
    @Transactional
    public void testWriteTodo(){
        Todo todo = new Todo(10, "강아지 밥주기", false);
        int i = todoRepository.insertTodo(todo);

        Todo todo1 = todoRepository.selectTodoById(10);
        Assertions.assertEquals("강아지 밥주기", todo1.getContent());


    }

    // 할일 삭제 테스트
    @Test
    @Transactional
    public void testRemoveTodo(){

    }

    // 할일 수정 테스트
    @Test
    public void testModifyTodo(){

    }

}
