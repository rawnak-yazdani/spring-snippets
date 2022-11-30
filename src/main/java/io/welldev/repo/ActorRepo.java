package io.welldev.repo;

import io.welldev.model.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ActorRepo<d> extends JpaRepository<Actor, Long> {
}
