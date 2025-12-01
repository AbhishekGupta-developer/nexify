package com.myorganisation.nexify.service;

import com.myorganisation.nexify.dto.request.UserRequestDto;
import com.myorganisation.nexify.dto.response.GenericResponseDto;
import com.myorganisation.nexify.dto.response.UserResponseDto;

import java.util.List;

public interface UserService {
    UserResponseDto registerUser(UserRequestDto userRequestDto);
    UserResponseDto getUser(Long id);
    List<UserResponseDto> getAllUsers();
    UserResponseDto updateUser(Long id, UserRequestDto userRequestDto);
    GenericResponseDto removeUser(Long id);

    UserResponseDto searchUserByUsername(String username);
    List<UserResponseDto> searchByUsernameContaining(String username);

    List<UserResponseDto> getUsersByName(String name);
}
