package at.fhtechnikum.FormCalc.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FormController {
    @GetMapping("/api/circle/{radius}")
    public float calcCircle(@PathVariable int radius){
        return (float) (3.14 * radius * radius);
    }

    @GetMapping("/api/square/{length}")
    public int calcSquare(@PathVariable int length){
        return length * length;
    }
}
