package eu.mrndesign.matned.controller;

import eu.mrndesign.matned.dto.UserDTO;
import eu.mrndesign.matned.dto.UserRegistrationDTO;
import eu.mrndesign.matned.service.SecurityService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private final SecurityService securityService;

    public UserController(SecurityService securityService) {
        this.securityService = securityService;
    }

    @GetMapping("/users")
    @ResponseBody
    public List<UserDTO> findAllUsers(@RequestParam(defaultValue = "${default.sort.by}", name = "sort") String[] sort,
                                      @RequestParam(defaultValue = "${default.page.start}", name = "page") Integer page,
                                      @RequestParam(defaultValue = "${default.page.size}", name = "amount") Integer amount) {
        return securityService.findAll(page, amount, sort);
    }

    @GetMapping("/users/{id}")
    @ResponseBody
    public UserDTO findAllUsers(@PathVariable Long id) {
        return securityService.findUserById(id);
    }

    @DeleteMapping("/users/{id}")
    @ResponseBody
    public List<UserDTO> deleteUser(@PathVariable Long id) {
        return securityService.deleteUser(id);
    }

    @PostMapping("/users")
    @ResponseBody
    public UserDTO addUser(@RequestBody UserRegistrationDTO userRegistrationDTO){
        return securityService.add(userRegistrationDTO);
    }

    @PostMapping("/users/{id}")
    @ResponseBody
    public UserDTO updateUserLogin(@PathVariable Long id, @RequestBody UserDTO userDTO){
        return securityService.updateLogin(id,userDTO);
    }

    @PostMapping("/users/{id}/password")
    @ResponseBody
    public UserDTO updateUserPassword(@PathVariable Long id, @RequestBody UserRegistrationDTO userRegistrationDTO){
        return securityService.updatePassword(id,userRegistrationDTO);
    }

    @GetMapping("/users/{id}/add-role/{userRole}")
    @ResponseBody
    public UserDTO assignRoleToUser(@PathVariable Long id, @PathVariable String userRole){
        return securityService.assignNewRole(id,userRole);
    }

    @GetMapping("/users/{id}/take-away-role/{userRole}")
    @ResponseBody
    public UserDTO takeAwayRoleFromUser(@PathVariable Long id, @PathVariable String userRole){
        return securityService.takeAwayRole(id,userRole);
    }



}
