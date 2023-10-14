package dev.macedolg.movies.repository;

import dev.macedolg.movies.model.Review;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iReviewRepository extends MongoRepository<Review, ObjectId> {
}
