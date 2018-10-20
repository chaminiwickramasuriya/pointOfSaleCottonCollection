package lk.ijse.maven.cotton.service.Impl;

import lk.ijse.maven.cotton.dto.ContactDTO;
import lk.ijse.maven.cotton.entity.Contact;
import lk.ijse.maven.cotton.repository.ContactRepository;
import lk.ijse.maven.cotton.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ireshika Chamini on 10/2/2018.
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactRepository contactRepository;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean saveContact(ContactDTO contactDTO){
        Contact contact=new Contact(contactDTO.getMailId(),contactDTO.getEmail(),
                contactDTO.getSubject(),contactDTO.getMessage());
        contactRepository.save(contact);
        return true;
    }

    @Override
    public ArrayList<ContactDTO> getAllMessage() {
        List<Contact> contacts = contactRepository.findAll();
        ArrayList<ContactDTO>alContacts = new ArrayList<>();
        for (Contact contact : contacts) {
            ContactDTO contactDTO = new ContactDTO(contact.getMailId(),
                    contact.getEmail(),
                    contact.getMessage());
            alContacts.add(contactDTO);
        }
        return alContacts;
    }

    @Override
    public boolean deleteCustomer(int mailId) {
        contactRepository.deleteById(mailId);
        return true;
    }

//    @Override
//    public ContactDTO getMessage(String mailId) {
//        Contact contact = contactRepository.findById(mailId).get();
//        ContactDTO contactDTO = new ContactDTO(contact.getEmail(),contact.getMessage(),contact.getSubject());
//        return contactDTO;
//    }
}
