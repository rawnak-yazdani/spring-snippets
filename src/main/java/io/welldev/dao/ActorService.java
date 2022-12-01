package io.welldev.dao;

import io.welldev.model.Actor;
import io.welldev.repo.ActorRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//@RequiredArgsConstructor
@AllArgsConstructor
@Component
@Transactional
public class ActorService {

//    @PersistenceContext
//    private EntityManager entityManager;

    @Autowired
//    @Getter
    public ActorRepo actorRepo;

//    public void add(Actor actor) {
//        entityManager.persist(actor);
//    }

//    public void addAll(List<Actor> actorList) {
//        for (Actor a:
//                actorList) {
//            entityManager.persist(a);
//        }
//    }

    public Actor get(Long id) {
//        return entityManager.find(Actor.class, id);
        Actor actor = actorRepo.findById(1L).get();
        return actor;
    }

    public List<Actor> findActorByName(String name) {
        return actorRepo.findActorByName(name).get();
    }

//    public void delete(Actor actor) {
//        entityManager.remove(actor);
//    }

    public List<Actor> getAll() {

        return actorRepo.findActor$().get();
    }

//    @Transactional
//    public void update(Actor actor) {
//        entityManager.merge(actor);
//    }
}
