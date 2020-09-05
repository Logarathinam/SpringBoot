package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicsController {

    @Autowired
    private TopicsService topicservice;
    @RequestMapping("/topics")
    public List<pojo> allTopics()
    {
         return topicservice.getAllTopics();
    }

    @RequestMapping("/topics/{id}")
    public pojo getTopic(@PathVariable("id") int id)
    {
        return topicservice.getTopic(id);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/topics")
    public void addTopic(@RequestBody pojo topic)
    {
       topicservice.addTopic(topic);
    }
}
