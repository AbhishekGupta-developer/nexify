package com.myorganisation.nexify.service;

import com.myorganisation.nexify.dto.request.UserRequestDto;
import com.myorganisation.nexify.dto.response.GenericResponseDto;
import com.myorganisation.nexify.dto.response.UserResponseDto;
import com.myorganisation.nexify.model.User;
import com.myorganisation.nexify.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserResponseDto registerUser(UserRequestDto userRequestDto) {
        Long userId = userRepository.generateUserId();

        User user = mapUserRequestDtoToUser(userRequestDto, new User());

        userRepository.userMap.put(userId, user);

        user = userRepository.userMap.get(userId);

        return mapUserToUserResponseDto(user);
    }

    @Override
    public UserResponseDto getUser(Long id) {
        User user = userRepository.userMap.get(id);
        if(user != null) {
            return mapUserToUserResponseDto(user);
        } else {
            return null;
        }
    }

    @Override
    public List<UserResponseDto> getAllUsers() {
        List<User> userList = new LinkedList<>(userRepository.userMap.values());
        List<UserResponseDto> userResponseDtoList = new LinkedList<>();

        for(User user : userList) {
            userResponseDtoList.add(mapUserToUserResponseDto(user));
        }

        return userResponseDtoList;
    }

    @Override
    public UserResponseDto updateUser(Long id, UserRequestDto userRequestDto) {
        User user = userRepository.userMap.get(id);

        if(user != null) {
            mapUserRequestDtoToUser(userRequestDto, user);
            userRepository.userMap.put(id, user);

            user = userRepository.userMap.get(id);

            return mapUserToUserResponseDto(user);
        } else {
            return null;
        }
    }

    @Override
    public GenericResponseDto removeUser(Long id) {
        return null;
    }

    // Helper methods
    
    // Map User to UserResponseDto
    private UserResponseDto mapUserToUserResponseDto(User user) {
        UserResponseDto userResponseDto = new UserResponseDto();
        userResponseDto.setId(user.getId());
        userResponseDto.setName(user.getName());
        userResponseDto.setEmail(user.getEmail());
        userResponseDto.setUsername(user.getUsername());
        userResponseDto.setGender(user.getGender());

        return userResponseDto;
    }
    
    // Map UserRequestDto to User
    private User mapUserRequestDtoToUser(UserRequestDto userRequestDto, User user) {
        user.setName(userRequestDto.getName());
        user.setEmail(userRequestDto.getEmail());
        user.setUsername(userRequestDto.getUsername());
        user.setPassword(userRequestDto.getPassword());
        user.setGender(userRequestDto.getGender());
        
        return user;
    }
}




















