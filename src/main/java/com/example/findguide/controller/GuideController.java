package com.example.findguide.controller;

import com.example.findguide.entity.Guide;
import com.example.findguide.service.GuideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/guides")
public class GuideController {

    @Autowired
    private GuideService guideService;

    @GetMapping("/search")
    public List<Guide> findGuides(@RequestParam String region, @RequestParam Integer travelerUserId) {
        return guideService.findGuidesByRegionAndTitle(region, travelerUserId);
    }

}