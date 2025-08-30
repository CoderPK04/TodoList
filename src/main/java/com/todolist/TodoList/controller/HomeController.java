package com.todolist.TodoList.controller;

import com.todolist.TodoList.model.Todo;
import com.todolist.TodoList.repository.TodoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    private final TodoRepository todoRepository;

    public HomeController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("todos", todoRepository.findAll());
        return "index";  // will load src/main/resources/templates/index.html
    }

    @PostMapping("/add")
    public String addTodo(@ModelAttribute Todo todo) {
        todoRepository.save(todo);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String deleteTodo(@PathVariable Long id) {
        todoRepository.deleteById(id);
        return "redirect:/";
    }

    @GetMapping("/toggle/{id}")
    public String toggleTodo(@PathVariable Long id) {
        Todo todo = todoRepository.findById(id).orElseThrow();
        todo.setCompleted(!todo.isCompleted());
        todoRepository.save(todo);
        return "redirect:/";
    }
}
