package com.rslakra.springbootsamples.jwtauthentication.repository;

import com.rslakra.springbootsamples.jwtauthentication.model.IdentityDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IdentityRepository extends JpaRepository<IdentityDO, Long> {

    Optional<IdentityDO> findByUserName(String userName);

    Boolean existsByUserName(String userName);

    Boolean existsByEmail(String email);
}
