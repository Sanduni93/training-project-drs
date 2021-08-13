package com.sanduni.admin.announcement.controller;


import com.sanduni.admin.announcement.model.Announcement;
import com.sanduni.admin.announcement.repository.AnnouncementRepository;
import com.sanduni.admin.announcement.service.AnnouncementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
public class AnnouncementController {

    @Autowired
    AnnouncementService announcementService;

    @Autowired
    AnnouncementRepository announcementRepository;

    @RequestMapping(value = "/announcement", method = RequestMethod.POST)
    @CrossOrigin(origins = "http://localhost:4200")
    public Announcement save(@RequestBody Announcement announcement){
        return announcementService.Save(announcement);
    }

//    @RequestMapping (value = "/announcement/{id}", method = RequestMethod.GET)
//
//    public Announcement fetchAnnouncementById(@PathVariable int id){
//        return announcementService.fetchAnnouncementById(id).get();
//    }

    @RequestMapping(value = "/announcements", method = RequestMethod.GET)
    @CrossOrigin(origins = "http://localhost:4200")
    public List<Announcement> fetchAllAnnouncement(){
        List<Announcement> announcements = new ArrayList<Announcement>();
        announcements = announcementService.fetchAllAnnouncements();
        return announcements;
    }

//    @RequestMapping(value = "/announcement/{id}", method = RequestMethod.DELETE)
//
//    public String delete(@PathVariable int id){
//        return announcementService.deleteAnnouncementById(id);
//    }




}
