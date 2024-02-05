package com.Model3.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;

import com.Model3.Model.*;

@Controller

public interface ClienteR extends JpaRepository<ClienteM, Long >{

}