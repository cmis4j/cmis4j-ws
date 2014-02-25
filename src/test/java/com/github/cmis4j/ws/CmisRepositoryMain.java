/*
 The MIT License (MIT)
 
 Copyright (c) 2013, 2014 by ggbusto@gmx.com

 Permission is hereby granted, free of charge, to any person obtaining a copy
 of this software and associated documentation files (the "Software"), to deal
 in the Software without restriction, including without limitation the rights
 to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 copies of the Software, and to permit persons to whom the Software is
 furnished to do so, subject to the following conditions:

 The above copyright notice and this permission notice shall be included in all
 copies or substantial portions of the Software.

 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 SOFTWARE.
 */

package com.github.cmis4j.ws;

import org.oasis_open.docs.ns.cmis.ws._200908.ACLServicePort;
import org.oasis_open.docs.ns.cmis.ws._200908.DiscoveryServicePort;
import org.oasis_open.docs.ns.cmis.ws._200908.MultiFilingServicePort;
import org.oasis_open.docs.ns.cmis.ws._200908.NavigationServicePort;
import org.oasis_open.docs.ns.cmis.ws._200908.ObjectServicePort;
import org.oasis_open.docs.ns.cmis.ws._200908.PolicyServicePort;
import org.oasis_open.docs.ns.cmis.ws._200908.RelationshipServicePort;
import org.oasis_open.docs.ns.cmis.ws._200908.RepositoryServicePort;
import org.oasis_open.docs.ns.cmis.ws._200908.VersioningServicePort;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CmisRepositoryMain {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		try {
			ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("cmis4j-ws-test.xml");
			ACLServicePort aclService = (ACLServicePort) ctx.getBean("aclService");
			DiscoveryServicePort discoveryService = (DiscoveryServicePort) ctx.getBean("discoveryService");
			MultiFilingServicePort multiFilingService = (MultiFilingServicePort) ctx.getBean("multiFilingService");
			NavigationServicePort navigationService = (NavigationServicePort) ctx.getBean("navigationService");
			ObjectServicePort objectService = (ObjectServicePort) ctx.getBean("objectService");
			PolicyServicePort policyService = (PolicyServicePort) ctx.getBean("policyService");
			RelationshipServicePort relationshipService = (RelationshipServicePort) ctx.getBean("relationshipService");
			RepositoryServicePort repositoryService = (RepositoryServicePort) ctx.getBean("repositoryService");
			VersioningServicePort versioningService = (VersioningServicePort) ctx.getBean("versioningService");
			ctx.close();
		} catch (Throwable t) {
			t.printStackTrace();
		}
	}
}
