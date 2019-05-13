package ua.calc.CalcSpringBoot;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping() //"/calc"
public class GreetingController {

//    private List<Map<String,Integer>> messages = new ArrayList<Map<String,Integer>>();


    @GetMapping("/calc/{a}/{b}/{oper}")
    @ResponseBody
    public Calc getCalc(@PathVariable("a") String a,@PathVariable("b") String b, @PathVariable("oper") String oper) {
        Calc calc = new Calc(true, 155);
        //calc.getResult();
        return calc;
    }
/*
    @GetMapping
    public Map<String, Object> main(Map<String, Object> model) {
        model.put("some", "Hello, some Coder!");
        return model;
    }
*/
}

/*
    "success": true,
    "result": 133

    Пример запроса: /calc?a=123&b=10&oper=plus
 */