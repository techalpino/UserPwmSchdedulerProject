package com.techalpino.ldap.handler.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.techalpino.ldap.handler.LdapOperations;
import com.techalpino.model.types.UserADInfo;

public class LdapOperationsImpl implements LdapOperations{

	/* (non-Javadoc)
	 * @see com.techalpino.ldap.handler.LdapOperations#getPasswordExpiringUserList(java.lang.String, java.lang.String)
	 */
	
	@Autowired
	LdapConnectionImpl ldapConnection;
	
	@Override
	public List<UserADInfo> getPasswordExpiringUserList(String strDomainName,
			String strDay) {
		
		return null;
	}

	/* (non-Javadoc)
	 * @see com.techalpino.ldap.handler.LdapOperations#getAccountLockedUserList(java.lang.String, java.lang.String)
	 */
	@Override
	public List<UserADInfo> getAccountLockedUserList(String strDomainName,String strDay) {
		
		return null;
	}

	/* (non-Javadoc)
	 * @see com.techalpino.ldap.handler.LdapOperations#getADUserInformation(java.lang.String, java.lang.String)
	 */
	@Override
	public List<UserADInfo> getADUserInformation(String strDomainName,
			String strOuName) {
		// TODO Auto-generated method stub
		return null;
	}
	
/*	if(lockoutTime == 0){
        return false;
    }
    
     //otherwise, determine if account is still locked out
    try {
        //Call to set get the lockoutDuration attribute from the domainDNS
        setLockoutDuration();
    } catch (LDAPException ex) {
        ex.printStackTrace();
        return true; 
    }
    

    GregorianCalendar win32epoch = new GregorianCalendar(1601,Calendar.JANUARY,01);
    Date Win32EpochDate = win32epoch.getTime();
    GregorianCalendar Today = new GregorianCalendar();
    Date TodaysDate = Today.getTime();
    long TimeSinceWin32Epoch = 10000 * (TodaysDate.getTime() - Win32EpochDate.getTime());

    if(lockoutTime >= (TimeSinceWin32Epoch + lockoutDuration)){ 
        return true;
    }*/
	
}
