package ua.calc.CalcSpringBoot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    private final String error = "Some One";

    @RequestMapping(value = "/calc", method = RequestMethod.GET)
    public Calc calc(@RequestParam(value="name", required=false, defaultValue="World") String name) {
        //return new Calc(counter.incrementAndGet(), String.format(template, name), "Operation is not supported");
        return null;//new Calc(0, 0, "plus", 0,"Operation is not supported");
    }
/*
    @GetMapping
    public String main(Map<String, Object> model) {
        model.put("some", "Hello, some Coder!");
        return "main";
    }

 */
}
