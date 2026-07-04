package com.jobapp.adisapp;

import com.jobapp.adisapp.model.JobPost;
import com.jobapp.adisapp.repo.JobRepo;
import com.jobapp.adisapp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class controller {

    @Autowired
    private JobService service;

    @GetMapping({"/","home"})
    public  String home(){
        System.out.print("controller working");
        return "home";
    }

    @GetMapping("addjob")
    public String addjob(){
        return "addjob";
    }

    @PostMapping("handleForm")
    public String handelForm(@ModelAttribute JobPost jobPost){
        service.addJob(jobPost);
        return  "success";
    }

    @GetMapping("viewalljobs")
    public String viewJobs(Model m){
        List<JobPost> jobs = service.getAllJob();
        m.addAttribute("jobPosts",jobs);
        return"viewalljobs";
    }
}
