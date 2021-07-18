package com.example.demo.Api;


import com.example.demo.Model.Person;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


@RequestMapping("api/v1/person")
@RestController
@CrossOrigin("*")
public class PersonController {
    ArrayList<Person> PersonsList = new ArrayList<>();
    boolean got_data = false;

    @PostMapping(
            value = "/signup")
         //   consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
         //   produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<Person> postBody(@RequestBody Person person) {
        System.out.println(person);
        try {
            System.out.println(person.getId());
           // System.out.println(person.getName());
            PersonsList.add(new Person(person.getUserName(),person.getPassword(),person.getRole(),person.getFirstName(),person.getLastName(),person.getEmail()));
        }catch (Exception e)
        {

            System.out.println(e);
            System.out.println("eeeeerrrorr");
        }
        return null;

    }


    @RequestMapping(value = "/Pid", method = RequestMethod.GET)
    @ResponseBody
    public Person getPersonByID(
            @RequestParam("id") String id) {
        for (int i = 0; i < PersonsList.size(); i++) {
            if (PersonsList.get(i).getId().toString().equals(id)) {
                System.out.println("found");
                return PersonsList.get(i);
            }
        }

        return null;
    }
    @RequestMapping(value = "/PidName", method = RequestMethod.GET)
    @ResponseBody
    public ArrayList<Person> getPersonsByNames(


            @RequestParam("id")List<String> id

            ) {
        System.out.println(id.get(1));

        ArrayList<Person>persons = new ArrayList<>();
        for (int i = 0; i < PersonsList.size(); i++) {
            if (PersonsList.get(i).getUserName().contains(id.get(0)) && PersonsList.get(i).getPassword().contains(id.get(1))) {
                persons.add(PersonsList.get(i));

            }
        }
        return persons;
    }



    @GetMapping("/get")
    public ArrayList<Person> GetPersons() {

        if (got_data == false) {
            Person p = new Person(UUID.randomUUID(),"SamFil","0000");
            Person p2 = new Person(UUID.randomUUID(),"MohFil","1111");
            Person p3 = new Person(UUID.randomUUID(),"Admin","2222");
            PersonsList.add(p);
            PersonsList.add(p2);
            PersonsList.add(p3);
            got_data = true;
        }
        System.out.println("done");
        return PersonsList;

    }

}
