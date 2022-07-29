package everyday.day28.chat;

import java.io.Serial;
import java.io.Serializable;

/**
 * @Description
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/28 17:29
 * @Version 1.0
 */
public class Message implements Serializable {


	@Serial
	private static final long serialVersionUID = -6596524037452500603L;

	private Integer type;
	private String content;
	// 用于登录
	private String username;
	private String password;

	private String friendUsername;


	public Message(String username, String password, Integer type) {
		this.type = type;
		this.password = password;
		this.username = username;
	}

	public Message(Integer type, String content, String username) {
		this.type = type;
		this.content = content;
		this.username = username;
	}

	public Message(Integer type, String content, String username, String password, String friendUsername) {
		this.type = type;
		this.content = content;
		this.username = username;
		this.password = password;
		this.friendUsername = friendUsername;
	}

	public Message(Integer type, String content, String username, String friendUsername) {
		this.type = type;
		this.content = content;
		this.username = username;
		this.friendUsername = friendUsername;
	}

	public Message() {
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFriendUsername() {
		return friendUsername;
	}

	public void setFriendUsername(String friendUsername) {
		this.friendUsername = friendUsername;
	}

	@Override
	public String toString() {
		return "Message{" +
				"type=" + type +
				", content='" + content + '\'' +
				", username='" + username + '\'' +
				", password='" + password + '\'' +
				", friendUsername='" + friendUsername + '\'' +
				'}';
	}
}
