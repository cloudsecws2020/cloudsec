package com.secdevops.webapp.repository;

import com.secdevops.webapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource()
public interface UsersRepository extends JpaRepository<User, Integer>,
                                         JpaSpecificationExecutor<User>,
                                         QuerydslPredicateExecutor<User> {
}
