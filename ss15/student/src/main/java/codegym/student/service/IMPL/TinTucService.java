package codegym.student.service.IMPL;

import codegym.student.model.TinTuc;
import codegym.student.repository.ITinTucRepository;
import codegym.student.service.ITinTucService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class TinTucService implements ITinTucService {
    @Autowired
    ITinTucRepository tinTucRepository;

    @Override
    public Page<TinTuc> findAll(Pageable pageable) {
        return tinTucRepository.findAll(pageable);
    }

    @Override
    public void save(TinTuc question) {

        tinTucRepository.save(question);
    }

    @Override
    public Optional<TinTuc> findById(int id) {
        return tinTucRepository.findById(id);
    }

    @Override
    public void remove(int id) {
        tinTucRepository.deleteById(id);
    }

    @Override
    public Page<TinTuc> findByNameContaining(String name, String tieu_de, Pageable pageable) {
        if (name != "") {
            return tinTucRepository.findByNameContaining(name, "%" + tieu_de + "%", pageable);
        }
        return tinTucRepository.findByNameContaining("%" + name + "%", "%" + tieu_de + "%", pageable);
    }

}
