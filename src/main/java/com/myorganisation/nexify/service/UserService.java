package com.myorganisation.nexify.service;

import com.myorganisation.nexify.dto.request.LoginRequestDto;
import com.myorganisation.nexify.dto.request.UserRequestDto;
import com.myorganisation.nexify.dto.response.GenericResponseDto;
import com.myorganisation.nexify.dto.response.UserResponseDto;
import com.myorganisation.nexify.enums.Gender;
import org.springframework.data.domain.Page;

import java.util.List;

public interface UserService {
    UserResponseDto registerUser(UserRequestDto userRequestDto);
    GenericResponseDto loginUser(LoginRequestDto loginRequestDto);
    UserResponseDto getUser(Long id);
    List<UserResponseDto> getAllUsers();
    UserResponseDto updateUser(Long id, UserRequestDto userRequestDto);
    GenericResponseDto removeUser(Long id);

    UserResponseDto searchUserByUsername(String username);
    List<UserResponseDto> searchByUsernameContaining(String username);

    List<UserResponseDto> getUsersByName(String name);

    List<UserResponseDto> searchByNameAndGender(String name, Gender gender, String type);

    Page<UserResponseDto> getUserPage(Integer pageIndex, Integer pageSize, String sortBy, String sortOrder);
}
