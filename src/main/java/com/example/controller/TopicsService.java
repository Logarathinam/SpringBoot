package com.example.controller;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.lang.*;
@Service
public class TopicsService {
    List<pojo> topics= Arrays.asList(new pojo(1,"Spring boot","For Microservices"),
            new pojo(2,"Java","High Level Language"));


     public List<pojo> getAllTopics()
     {
         return  topics;
     }

     public pojo getTopic(int id)
     {
         return topics.stream().filter(t->t.getId() == id).findFirst().get();
     }
}
