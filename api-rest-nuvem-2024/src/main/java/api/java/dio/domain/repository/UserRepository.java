package api.java.dio.domain.repository;

import api.java.dio.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByAccountNumber(String accountNumber);

    @Query("SELECT u FROM tb_user u WHERE u.name LIKE %:name%")
    List<User> findByName(@Param("name") String name);
}
