package com.example.service;

import org.springframework.security.core.authority.AuthorityUtils;
import com.example.domain.User;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class LoginUserDetails extends org.springframework.security.core.userdetails.User {
    private final User user;

    public LoginUserDetails(User user) {
        super(user.getUsername(), user.getEncodedPassword(),
                AuthorityUtils.createAuthorityList("ROLE_USER"));
        this.user = user;
    }
}
