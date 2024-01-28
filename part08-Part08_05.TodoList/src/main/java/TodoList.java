/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mateo
 */
import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> todos;

    public TodoList() {
        this.todos = new ArrayList();
    }

    public void add(String task) {
        this.todos.add(task);
    }

    public void remove(int number) {
        this.todos.remove(number - 1);
    }

    public ArrayList<String> getList() {
        return todos;
    }

    public void print() {
        for (String todo : todos) {
            System.out.println(todos.indexOf(todo) + 1 + ": " + todo);
        }
    }
}
