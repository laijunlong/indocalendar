package com.indocalendar.webapp.dao;

import com.indocalendar.webapp.beans.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GirlRep extends JpaRepository<Girl,Integer> {
}
