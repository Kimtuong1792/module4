package com.codegym.repository;

import com.codegym.model.Music;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class MusicRepository implements IMusicRepository {
    static List<Music> musicList = new ArrayList<>();

    static {
        musicList.add(new Music("que huong ", "Tuong ", "Rap", "D//abc//music"));
        musicList.add(new Music("Canh Dong", "Tran  ", "Rap", "D//abc//music"));
        musicList.add(new Music("Gia Nhu", " Luat ", "Rap", "D//abc//music"));
        musicList.add(new Music("all or nothing ", "huyen ", "Rap", "D//abc//music"));
    }

    @Override
    public List<Music> findAll() {
        return musicList;
    }

    @Override
    public void save(Music music) {
        musicList.add(music);

    }
}
