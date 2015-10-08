/**
 * 
 */
package com.techalpino.model.types;

import java.util.List;

/**
 * @author DELL
 *
 */
public class DomainInfo {
	
	private String strDomainName;
	private List<String> strDomainController;
	private String strDomainAdminUsername;
	private String strDomainAdminPassword;
	private Boolean chkDomainStatus;
	
	public String getStrDomainName() {
		return strDomainName;
	}
	public void setStrDomainName(String strDomainName) {
		this.strDomainName = strDomainName;
	}
	public List<String> getStrDomainController() {
		return strDomainController;
	}
	public void setStrDomainController(List<String> strDomainController) {
		this.strDomainController = strDomainController;
	}
	public String getStrDomainAdminUsername() {
		return strDomainAdminUsername;
	}
	public void setStrDomainAdminUsername(String strDomainAdminUsername) {
		this.strDomainAdminUsername = strDomainAdminUsername;
	}
	public String getStrDomainAdminPassword() {
		return strDomainAdminPassword;
	}
	public void setStrDomainAdminPassword(String strDomainAdminPassword) {
		this.strDomainAdminPassword = strDomainAdminPassword;
	}
	public Boolean getChkDomainStatus() {
		return chkDomainStatus;
	}
	public void setChkDomainStatus(Boolean chkDomainStatus) {
		this.chkDomainStatus = chkDomainStatus;
	}
	
	
}
