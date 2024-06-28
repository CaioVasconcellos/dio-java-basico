package api.java.dio.service;

import api.java.dio.api.dto.UserDTO;
import api.java.dio.api.requests.UserPostRequestBody;
import api.java.dio.domain.model.User;

import java.util.List;

public interface UserService {

    User findById(Long id);

    User create(UserPostRequestBody userPostRequestBody);

    List<UserDTO> findByNameShortInformations(String name);


}
