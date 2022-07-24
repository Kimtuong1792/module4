package codegym.music2.service;

import codegym.music2.model.Music;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import javax.persistence.ManyToOne;
import java.util.List;
import java.util.Optional;

public interface IMusicService {
    Page<Music> findAll(Pageable pageable);

    void save(Music music);

    Optional<Music> findById(int id);

    void remove(int id);

    Page<Music> search(String name, Pageable pageInfo);
}
