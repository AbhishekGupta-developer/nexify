package com.myorganisation.nexify;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HomeController {
    @GetMapping
    public String myApi1(@RequestParam String name, @RequestParam String address) {
        return "This is a GET API: " + "payload - name: " + name + ", address: " + address;
    }

    @PostMapping("/{username}")
    public String myApi2(@PathVariable String username) {
        return "This is a POST API: " + "Path variable: " + username;
    }

    @PutMapping
    public String myApi3(@RequestBody User user) {
        return "This is a PUT API: " +
                "POJO (id: " + user.getId() +
                ", name: " + user.getName() +
                ", username: " + user.getUsername() +
                ", password: " + user.getPassword() + ")";
    }

    @PatchMapping
    public String myApi4() {
        return "This is a PATCH API";
    }

    @DeleteMapping
    public String myApi5() {
        return "This is a DELETE API";
    }
}
