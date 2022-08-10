package codegym.student.service.IMPL;

import codegym.student.model.DanhMuc;
import codegym.student.repository.IDanhMucRepository;
import codegym.student.service.IDanhMucService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DanhMucService implements IDanhMucService {
    @Autowired
    IDanhMucRepository questionTypeRepository;
    @Override
    public List<DanhMuc> findAll() {
        return questionTypeRepository.findAll();
    }
}
