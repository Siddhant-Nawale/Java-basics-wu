package com.wu.ecommerce.dto;

import com.wu.ecommerce.exception.UserIdInvalidException;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
public class User {

	
	private String userId;
	@Setter
	private String firstName;
	@Setter
	private String lastName;
	@Setter
	private String address;
	@Setter
	private int contactNumber;
	
	
	public User(String userId, String firstName, String lastName, String address, int contactNumber) throws UserIdInvalidException {
		super();
		this.setUserId(userId);
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.contactNumber = contactNumber;
	}
	
	public void setUserId(String userId) throws UserIdInvalidException {
		if(userId==null || userId.length() <3 ) {
			throw new UserIdInvalidException("Invalid user id");
		}
		this.userId = userId;
	}
	
	

}
