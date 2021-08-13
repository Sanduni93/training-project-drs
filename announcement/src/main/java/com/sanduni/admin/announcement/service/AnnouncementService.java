package com.sanduni.admin.announcement.service;

import com.sanduni.admin.announcement.model.Announcement;

import java.util.List;
import java.util.Optional;

public interface AnnouncementService {
    Announcement Save(Announcement announcementModel);
   // Optional<Announcement> fetchAnnouncementById(int id);
    List<Announcement> fetchAllAnnouncements();
    //String deleteAnnouncementById(int id);
}
