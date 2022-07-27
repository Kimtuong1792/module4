package codegym.music2.repository;

import codegym.music2.model.Music;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IMusicRepository extends JpaRepository<Music,Integer> {
    @Query(value = "select * from music where name_music like :search", nativeQuery= true)
    Page<Music> findByNameContaining(@Param("search") String name, Pageable pageable);
}
