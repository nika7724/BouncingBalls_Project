package com.example.bouncingballs_project.repository;

import com.example.bouncingballs_project.model.Images;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DescriptionRepo {

    @Autowired
JdbcTemplate jdbcTemplate;

    public List<Images> fetchAll() {
String sql ="SELECT* FROM images";
        RowMapper<Images> rowMapper = new BeanPropertyRowMapper<>(Images.class);//Java beans Pojo(basic object), mapping rows of a ResultSet on a per-row basis
        return jdbcTemplate.query(sql, rowMapper);
    }
    /*public Images code(Images image) {

        return null;
    }*/

}
