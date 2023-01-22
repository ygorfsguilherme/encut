package com.guilherme.encut.service;

import com.guilherme.encut.UrlEncutDto;
import com.guilherme.encut.model.UrlEncut;
import com.guilherme.encut.repository.UrlEncutRepository;
import com.guilherme.encut.utils.RandomGeneratedPathUrl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UrlService {
    @Autowired
    UrlEncutRepository urlEncutRepository;

    public UrlEncut save(UrlEncutDto urlEncutDto){
        UrlEncut urlEncut = new UrlEncut(urlEncutDto);

        this.urlEncutRepository.save(urlEncut);

        return urlEncut;
    }

    public UrlEncut findByUrlPath(String path){
        return this.urlEncutRepository.findByUrlPath(path);
    }

}
