package com.petproject.education.repo;

import com.petproject.education.models.PostModel;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<PostModel, Long> {
}
