package com.arkadip.apiCall.manager;

import com.arkadip.apiCall.DTO.UserDTO;
import com.arkadip.apiCall.model.User;

public interface UserGreetingsManager {

    User isSeniorCitizen(UserDTO dto);
}
