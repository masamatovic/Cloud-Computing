package com.cloud.webapp.Controller;


import com.cloud.webapp.Model.Counter;
import com.cloud.webapp.Service.CounterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CounterController {

    @Autowired
    CounterService counterService;

  /*  @RequestMapping("/")
    public String index() {
        return counterService.inc().toString();
    }
*/
    @GetMapping("/env")
    public String getEnv() {
       // return System.getenv("POSTGES_CONNECTION_STING");
        return "Hello from dokcer";
    }

}