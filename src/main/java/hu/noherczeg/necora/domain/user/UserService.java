package hu.noherczeg.necora.domain.user;

import java.util.List;

public interface UserService {
    public List<User> listUsers();
    public void addUser(User user);
    public void deleteUser(User user);
    public User findById(Long id);
}
