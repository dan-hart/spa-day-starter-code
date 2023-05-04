package org.launchcode.spaday.controllers;

import org.launchcode.spaday.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

// You need to add the appropriate annotation to this class
public class UserController {
    // You need to add the appropriate annotation to this method
    public String displayAddUserForm() {
        // Return the view name
        return "";
    }

    // You need to add the appropriate annotation to this method
    public String processAddUserForm(Model model, @ModelAttribute User user, String verify) {
        // Add attributes to model and return view name
        return "";
    }
}
