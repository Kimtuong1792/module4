package com.codegym.repository;

import com.codegym.model.Music;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Repository
@Transactional
public class MusicRepository implements IMusicRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public MusicRepository() {

    }

    @Override
    public List<Music> findAll() {
       // return this.entityManager.createQuery("from Music , Music .class").getResultList();
//        return query.getResultList();

        TypedQuery<Music> query = entityManager
                .createQuery("SELECT s FROM Music as s", Music.class);
        return query.getResultList();

    }

    @Override
    public void save(Music music) {
        entityManager.persist(music);
    }

    @Override
    public void remove(Music music) {
        entityManager.remove(music);
    }

    @Override
    public void update(int id, Music music) {
        entityManager.merge(music);
//        for (Music item : musicList) {
//            if (item.getId() == id) {
//                item.setId(music.getId());
//                item.setNameMusic(music.getNameMusic());
//                item.setAuthor(music.getAuthor());
//                item.setTypeOfMusic(music.getTypeOfMusic());
//                item.setLink(music.getLink());
//            }
//        }
    }

}
