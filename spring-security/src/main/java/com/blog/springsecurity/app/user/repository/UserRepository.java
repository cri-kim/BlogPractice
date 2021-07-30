<<<<<<< HEAD
package com.blog.springsecurity.app.user.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blog.springsecurity.app.user.domain.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	Optional<User> findByEmail(String email);
}
=======
package com.blog.springsecurity.app.user.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blog.springsecurity.app.user.domain.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	Optional<User> findByEmail(String email);
}
>>>>>>> 92d11ea1ce9cdc5e166da397e7384eb4733f2b78
