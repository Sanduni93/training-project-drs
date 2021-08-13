package com.sanduni.admin.announcement.service;

import com.sanduni.admin.announcement.model.Announcement;
import com.sanduni.admin.announcement.repository.AnnouncementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnnouncementServiceImpl implements AnnouncementService{

    @Autowired
    AnnouncementRepository announcementRepository;

    @Override
    public Announcement Save(Announcement announcementModel) {
        return announcementRepository.save(announcementModel);
    }
//    @Override
//    public Optional<Announcement> fetchAnnouncementById(int id) {
//        return announcementRepository.findById(id);
//    }

    @Override
    public List<Announcement> fetchAllAnnouncements() {
        return announcementRepository.findAll();
    }

//    @Override
//    public String deleteAnnouncementById(int id) {
//        String result;
//
//        try{
//            announcementRepository.deleteById(id);
//            result = "Published Annuncement is successfully deleted.";
//        }
//        catch (Exception e){
//            result = "Published announcement has not deleted.";
//        }
//        return result;
    }



