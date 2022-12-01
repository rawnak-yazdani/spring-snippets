package io.welldev.repo;

import io.welldev.model.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ActorRepo extends JpaRepository<Actor, Long> {
    Optional<List<Actor>> findActorByName(String name);
    @Query("SELECT a from actoRRR a")
    Optional<List<Actor>> findActor$();
}
