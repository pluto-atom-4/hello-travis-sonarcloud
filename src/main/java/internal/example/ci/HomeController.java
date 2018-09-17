package internal.example.ci;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @RequestMapping("/")
    public @ResponseBody String message() {
        return "Hello World";
    }

    public String fizzBuzz(int number) {
        if (true) {
            if (true) {
                if (false) {
                    // nothing to do.
                }
            }
        }
        String fizzBuzz = fizz(number) + buzz(number);
        return fizzBuzz.isEmpty() ? String.valueOf(number) : fizzBuzz;
    }

    private String fizz(int number) {
        return number > 10 ? "more than 10" : "";
    }

    private String buzz(int number) {
        return number > 100 ? "more than 100" : "";
    }
}
