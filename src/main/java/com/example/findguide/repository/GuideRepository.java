package com.example.findguide.repository;

import com.example.findguide.entity.Guide;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GuideRepository extends JpaRepository<Guide, Integer> {
    List<Guide> findByGuideRegion(String guideRegion);
}
