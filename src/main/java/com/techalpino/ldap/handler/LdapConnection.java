package com.techalpino.ldap.handler;

import javax.naming.ldap.LdapContext;

public interface LdapConnection {
	public void chkDomainConnectivity(String strDomain, String strDomainController, String strUsername, String strUserPassword);
	public LdapContext getLdapContext(String strDomain, String strDomainController, String strUsername, String strUserPassword, boolean chkLdaps);
}
