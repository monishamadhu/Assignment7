//package com.meritamerica.assignment7.security.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.BadCredentialsException;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseStatus;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.meritamerica.assignment7.security.AuthenticationRequest;
//import com.meritamerica.assignment7.security.AuthenticationResponse;
//import com.meritamerica.assignment7.security.models.User;
//import com.meritamerica.assignment7.security.services.UserService;
//import com.meritamerica.assignment7.security.services.UserServiceImpl;
//import com.meritamerica.assignment7.security.util.JwtUtil;
//
//@RestController
//public class UserController {
//
//	@Autowired
//	private AuthenticationManager authenticationManager;
//
//	@Autowired
//	private JwtUtil jwtTokenUtil;
//
//	@Autowired
//	private UserDetailsService userDetailsService;
//	
//	@Autowired
//	private UserService userService;
//
//
//}
