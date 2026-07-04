package com.jobapp.adisapp.service;

import com.jobapp.adisapp.model.JobPost;
import com.jobapp.adisapp.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo repo;

    public void addJob(JobPost jobPost){
        repo.addJob(jobPost);
    }
    public List<JobPost> getAllJob(){
        return repo.getAllJobs();
    }
}
