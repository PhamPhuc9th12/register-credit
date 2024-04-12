package com.project.credits.mapper;

import com.project.credits.dto.user.ChangeInfoUserRequest;
import com.project.credits.dto.user.FriendSearchingOutput;
import com.project.credits.dto.user.UserOutputV2;
import com.project.credits.dto.user.UserRequest;
import com.project.credits.entity.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper
public interface UserMapper {
    FriendSearchingOutput getFriendSearchingFrom(UserEntity userEntity);
    UserOutputV2 getOutputFromEntity(UserEntity userEntity);
    UserEntity getEntityFromRequest(UserRequest signUpRequest);
    void updateEntityFromInput(@MappingTarget UserEntity userEntity, ChangeInfoUserRequest changeInfoUserRequest);
}
