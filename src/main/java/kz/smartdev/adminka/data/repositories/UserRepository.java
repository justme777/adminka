package kz.smartdev.adminka.data.repositories;

import kz.smartdev.adminka.data.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByUsername(String username);
}
