package lk.ijse.maven.cotton.service;

import lk.ijse.maven.cotton.dto.ContactDTO;

import java.util.ArrayList;

/**
 * Created by Ireshika Chamini on 10/2/2018.
 */
public interface ContactService {
    public boolean saveContact(ContactDTO contactDTO);

    public ArrayList<ContactDTO> getAllMessage();

   public boolean deleteCustomer(int mailId);

//    public ContactDTO getMessage(String mailId);
}
