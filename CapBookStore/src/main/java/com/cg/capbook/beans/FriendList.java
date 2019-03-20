package com.cg.capbook.beans;

public class FriendList {
private int listId;
private String senderEmail, fullName, receiverEmail;
public FriendList() {}
public FriendList(int listId, String senderEmail, String fullName, String receiverEmail) {
	super();
	this.listId = listId;
	this.senderEmail = senderEmail;
	this.fullName = fullName;
	this.receiverEmail = receiverEmail;
}
public FriendList(String senderEmail, String fullName, String receiverEmail) {
	super();
	this.senderEmail = senderEmail;
	this.fullName = fullName;
	this.receiverEmail = receiverEmail;
}
public FriendList(String senderEmail, String receiverEmail) {
	super();
	this.senderEmail = senderEmail;
	this.receiverEmail = receiverEmail;
}
public int getListId() {
	return listId;
}
public void setListId(int listId) {
	this.listId = listId;
}
public String getSenderEmail() {
	return senderEmail;
}
public void setSenderEmail(String senderEmail) {
	this.senderEmail = senderEmail;
}
public String getFullName() {
	return fullName;
}
public void setFullName(String fullName) {
	this.fullName = fullName;
}
public String getReceiverEmail() {
	return receiverEmail;
}
public void setReceiverEmail(String receiverEmail) {
	this.receiverEmail = receiverEmail;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((fullName == null) ? 0 : fullName.hashCode());
	result = prime * result + listId;
	result = prime * result + ((receiverEmail == null) ? 0 : receiverEmail.hashCode());
	result = prime * result + ((senderEmail == null) ? 0 : senderEmail.hashCode());
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
	FriendList other = (FriendList) obj;
	if (fullName == null) {
		if (other.fullName != null)
			return false;
	} else if (!fullName.equals(other.fullName))
		return false;
	if (listId != other.listId)
		return false;
	if (receiverEmail == null) {
		if (other.receiverEmail != null)
			return false;
	} else if (!receiverEmail.equals(other.receiverEmail))
		return false;
	if (senderEmail == null) {
		if (other.senderEmail != null)
			return false;
	} else if (!senderEmail.equals(other.senderEmail))
		return false;
	return true;
}
@Override
public String toString() {
	return "FriendList [listId=" + listId + ", senderEmail=" + senderEmail + ", fullName=" + fullName
			+ ", receiverEmail=" + receiverEmail + "]";
}

}
