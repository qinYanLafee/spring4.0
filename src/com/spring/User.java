package com.spring;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class User {
	private int id; 
	private String name;
	private String password;
	private int age;
	private String email;
	private boolean gender;
	private Address address;
	private List<Account> accounts;
	
	
	
	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	public User(int id, String name, String password, int age, String email,
			boolean gender, Address address, List<Account> accounts) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.email = email;
		this.gender = gender;
		this.address = address;
		this.accounts = accounts;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public User(int id, String name, String password, int age, String email,
			boolean gender, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.email = email;
		this.gender = gender;
		this.address = address;
	}

	public User() {
		super();
	}

	public User(int id, String name, String password, int age) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}

	

		public User(int id, String name, String password, int age, String email,
			boolean gender) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.email = email;
		this.gender = gender;
	}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result
					+ ((accounts == null) ? 0 : accounts.hashCode());
			result = prime * result
					+ ((address == null) ? 0 : address.hashCode());
			result = prime * result + age;
			result = prime * result + ((email == null) ? 0 : email.hashCode());
			result = prime * result + (gender ? 1231 : 1237);
			result = prime * result + id;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result
					+ ((password == null) ? 0 : password.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			User other = (User) obj;
			if (accounts == null) {
				if (other.accounts != null)
					return false;
			} else if (!accounts.equals(other.accounts))
				return false;
			if (address == null) {
				if (other.address != null)
					return false;
			} else if (!address.equals(other.address))
				return false;
			if (age != other.age)
				return false;
			if (email == null) {
				if (other.email != null)
					return false;
			} else if (!email.equals(other.email))
				return false;
			if (gender != other.gender)
				return false;
			if (id != other.id)
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			if (password == null) {
				if (other.password != null)
					return false;
			} else if (!password.equals(other.password))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "User [id=" + id + ", name=" + name + ", password="
					+ password + ", age=" + age + ", email=" + email
					+ ", gender=" + gender + ", address=" + address
					+ ", accounts=" + accounts + "]";
		}
	
	

		
}
