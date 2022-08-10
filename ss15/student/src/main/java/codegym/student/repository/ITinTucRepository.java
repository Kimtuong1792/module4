package codegym.student.repository;

import codegym.student.model.TinTuc;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface ITinTucRepository extends JpaRepository<TinTuc,Integer> {
    @Query(value="select tin_tuc.* from tin_tuc " +
            " left join danh_muc on tin_tuc.danh_muc_id = danh_muc.id where danh_muc.name like :search and tin_tuc.tieu_de like :tieu_de",
            countQuery = "SELECT count(*) FROM tin_tuc left join danh_muc on tin_tuc.danh_muc_id = danh_muc.id where danh_muc.name like :search and tin_tuc.tieu_de like :tieu_de"
    ,nativeQuery = true)
    Page<TinTuc> findByNameContaining(@Param("search") String search, @Param("tieu_de") String tieu_de, Pageable pageable);
}
