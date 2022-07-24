package com.codegym.service;

import com.codegym.model.Mail;
import com.codegym.repository.IMailRepository;
import com.codegym.repository.MailRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MailService implements IMailService {
    IMailRepository mailRepository = new MailRepository();

    @Override
    public List<Mail> findAll() {
        return mailRepository.findAll();
    }

    @Override
    public void save(Mail mail) {
        mailRepository.save(mail);
    }

    @Override
    public void update(Mail mail) {
        mailRepository.update(mail);
    }

}
