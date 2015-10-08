package com.techalpino.ldap.handler;

import java.util.List;

import com.techalpino.model.types.UserADInfo;


public interface LdapOperations {
	public List<UserADInfo> getPasswordExpiringUserList(String strDomainName, String strDay);
	public List<UserADInfo> getAccountLockedUserList(String strDomainName, String strDay);
	public List<UserADInfo> getADUserInformation(String strDomainName, String strOuName);
}
