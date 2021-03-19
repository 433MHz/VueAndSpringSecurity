package pl.krystian.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.krystian.models.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
