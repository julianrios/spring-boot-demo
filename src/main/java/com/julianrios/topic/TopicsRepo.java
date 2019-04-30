package com.julianrios.topic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicsRepo extends JpaRepository<Topic, Integer> {
}
