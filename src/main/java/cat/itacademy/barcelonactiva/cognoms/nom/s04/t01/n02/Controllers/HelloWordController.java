package cat.itacademy.barcelonactiva.cognoms.nom.s04.t01.n02.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {
    @GetMapping("/HelloWorld")
    public String greet(@RequestParam(value = "name", defaultValue = "UNKNOWN") String name){
        return "Hello, " + name + ". You're running a Maven project.";
    }

    @GetMapping({"/HelloWorld2", "/HelloWorld2/{name}"})
    public String greet2(@PathVariable(required = false) String name){
        if (name != null){
            return "Hello, " + name + ". You're running a Maven project.";
        } else {
            return "Name missing.";
        }
    }
}
