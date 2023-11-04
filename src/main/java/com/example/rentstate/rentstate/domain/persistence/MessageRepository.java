package com.example.rentstate.rentstate.domain.persistence;

import com.example.rentstate.rentstate.domain.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MessageRepository extends JpaRepository<Message, Long> {
    //List<Message> findByRecipient(User recipient);
}
