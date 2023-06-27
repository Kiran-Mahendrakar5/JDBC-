package com.xworkz.facebook.dto;



import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class facebookDto {
	
	
	private Integer id;
//	@NotBlank
//	@NotEmpty
//	private Date date;
	@NotBlank
	@NotNull
	@Size(min=4,max=15)
	private String profile;
	@NotBlank
	@NotNull
	private String closeFriend;
//	@NotBlank
//	@NotEmpty
	private Integer post;
//	@NotBlank
//	@NotEmpty
	private Integer mutualFriends;
//	@NotBlank
//	@NotEmpty
	private Integer logInPassward;
//	@NotBlank
//	@NotEmpty
	private Integer sharedPost;
	
	
	
	public facebookDto() {
		super();
		
	}


	public facebookDto(int id,String profile, String closeFriend, int post, int mutualFriends,
			int logInPassward, int sharedPost) {
		super();
		this.id = id;
		this.profile = profile;
		this.closeFriend = closeFriend;
		this.post = post;
		this.mutualFriends = mutualFriends;
		this.logInPassward = logInPassward;
		this.sharedPost = sharedPost;
		
	}


	@Override
	public String toString() {
		return "facebookDto [id=" + id + ", date=" +  ", profile=" + profile + ", closeFriend=" + closeFriend
				+ ", post=" + post + ", mutualFriends=" + mutualFriends + ", logInPassward=" + logInPassward
				+ ", sharedPost=" + sharedPost + ", totalfriends=" +  "]";
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}



	public String getProfile() {
		return profile;
	}


	public void setProfile(String profile) {
		this.profile = profile;
	}


	public String getCloseFriend() {
		return closeFriend;
	}


	public void setCloseFriend(String closeFriend) {
		this.closeFriend = closeFriend;
	}


	public int getPost() {
		return post;
	}


	public void setPost(int post) {
		this.post = post;
	}


	public int getMutualFriends() {
		return mutualFriends;
	}


	public void setMutualFriends(int mutualFriends) {
		this.mutualFriends = mutualFriends;
	}


	public int getLogInPassward() {
		return logInPassward;
	}


	public void setLogInPassward(int logInPassward) {
		this.logInPassward = logInPassward;
	}


	public int getSharedPost() {
		return sharedPost;
	}


	public void setSharedPost(int sharedPost) {
		this.sharedPost = sharedPost;
	}


	
	
	
	

}
