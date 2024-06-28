package api.java.dio.api.controller;

import api.java.dio.api.dto.UserDTO;
import api.java.dio.api.requests.UserPostRequestBody;
import api.java.dio.domain.model.User;
import api.java.dio.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserService userService;


    @Operation(summary = "Obter usuário pelo id. Informação completa")
    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id){
        User userD = userService.findById(id);
        return ResponseEntity.ok(userD);
    }



    @Operation(summary = "Criar usuário")
    @PostMapping
    public ResponseEntity<User> create(@RequestBody UserPostRequestBody userToCreate){
        var userCreated = userService.create(userToCreate);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(userCreated.getId())
                .toUri();
        return ResponseEntity.created(location).body(userCreated);
    }

    @Operation(summary = "Obter usuário pelo nome. Informação curta")
    @GetMapping
    public ResponseEntity<List<UserDTO>> findByNameShortInformation(@RequestParam String name){
        List<UserDTO> userDTO = userService.findByNameShortInformations(name);
        return ResponseEntity.ok(userDTO);
    }
}
