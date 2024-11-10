package br.com.fiap.GlobalSolution.controller;

import br.com.fiap.GlobalSolution.domainmodel.Users;
import br.com.fiap.GlobalSolution.service.UsersService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

@Controller
@RequestMapping(value = "/users")
public class UsersController {

    @Autowired
    private @Setter UsersService service;

    @GetMapping("/addNewUsers")
    public String addNewUsers(Model model) {
        Users use = new Users();
        model.addAttribute("users", use);
        return "newUsers";
    }

    @PostMapping("/saveUsers")
    public String save(@ModelAttribute("users") Users users) {
        this.service.save(users);
        return "redirect:/indexUsers";
    }

    @GetMapping("/deleteUsers/{id}")
    public String deleteThroughId(@PathVariable("id") Long id) {
        this.service.deleteById(id);
        return "redirect:/indexUsers";
    }

    @GetMapping("/users")
    public String viewHomePageAsList(Model model) {
        Collection<Users> usersList = this.service.findAll();
        System.out.println("Users List Size: " + usersList.size());
        model.addAttribute("allUsersList", usersList);
        return "indexUsers";
    }

    @GetMapping("/showFormForUpdateUsers/{id}")
    public String showUpdateForm(@PathVariable("id") Long id, Model model) {
        Optional<Users> users = this.service.findById(id);
        if (users.isPresent())
            model.addAttribute("users", users.get());
        else
            System.out.println("Error");
        return "updateUsers";
    }

    @PostMapping("/updateUsers")
    public String update(@ModelAttribute("users") Users users) {
        this.service.save(users);
        return "redirect:/indexUsers";
    }
}