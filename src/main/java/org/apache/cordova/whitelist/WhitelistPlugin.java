package org.apache.cordova.whitelist;

import org.apache.cordova.CordovaPlugin;

public class WhitelistPlugin extends CordovaPlugin {
	@Override
	public java.lang.Boolean shouldAllowNavigation(java.lang.String url) {
		return true;
	}
	
	@Override
	public java.lang.Boolean shouldAllowBridgeAccess(java.lang.String url) {
		return true;
	}
	
	@Override
	public java.lang.Boolean shouldAllowRequest(java.lang.String url) {
		return true;
	}
	
	@Override
	public java.lang.Boolean shouldOpenExternalUrl(java.lang.String url) {
		return true;
	}
}
