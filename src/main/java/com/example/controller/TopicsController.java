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
    //GET Method
    @RequestMapping("/topics/{id}")
    public pojo getTopic(@PathVariable("id") int id)
    {
        return topicservice.getTopic(id);
    }

    //POST Method
    @RequestMapping(method = RequestMethod.POST,value = "/topics")
    public void addTopic(@RequestBody pojo topic)
    {
       topicservice.addTopic(topic);
    }

    //PUT Method
    @RequestMapping(method = RequestMethod.PUT,value = "/topics/{id}")
    public void UpdateTopic(@PathVariable("id") int id,@RequestBody pojo topic)
    {
        topicservice.UpdateTopic(id,topic);

    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/topics/{id}")
    public void DeleteTopic(@PathVariable("id") int id) {
        topicservice.DeleteTopic(id);
    }

}
