package au.com.user.maintenance.service.impl;

import au.com.user.maintenance.domain.UserEntity;
import au.com.user.maintenance.domain.UserRepository;
import au.com.user.maintenance.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public UserEntity createUser(UserEntity user) {
        return repository.save(user);
    }

    @Override
    public UserEntity getUserById(Long id) {
        return repository.getOne(id);
    }

    @Override
    public UserEntity getUserByName(String name) {
        return repository.getByName(name);
    }

    @Override
    public UserEntity updateUser(UserEntity user) {
        return repository.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        repository.deleteById(id);
    }
}

