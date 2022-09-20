package todo;

import java.util.ArrayList;
import java.util.List;

public class TodoList {
    private List<String> todos;

    public TodoList(){
        this.todos = new ArrayList<>();
    }

    public void add(String todo) {
        todos.add(todo);
    }

    public void remove(String todo) {
        todos.remove(todo);
    }

    public List<String> getTodos() {
        return this.todos;
    }
}
