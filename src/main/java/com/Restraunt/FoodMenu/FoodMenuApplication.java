package com.Restraunt.FoodMenu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class FoodMenuApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodMenuApplication.class, args);

	}


}
// At first added basic spring security -> Create a package name config add SecurityFilterChain class and add details of endpoints and disable csrf to make delete and post request work and added exception

// In second stage added users to mysql created a model class named AppUser in which added basic details of the user (added same in mysql and store password in {bcrypt} form not simple plain text and don't forget to add {bcrypt} prefix now as we have created our own table and we will not use SpringSec default tables which are Users and Authorities create a class under a new package name security where you have to override loadUserByUserName

// We are not setting up our own Authentication and Authorization

// When a user logs into a website, a session is created on the server. The session ID is stored in a cookie in the browser and automatically sent with every request. This allows the user to remain authenticated across requests. However, this also makes the application vulnerable to CSRF attacks, where a malicious site can cause the user’s browser to send unauthorized requests using the valid session cookie. To prevent this, we use CSRF tokens — unique, secret values included in requests and validated by the server — to ensure the request is coming from the intended client.

//When a user logs into a website, the server creates a unique session ID to identify the user and stores it in a cookie on the user's browser. This session ID is automatically sent by the browser with every request to that site, allowing the server to recognize the user without asking for credentials again. However, this automatic behavior makes it vulnerable to CSRF (Cross-Site Request Forgery) attacks — if a malicious website tricks the user’s browser into making a request to the legitimate site (e.g., by submitting a hidden form), the browser will include the session cookie, and the server may process the request as if it was made by the user. To prevent this, servers use a CSRF token, which is a random value generated per session or request and shared with the frontend (usually embedded in HTML or sent via a separate API). Unlike cookies, the CSRF token is not stored or sent automatically by the browser — it must be explicitly included in every state-changing request (like POST, PUT, DELETE). Since attackers can't access the token (due to the same-origin policy) or guess it, they can’t forge valid requests, even if the session cookie is present. Thus, CSRF tokens act as a second layer of protection by ensuring that the request was intentionally initiated by the user from the legitimate site.


// Tokens

