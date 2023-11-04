package com.example.rentstate.rentstate.service;

import com.example.rentstate.rentstate.domain.model.Message;
import com.example.rentstate.rentstate.domain.persistence.MessageRepository;
import com.example.rentstate.rentstate.domain.service.MessageService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class MessageServiceImpl implements MessageService {

    private static final String ENTITY = "Post";

    private final MessageRepository messageRepository;

    public MessageServiceImpl(MessageRepository messageRepository) {

        this.messageRepository = messageRepository;
    }

    @Override
    public List<Message> getAll() {

        return messageRepository.findAll();
    }

    @Override
    public Page<Message> getAll(Pageable pageable) {
        return messageRepository.findAll(pageable);
    }

    /*@Override
    public Message getById(Long messageId) {
        return messageRepository.findById(messageId)
                .orElseThrow(() -> new ResourceNotFoundException(ENTITY, messageId));
    }*/

    @Override
    public Message create(Message message) {
        return messageRepository.save(message);
    }

    /*@Override
    public ResponseEntity<?> delete(Long messageId) {
        return messageRepository.findById(messageId).map(post -> {
                    messageRepository.delete(post);
                    return ResponseEntity.ok().build();})
                .orElseThrow(() -> new ResourceNotFoundException(ENTITY, messageId));
    }*/





}
