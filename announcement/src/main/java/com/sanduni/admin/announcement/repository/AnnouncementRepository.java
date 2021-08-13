package com.sanduni.admin.announcement.repository;

import com.sanduni.admin.announcement.model.Announcement;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AnnouncementRepository extends JpaRepository<Announcement, Integer> {

}
