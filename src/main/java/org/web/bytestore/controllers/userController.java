package org.web.bytestore.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.web.bytestore.dao.userDao;
import org.web.bytestore.models.user;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/user")
public class userController{

    @Autowired
    private userDao dao;

    @GetMapping()
    public List<user> getAll(){
        return (List<user>) dao.findAll();
    }

    @PostMapping
    public user create(@RequestBody user user){
        user u = dao.save(user);
        return u;
    }

    @PutMapping
    public user update(@RequestBody user user){
        user u = dao.save(user);
        return u;
    }

    @DeleteMapping("/{id}")
    public user delete(@PathVariable Long id){
        Optional<user> user = dao.findById(id);
        dao.deleteById(id);
        return user.get();
    }

}
