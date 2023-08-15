package application.service;

import application.dao.UserDAO;
import application.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserDetailsService implements UserDetailsService {

  @Autowired
  private UserDAO userDAO;

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    User user = userDAO.getUserByEmail(username);
    if (user == null) {
      throw new UsernameNotFoundException("User not found");
    }
    return user;
  }

}