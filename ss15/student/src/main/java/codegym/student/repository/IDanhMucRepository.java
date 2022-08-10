package codegym.student.repository;

import codegym.student.model.DanhMuc;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDanhMucRepository extends JpaRepository<DanhMuc,Integer> {
}
