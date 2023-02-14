package com.ldb.testOpta;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("ldbgreeting")
    public ResponseEntity<?> greetingLDB(){
        Message msg = new Message();
        msg.setGreeting("Hello to ");
        msg.setFirstname("Mr. Sommany");
        msg.setLastname(" XAITHANY");
        return ResponseEntity.ok(msg);
    }

    @GetMapping("testService")
    public ResponseEntity<?> delayService() throws Exception {
        Thread.sleep(5000);
        return ResponseEntity.ok("Hello from delay service");
    }
}
