package lk.ijse.maven.cotton.controller;

import lk.ijse.maven.cotton.dto.ContactDTO;
import lk.ijse.maven.cotton.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * Created by Ireshika Chamini on 10/2/2018.
 */
@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/contacts")
public class ContactController {

    @Autowired
    private ContactService contactService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE ,produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean saveContact(@RequestBody ContactDTO contactDTO){
        return contactService.saveContact(contactDTO);
    }

//    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
//    public ContactDTO getMessage(@RequestParam("mailId")  String mailId){
//        return contactService.getMessage(mailId);
//    }
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<ContactDTO> getAllMessages() {
        return contactService.getAllMessage();
    }

    @DeleteMapping(value = "/{mailId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean deleteContact(@PathVariable("mailId") int mailId) {
        return contactService.deleteCustomer(mailId);
    }

}
