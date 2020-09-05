package com.example.controller;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.lang.*;
@Service
public class TopicsService {
    private List<pojo> topics= new ArrayList<>(Arrays.asList(new pojo(1,"Spring boot","For Microservices"),
            new pojo(2,"Java","High Level Language")));


     public List<pojo> getAllTopics()
     {
         return  topics;
     }

     public pojo getTopic(int id)
     {
         return topics.stream().filter(t->t.getId() == id).findFirst().get();
     }

    public void addTopic(pojo topic) {
         topics.add(topic);
    }

    public void UpdateTopic(int id,pojo topic) {
         for(int i=0;i<topics.size();i++)
         {
             pojo t=topics.get(i);
             System.out.println(t.getId());
             System.out.println(id);
             if(t.getId()==id)
             {
                 topics.set(i,topic);
                 return;
             }
         }
    }

    public void DeleteTopic(int id) {
         topics.removeIf(t->t.getId()==id);
    }
}
