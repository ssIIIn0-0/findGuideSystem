package com.example.findguide.service;

import com.example.findguide.entity.Guide;
import com.example.findguide.entity.Users;
import com.example.findguide.repository.GuideRepository;
import com.example.findguide.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GuideService {

    @Autowired
    private GuideRepository guideRepository;

    @Autowired
    private UsersRepository usersRepository;

    public List<Guide> findGuidesByRegionAndTitle(String region, Integer travelerUserId) {
        Users traveler = usersRepository.findById(travelerUserId).orElse(null);

        if (traveler == null) {
            return null;
        }

        String travelerTitle = traveler.getTitle();

        List<Guide> guides = guideRepository.findByGuideRegion(region);

        return guides.stream()
                .filter(guide -> {
                    Users guideUser = usersRepository.findById(guide.getUserid()).orElse(null);
                    return guideUser != null && guideUser.getTitle().equals(travelerTitle);
                })
                .collect(Collectors.toList());
    }
}