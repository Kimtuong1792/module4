package com.codegym.repository;

import com.codegym.model.Music;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

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
    @Modifying
    public void save(Music music) {
        entityManager.persist(music);
    }

    @Override
    @Modifying
    public void remove(Music music) {
//        music.setId(id);
//        System.out.println(music.getId());
//        entityManager.remove(music);
        entityManager.merge(entityManager.merge(music));
    }

    @Override
    @Modifying
    public void update( Music music) {

        entityManager.merge(music);

    }

    @Override
    public Music findOne(int id) {
//        Music music = null;
//
//        for (Music item : ) {
//            if (item.getIdentity().equals(identity)) {
//                medicalDeclaration = new MedicalDeclaration(item.getName(), item.getBirthday(),
//                        item.getGender(), item.getCountry(), item.getIdentity(), item.getRender(),
//                        item.getVehicleNumber(), item.getSeats(), item.getStarDay(), item.getStarMonth(),
//                        item.getStarYear(), item.getEndDay(), item.getEndMonth(), item.getEndYear(),
//                        item.getInformation());
//            }
//        }
//        return music;

        Music music = entityManager.
                createQuery("select m from Music m where m.id =:id",Music.class).setParameter("id",id).getSingleResult();
        return music;
    }

}
