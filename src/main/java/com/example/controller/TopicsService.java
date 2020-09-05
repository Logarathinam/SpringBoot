package com.example.controller;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicsService {
    List<pojo> topics= Arrays.asList(new pojo(1,"Spring boot","For Microservices"),
            new pojo(2,"Java","High Level Language"));


     public List<pojo> getAllTopics()
     {
         return  topics;
     }
}
