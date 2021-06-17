package com.example.hama.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hama.models.State;

@Repository
public interface StateRepository extends JpaRepository<State, Integer> {

}
