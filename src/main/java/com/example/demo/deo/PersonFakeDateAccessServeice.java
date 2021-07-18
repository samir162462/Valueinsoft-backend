package com.example.demo.deo;


import com.example.demo.Model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class PersonFakeDateAccessServeice {

    ArrayList<Person> PersonList = new ArrayList<>();

    public PersonFakeDateAccessServeice(ArrayList<Person> personList) {
        PersonList = personList;
    }

    public ArrayList<Person> getPersonList() {
        return PersonList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        PersonList = personList;
    }
}
