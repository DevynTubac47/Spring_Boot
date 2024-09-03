package com.devyntubac.soccerfieldmanager.services;

import com.devyntubac.soccerfieldmanager.models.User;

public interface IAuthService {
    public User save(User user);
    public User login();

}
