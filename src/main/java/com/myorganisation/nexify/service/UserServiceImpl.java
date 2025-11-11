package com.myorganisation.nexify.service;

import com.myorganisation.nexify.dto.request.UserRequestDto;
import com.myorganisation.nexify.dto.response.GenericResponseDto;
import com.myorganisation.nexify.dto.response.UserResponseDto;
import com.myorganisation.nexify.model.User;
import com.myorganisation.nexify.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserResponseDto registerUser(UserRequestDto userRequestDto) {
        Long userId = userRepository.generateUserId();

        User user = new User();
        user.setId(userId);
        user.setName(userRequestDto.getName());
        user.setEmail(userRequestDto.getEmail());
        user.setUsername(userRequestDto.getUsername());
        user.setPassword(userRequestDto.getPassword());
        user.setGender(userRequestDto.getGender());

        userRepository.userMap.put(userId, user);

        user = userRepository.userMap.get(userId);

        UserResponseDto userResponseDto = new UserResponseDto();
        userResponseDto.setId(user.getId());
        userResponseDto.setName(user.getName());
        userResponseDto.setEmail(user.getEmail());
        userResponseDto.setUsername(user.getUsername());
        userResponseDto.setGender(user.getGender());

        return userResponseDto;
    }

    @Override
    public UserResponseDto getUser(Long id) {
        return null;
    }

    @Override
    public List<UserResponseDto> getAllUsers() {
        return List.of();
    }

    @Override
    public UserResponseDto updateUser(Long id, UserRequestDto userRequestDto) {
        return null;
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
}




















