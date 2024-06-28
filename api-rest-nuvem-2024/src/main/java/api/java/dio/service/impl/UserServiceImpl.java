package api.java.dio.service.impl;

import api.java.dio.api.dto.UserDTO;
import api.java.dio.api.mapper.UserMapper;
import api.java.dio.api.requests.UserPostRequestBody;
import api.java.dio.domain.model.User;
import api.java.dio.domain.repository.UserRepository;
import api.java.dio.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;


    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }


    @Override
    public User create(UserPostRequestBody userPostRequestBody) {
        if (userRepository.existsByAccountNumber(userPostRequestBody.accountNumber())) {
            throw new IllegalArgumentException("This Account number already exists!");
        }
        User user = UserMapper.INSTANCE.toUser(userPostRequestBody);
        return userRepository.save(user);
    }

    @Override
    public List<UserDTO> findByNameShortInformations(String name) {
        List<User> users = userRepository.findByName(name);
        return users.stream()
                .map(UserMapper.INSTANCE::toDTO)
                .collect(Collectors.toList());
    }
}
