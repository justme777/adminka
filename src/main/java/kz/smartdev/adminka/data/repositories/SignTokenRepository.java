package kz.smartdev.adminka.data.repositories;

import kz.smartdev.adminka.data.entity.SignToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SignTokenRepository extends JpaRepository<SignToken,Long> {
    SignToken findFirstByToken(String token);
}
