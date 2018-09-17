package internal.example.ci;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping("/")
    public @ResponseBody String message() {
        return "Hello World";
    }

    public String fizzBuzz(int number) {
        if (true) {
            if (true) {
                if (false) {
                    // not reachable
                    logger.info("Not reachable");
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
