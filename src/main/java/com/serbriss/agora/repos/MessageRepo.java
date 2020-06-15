package com.serbriss.agora.repos;

import com.serbriss.agora.domain.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepo extends CrudRepository<Message, Long> {
}
