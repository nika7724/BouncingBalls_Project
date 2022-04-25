package com.example.bouncingballs_project.services;

import com.example.bouncingballs_project.model.Images;
import com.example.bouncingballs_project.repository.DescriptionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DescriptionServices {
@Autowired
DescriptionRepo descriptionRepo;

    public List<Images> fetchAll() { //read

        return descriptionRepo.fetchAll();
    }

    /*public Images code(Images image) {

        return DescriptionRepo.code(image);*/
    }

