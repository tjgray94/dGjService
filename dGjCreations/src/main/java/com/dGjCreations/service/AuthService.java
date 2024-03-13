package com.dGjCreations.service;

import com.dGjCreations.dto.SignupRequest;
import com.dGjCreations.model.User;

public interface AuthService {
    User createUser(SignupRequest signupRequest);
}
