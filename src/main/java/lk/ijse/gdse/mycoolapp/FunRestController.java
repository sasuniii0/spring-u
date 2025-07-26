package lk.ijse.gdse.mycoolapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @GetMapping("teamInfo")
    public String teamInfo(){
        return "Coach: " + coachName + ", Team: " + teamName;
    }

    @GetMapping("/")
    public String sayHello(){
        return "Hello World";
    }

    @GetMapping("/fun")
    public String sayFun(){
        return "Fun World";
    }

    @GetMapping("/fun2")
    public String sayFun2(){
        return "Fun2 World";
    }
}
