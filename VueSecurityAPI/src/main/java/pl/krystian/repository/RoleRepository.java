package pl.krystian.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.krystian.models.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
