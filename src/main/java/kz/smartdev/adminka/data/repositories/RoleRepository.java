package kz.smartdev.adminka.data.repositories;

import kz.smartdev.adminka.data.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {
    @Query(value = "select r.* from users u " +
            "inner join user_role ur on u.id=ur.user_id " +
            "inner join role r on r.id=ur.role_id " +
            "where u.username=:username", nativeQuery = true)
    List<Role> getRolesByUsername(@Param("username") String username);
}
