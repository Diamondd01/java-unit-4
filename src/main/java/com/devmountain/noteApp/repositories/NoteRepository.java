package com.devmountain.noteApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.devmountain.noteApp.entites.User;
import org.springframework.stereotype.Repository;
import com.devmountain.noteApp.entites.Note;

import java.util.List;


@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {
    List<Note> findAllByUserEquals(User user);
}
