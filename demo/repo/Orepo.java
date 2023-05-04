package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.modeldetails.modelO;

@Repository
public interface Orepo extends JpaRepository<modelO,Integer>
{

}