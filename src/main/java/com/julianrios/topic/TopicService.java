package com.julianrios.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {


//    TopicsRepo topicsRepo;
//
//    @Autowired
//    public TopicService(TopicsRepo topicsRepo) {
//        this.topicsRepo = topicsRepo;
//    }

    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("spring", "Spring Course", "Spring Framework Description"),
            new Topic("java", "Java Course", "Core Java"),
            new Topic("javascript", "JavaScript Course", "JavaScript Course")
            ));

   public List<Topic> getAllTopics() {
       return topics;
   }

   public Topic getTopic(String id) {
       return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
   }

    public void addTopic(Topic topic) {
       topics.add(topic);
    }

    public void updateTopic(Topic topic, String id) {
       for(int i=0; i < topics.size(); i++) {
           Topic t = topics.get(i);
           if(t.getId().equals(id)) {
               topics.set(i, topic);
               return;
           }
       }
    }

    public void deleteTopic(String id) {
//       for(int i=0; i < topics.size(); i++) {
//           if(topics.get(i).getId().equals(id)) {
//               topics.remove(i);
//           }
//       }
    topics.removeIf(t -> t.getId().equals(id));
    }
}
