package api.java.dio.api.mapper;

import api.java.dio.api.dto.UserDTO;
import api.java.dio.api.requests.UserPostRequestBody;
import api.java.dio.domain.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;



@Mapper(componentModel = "spring")
public abstract class UserMapper {
    public static final UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    @Mapping(source = "name", target = "name")
    @Mapping(source = "accountNumber", target = "account.number")
    @Mapping(source = "accountAgency", target = "account.agency")
    @Mapping(source = "cardNumber", target = "card.number")
    @Mapping(target = "features", source = "features")
    @Mapping(target = "news", source = "news")
    public abstract User toUser(UserPostRequestBody userPostRequestBody);

    public UserDTO toDTO(User user) {
        return new UserDTO(user.getId(),
                user.getName(),
                user.getAccount().getNumber(),
                user.getAccount().getAgency(),
                user.getCard().getNumber()
                );
    }



}

