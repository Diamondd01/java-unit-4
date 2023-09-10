package com.devmountain.noteApp.entites;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.devmountain.noteApp.dtos.NoteDto;

@Entity
@Table(name = "Notes")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "text")
    private String body;

    @ManyToOne
    @JsonBackReference
    private User user;
    public Note(NoteDto noteDto){
        if (noteDto.getBody() != null){
            this.body = noteDto.getBody();
        }
    }


}

