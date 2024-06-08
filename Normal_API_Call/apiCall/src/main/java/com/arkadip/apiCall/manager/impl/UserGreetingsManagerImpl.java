package com.arkadip.apiCall.manager.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.arkadip.apiCall.DTO.UserDTO;
import com.arkadip.apiCall.manager.UserGreetingsManager;
import com.arkadip.apiCall.model.User;

import jakarta.validation.Valid;

@Service
public class UserGreetingsManagerImpl implements UserGreetingsManager {

    @Override
    public User isSeniorCitizen(@Valid UserDTO dto) {
        User user = null;
        if (dto.getAge() > 50) {
            user = new User();
            BeanUtils.copyProperties(dto, user);
            user.setMarried(true);
            user.setSeniorCitizen(true);
            user.setSex(dto.getSex());
            return user;
        }
        throw new NullPointerException("Senior Citizen Club Only Visit");
    }

}
