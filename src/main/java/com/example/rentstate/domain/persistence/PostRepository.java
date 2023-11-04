package com.example.rentstate.domain.persistence;

import com.example.rentstate.domain.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findByAvailable(Boolean isAvailable);

    List<Post> findByAuthor(User author);

}
