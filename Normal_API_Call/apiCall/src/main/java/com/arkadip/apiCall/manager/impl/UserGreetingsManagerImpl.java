package com.arkadip.apiCall.manager.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.arkadip.apiCall.DTO.UserDTO;
import com.arkadip.apiCall.manager.UserGreetingsManager;
import com.arkadip.apiCall.model.User;

@Service
public class UserGreetingsManagerImpl implements UserGreetingsManager {

    @Override
    public User isSeniorCitizen(UserDTO dto) {
        User user = new User();
        if (dto.getAge() > 50) {
            BeanUtils.copyProperties(dto, user);
            user.setMarried(true);
            user.setSeniorCitizen(true);
            return user;
        }
        throw new NullPointerException("Senior Citizen Club Only Visit");
    }

}
