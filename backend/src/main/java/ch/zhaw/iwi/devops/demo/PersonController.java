package ch.zhaw.iwi.devops.demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PersonController {
    private Map<Integer, Person> persons = new HashMap<>();
    @EventListener(ApplicationReadyEvent.class)
    public void init() {
        this.persons.put(1,new Person(1, "Barack Obama"));
        this.persons.put(2,new Person(2, "Donald Trump"));
        this.persons.put(3,new Person(3, "Joe Biden"));
        System.out.println("Init Data");
    }

    @GetMapping("/person/ping")
    public String ping() {
        String languageCode = "de";
        return "{ \"status\": \"ok\", \"userId\": \"admin"+ "\", \"languageCode\": \"" + languageCode + "\",\"version\": \"0.0.1" + "\"}";
    }

    @GetMapping("/person/count")
    public int count() {
        return this.persons.size();
    }

    @GetMapping("/person/{id}")
    public Person getPerson(@PathVariable Integer id) { 
        return this.persons.get(id);
    }

    @PostMapping("/person")
    public void createPerson(@RequestBody Person todo) {
        var newId = this.persons.keySet().stream().max(Comparator.naturalOrder()).orElse(0) + 1; todo.setId(newId);
        this.persons.put(newId, todo);
    }

    @PutMapping("/person/{id}")
    public void createPerson(@PathVariable Integer id, @RequestBody Person todo) {
        todo.setId(id);
        this.persons.put(id, todo);
    }

    @DeleteMapping("/person/{id}")
    public Person deleteTodo(@PathVariable Integer id) {
        return this.persons.remove(id);
    }
    
}
