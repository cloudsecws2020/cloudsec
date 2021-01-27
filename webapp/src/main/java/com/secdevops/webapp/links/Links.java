package com.secdevops.webapp.links;

import org.springframework.stereotype.Component;

/**
 * @TODO
 * This class is used to manage the URL Strings of different API calls.
 * Could be directly hardcoded in the respective classes - this is merely for
 * a better overview and maintainability.
 *
 * Example: Create a user:
 * public static final String CREATE_USER = "/createUser";
 *
 * Controller Class:
 * // @GetMapping(path = UserLinks.CREATE_USER) <--> @GetMapping(path = "/createUser")
 * // public boolean createUser(User user) { ... }
 */
@Component
public class Links {
    public static final String CREATE_OR_UPDATE_USER = "/user/create/";
    public static final String READ_ALL_USERS = "/user/";
    public static final String READ_SINGLE_USER = "/user/read/";

    public static final String UPDATE_ = "/user/update/";
    public static final String DELETE_USER = "/user/delete/";
}
