package test.jan.demo;


import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FizzBuzzController {
    @GetMapping("fizzbuzz/")
    public List<String>  fizzbuzz(@RequestParam (value = "x", defaultValue="10") Integer number){
        
        List<String> numbers = new ArrayList<>();

        for(Integer i =1;i<=number;i++){
            String append = "";
            if (i % 3 == 0){
                append += "Fizz";
            }
            if (i % 5 == 0){
                append += "Buzz";
            }
            //Falls wir keinen anderen Wert festgestellt haben als die Zahl, wählen wir diese als Wert
            if(append.equals("")){
                append = i.toString();
            }
            numbers.add(append);
        }

        return numbers;
    }

}
