package com.myorganisation.nexify.dto.response;

import com.myorganisation.nexify.enums.Gender;
import com.myorganisation.nexify.model.MetaData;
import com.myorganisation.nexify.model.Profile;
import lombok.Data;

@Data
public class UserResponseDto {
    private Long id;
    private String name;
    private String email;
    private String username;
    private Gender gender;
    private Profile profile;
    private MetaData metaData;
}
