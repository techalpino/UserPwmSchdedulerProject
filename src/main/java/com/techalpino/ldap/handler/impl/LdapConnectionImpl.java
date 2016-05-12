package com.techalpino.ldap.handler.impl;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.NamingException;
import javax.naming.ldap.InitialLdapContext;
import javax.naming.ldap.LdapContext;

import org.springframework.stereotype.Component;

import com.techalpino.ldap.handler.LdapConnection;

@Component
public class LdapConnectionImpl implements LdapConnection {

	/* (non-Javadoc)
	 * @see com.techalpino.ldap.handler.LdapConnection#chkDomainConnectivity(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public void chkDomainConnectivity(String strDomain,
			String strDomainController, String strUsername,
			String strUserPassword) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.techalpino.ldap.handler.LdapConnection#getLdapContext(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean)
	 */
	@Override
	public LdapContext getLdapContext(String strDomain,
			String strDomainController, String strUsername,
			String strUserPassword, boolean chkLdaps) {
		
		Hashtable<String, String> env = new Hashtable<String, String>();
		env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
		env.put(Context.SECURITY_AUTHENTICATION, "simple");
		env.put(Context.PROVIDER_URL, "ldap://"+strDomainController+":389");
		 
		// The value of Context.SECURITY_PRINCIPAL must be the logon username with the domain name
		env.put(Context.SECURITY_PRINCIPAL, strUsername+"@"+strDomain);
		 
		// The value of the Context.SECURITY_CREDENTIALS should be the user's password
		env.put(Context.SECURITY_CREDENTIALS, strUserPassword);
		env.put(Context.REFERRAL, "follow");
		LdapContext ctx = null;
		
		try {
			ctx = new InitialLdapContext(env,null);
		} catch (NamingException e) {
			throw new RuntimeException(e);
		} 
		
		return ctx;
		
	}

}
