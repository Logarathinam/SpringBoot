package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
