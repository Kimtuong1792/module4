package codegym.music2.service;

import codegym.music2.model.Music;
import codegym.music2.repository.IMusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MusicService implements IMusicService {
    @Autowired
    IMusicRepository musicRepository;

    @Override
    public Page<Music> findAll(Pageable pageable) {
        return musicRepository.findAll(pageable);
    }

    @Override
    public void save(Music music) {
        musicRepository.save(music);
    }

    @Override
    public Optional<Music> findById(int id) {
        return musicRepository.findById(id);
    }

    @Override
    public void remove(int id) {
        musicRepository.deleteById(id);
    }

    @Override
    public Page<Music> search(String name, Pageable pageInfo) {
        return musicRepository.findByNameContaining("%" + name +"%" ,pageInfo);
    }
}
