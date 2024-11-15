package com.bryan.workshopmongo.resources;


import com.bryan.workshopmongo.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<User>> findAll(){
        User maria = new User(1L, "Maria Blue", "maria@gmail.com");
        User sara = new User(2L, "Sara Red", "sara2gmail.com");

        List<User> list = new ArrayList<>();
        list.addAll(Arrays.asList(maria,sara));
        return ResponseEntity.ok().body(list);
    }

}
