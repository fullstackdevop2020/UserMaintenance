package au.com.user.maintenance.service;

import au.com.user.maintenance.domain.UserEntity;

public interface UserService {

    UserEntity createUser(UserEntity user);

    UserEntity getUserById(Long id);

    UserEntity getUserByName(String name);

    UserEntity updateUser(UserEntity user);

    void deleteUser(Long id);


}
