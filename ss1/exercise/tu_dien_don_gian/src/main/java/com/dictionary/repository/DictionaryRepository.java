package com.dictionary.repository;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
@Repository
public class DictionaryRepository implements IDictionaryRepository{
    private  Map<String,String> list = new HashMap<>();

    @Override
    public String translate(String english) {
        {
            list.put("hello","xin chào");
            list.put("bye","tạm biệt");
            list.put("school","trường");
            list.put("class","lớp");
            list.put("book","sách");
            list.put("pen","bút chì");
            list.put("milktea","trà sữa");
            list.put("water","nước");

        }
        return list.get(english);
    }
}
