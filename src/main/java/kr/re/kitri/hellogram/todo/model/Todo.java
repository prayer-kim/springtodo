package kr.re.kitri.hellogram.todo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Todo {
    long todoId;
    String content;
    boolean completed;

    public Todo() {

    }
}
