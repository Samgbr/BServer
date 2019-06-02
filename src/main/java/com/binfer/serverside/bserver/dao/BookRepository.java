/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.binfer.serverside.bserver.dao;

import com.binfer.serverside.bserver.h2.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author samzi
 */
public interface BookRepository extends JpaRepository<Book,Integer>{
    Book findById(int id);
    void deleteById(int id);
}
