package todo;


import org.testng.Assert;
import org.testng.annotations.Test;

public class TodoListTest {
    @Test

    public void addTodoTest() {
        TodoList todos = new TodoList();
        todos.add("Buy milk");
        Assert.assertEquals(todos.getTodos().size(), 1);

    }
    @Test

    public void removeTodoTest() {
        TodoList todos = new TodoList();
        todos.add("Buy milk");
        Assert.assertEquals(todos.getTodos().size(), 1);
        todos.remove("Buy milk");
        Assert.assertEquals(todos.getTodos().size(), 0);

    }
}
