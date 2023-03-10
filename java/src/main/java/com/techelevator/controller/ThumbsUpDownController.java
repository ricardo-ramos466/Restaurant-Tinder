package com.techelevator.controller;


import com.techelevator.dao.ThumbsUpDownDao;
import com.techelevator.model.ThumbsUpDown;
import com.techelevator.model.VoteRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(path = "votes/")
public class ThumbsUpDownController {

    @Autowired
    private ThumbsUpDownDao thumbsUpDownDao;


    @GetMapping(path = "vote")
    private List<ThumbsUpDown> getThumbsUpDown(@RequestBody VoteRequest voteRequest){
        return thumbsUpDownDao.getVote(voteRequest);
    }

    @PutMapping(path = "save")
    private boolean update(@RequestBody ThumbsUpDown thumbsUpDown){
        return thumbsUpDownDao.update(thumbsUpDown);
    }

    @PostMapping(path = "create")
    private boolean create(@RequestBody ThumbsUpDown thumbsUpDown){
        return thumbsUpDownDao.createVote(thumbsUpDown);
    }

}
