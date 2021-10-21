package codedsales.services;

import codedsales.models.User;
import codedsales.repositories.UserRepository;
import java.util.ArrayList;
import java.util.List;

/**
 * User Service:
 * Handles all operations performed on the user.
 * @author Christian
 * @see UserRepository
 * @see User
 */
public class UserService {
    
    private UserRepository userRepo = new UserRepository();

    public List<User> getAllUsers() {
        return new ArrayList<>(userRepo.getAllUsers().values());
    }

    public User getAUser(long userId) {
        return userRepo.getAUser(userId);
    }

    public User createUser(User user) {
        //Password Hashing
        return userRepo.createUser(user);
    }

    public User updateUser(User user) {
        return userRepo.updateUser(user);
    }

    public void deleteUser(long userId) {
        userRepo.deleteUser(userId);
    }

    public String loginUser(String username, String password) {
        User user = userRepo.getUser(username);
        // decrypt user.getPassword  and store it as userPassword
        // compare userPassword to password
        return "true if Password matches and false if password doesn't match";
    }

    public User getUser(String username) {
        return userRepo.getUser(username);
    }
    
    
    
    
}
