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

import java.math.BigInteger;
import java.util.List;

import javax.xml.ws.Holder;

import org.oasis_open.docs.ns.cmis.core._200908.CmisAccessControlListType;
import org.oasis_open.docs.ns.cmis.core._200908.CmisAllowableActionsType;
import org.oasis_open.docs.ns.cmis.core._200908.CmisBulkUpdateType;
import org.oasis_open.docs.ns.cmis.core._200908.CmisObjectIdAndChangeTokenType;
import org.oasis_open.docs.ns.cmis.core._200908.CmisObjectType;
import org.oasis_open.docs.ns.cmis.core._200908.CmisPropertiesType;
import org.oasis_open.docs.ns.cmis.core._200908.CmisRenditionType;
import org.oasis_open.docs.ns.cmis.core._200908.CmisRepositoryInfoType;
import org.oasis_open.docs.ns.cmis.core._200908.CmisTypeDefinitionType;
import org.oasis_open.docs.ns.cmis.core._200908.EnumACLPropagation;
import org.oasis_open.docs.ns.cmis.core._200908.EnumIncludeRelationships;
import org.oasis_open.docs.ns.cmis.core._200908.EnumRelationshipDirection;
import org.oasis_open.docs.ns.cmis.core._200908.EnumUnfileObject;
import org.oasis_open.docs.ns.cmis.core._200908.EnumVersioningState;
import org.oasis_open.docs.ns.cmis.messaging._200908.CmisACLType;
import org.oasis_open.docs.ns.cmis.messaging._200908.CmisContentStreamType;
import org.oasis_open.docs.ns.cmis.messaging._200908.CmisExtensionType;
import org.oasis_open.docs.ns.cmis.messaging._200908.CmisObjectInFolderContainerType;
import org.oasis_open.docs.ns.cmis.messaging._200908.CmisObjectInFolderListType;
import org.oasis_open.docs.ns.cmis.messaging._200908.CmisObjectListType;
import org.oasis_open.docs.ns.cmis.messaging._200908.CmisObjectParentsType;
import org.oasis_open.docs.ns.cmis.messaging._200908.CmisRepositoryEntryType;
import org.oasis_open.docs.ns.cmis.messaging._200908.CmisTypeContainer;
import org.oasis_open.docs.ns.cmis.messaging._200908.CmisTypeDefinitionListType;
import org.oasis_open.docs.ns.cmis.messaging._200908.DeleteTreeResponse.FailedToDelete;
import org.oasis_open.docs.ns.cmis.messaging._200908.Query;
import org.oasis_open.docs.ns.cmis.messaging._200908.QueryResponse;
import org.oasis_open.docs.ns.cmis.ws._200908.CmisException;

import com.github.cmis4j.core.CmisServiceBase;

public class CmisService extends CmisServiceBase {

	@Override
	public CmisACLType applyACL(String repositoryId, String objectId,
			CmisAccessControlListType addACEs,
			CmisAccessControlListType removeACEs,
			EnumACLPropagation aclPropagation, CmisExtensionType extension)
			throws CmisException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CmisACLType getACL(String repositoryId, String objectId,
			Boolean onlyBasicPermissions, CmisExtensionType extension)
			throws CmisException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QueryResponse query(Query parameters) throws CmisException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void getContentChanges(String repositoryId,
			Holder<String> changeLogToken, Boolean includeProperties,
			String filter, Boolean includePolicyIds, Boolean includeACL,
			BigInteger maxItems, CmisExtensionType extension,
			Holder<CmisObjectListType> objects) throws CmisException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeObjectFromFolder(String repositoryId, String objectId,
			String folderId, Holder<CmisExtensionType> extension)
			throws CmisException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addObjectToFolder(String repositoryId, String objectId,
			String folderId, Boolean allVersions,
			Holder<CmisExtensionType> extension) throws CmisException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CmisObjectListType getCheckedOutDocs(String repositoryId,
			String folderId, String filter, String orderBy,
			Boolean includeAllowableActions,
			EnumIncludeRelationships includeRelationships,
			String renditionFilter, BigInteger maxItems, BigInteger skipCount,
			CmisExtensionType extension) throws CmisException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CmisObjectParentsType> getObjectParents(String repositoryId,
			String objectId, String filter, Boolean includeAllowableActions,
			EnumIncludeRelationships includeRelationships,
			String renditionFilter, Boolean includeRelativePathSegment,
			CmisExtensionType extension) throws CmisException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CmisObjectInFolderContainerType> getDescendants(
			String repositoryId, String folderId, BigInteger depth,
			String filter, Boolean includeAllowableActions,
			EnumIncludeRelationships includeRelationships,
			String renditionFilter, Boolean includePathSegment,
			CmisExtensionType extension) throws CmisException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CmisObjectInFolderListType getChildren(String repositoryId,
			String folderId, String filter, String orderBy,
			Boolean includeAllowableActions,
			EnumIncludeRelationships includeRelationships,
			String renditionFilter, Boolean includePathSegment,
			BigInteger maxItems, BigInteger skipCount,
			CmisExtensionType extension) throws CmisException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CmisObjectInFolderContainerType> getFolderTree(
			String repositoryId, String folderId, BigInteger depth,
			String filter, Boolean includeAllowableActions,
			EnumIncludeRelationships includeRelationships,
			String renditionFilter, Boolean includePathSegment,
			CmisExtensionType extension) throws CmisException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CmisObjectType getFolderParent(String repositoryId, String folderId,
			String filter, CmisExtensionType extension) throws CmisException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CmisPropertiesType getProperties(String repositoryId,
			String objectId, String filter, CmisExtensionType extension)
			throws CmisException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteObject(String repositoryId, String objectId,
			Boolean allVersions, Holder<CmisExtensionType> extension)
			throws CmisException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CmisObjectType getObject(String repositoryId, String objectId,
			String filter, Boolean includeAllowableActions,
			EnumIncludeRelationships includeRelationships,
			String renditionFilter, Boolean includePolicyIds,
			Boolean includeACL, CmisExtensionType extension)
			throws CmisException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createDocumentFromSource(String repositoryId, String sourceId,
			CmisPropertiesType properties, String folderId,
			EnumVersioningState versioningState, List<String> policies,
			CmisAccessControlListType addACEs,
			CmisAccessControlListType removeACEs,
			Holder<CmisExtensionType> extension, Holder<String> objectId)
			throws CmisException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CmisAllowableActionsType getAllowableActions(String repositoryId,
			String objectId, CmisExtensionType extension) throws CmisException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createRelationship(String repositoryId,
			CmisPropertiesType properties, List<String> policies,
			CmisAccessControlListType addACEs,
			CmisAccessControlListType removeACEs,
			Holder<CmisExtensionType> extension, Holder<String> objectId)
			throws CmisException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteContentStream(String repositoryId,
			Holder<String> objectId, Holder<String> changeToken,
			Holder<CmisExtensionType> extension) throws CmisException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bulkUpdateProperties(String repositoryId,
			CmisBulkUpdateType bulkUpdateData,
			Holder<CmisExtensionType> extension,
			Holder<CmisObjectIdAndChangeTokenType> objectIdAndChangeToken)
			throws CmisException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CmisContentStreamType getContentStream(String repositoryId,
			String objectId, String streamId, BigInteger offset,
			BigInteger length, CmisExtensionType extension)
			throws CmisException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FailedToDelete deleteTree(String repositoryId, String folderId,
			Boolean allVersions, EnumUnfileObject unfileObjects,
			Boolean continueOnFailure, CmisExtensionType extension)
			throws CmisException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CmisObjectType getObjectByPath(String repositoryId, String path,
			String filter, Boolean includeAllowableActions,
			EnumIncludeRelationships includeRelationships,
			String renditionFilter, Boolean includePolicyIds,
			Boolean includeACL, CmisExtensionType extension)
			throws CmisException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateProperties(String repositoryId, Holder<String> objectId,
			Holder<String> changeToken, CmisPropertiesType properties,
			Holder<CmisExtensionType> extension) throws CmisException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createItem(String repositoryId, CmisPropertiesType properties,
			String folderId, CmisAccessControlListType addACEs,
			CmisAccessControlListType removeACEs,
			Holder<CmisExtensionType> extension, Holder<String> objectId)
			throws CmisException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createDocument(String repositoryId,
			CmisPropertiesType properties, String folderId,
			CmisContentStreamType contentStream,
			EnumVersioningState versioningState, List<String> policies,
			CmisAccessControlListType addACEs,
			CmisAccessControlListType removeACEs,
			Holder<CmisExtensionType> extension, Holder<String> objectId)
			throws CmisException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createPolicy(String repositoryId,
			CmisPropertiesType properties, String folderId,
			List<String> policies, CmisAccessControlListType addACEs,
			CmisAccessControlListType removeACEs,
			Holder<CmisExtensionType> extension, Holder<String> objectId)
			throws CmisException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void appendContentStream(String repositoryId,
			Holder<String> objectId, Boolean isLastChunk,
			Holder<String> changeToken, CmisContentStreamType contentStream,
			Holder<CmisExtensionType> extension) throws CmisException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<CmisRenditionType> getRenditions(String repositoryId,
			String objectId, String renditionFilter, BigInteger maxItems,
			BigInteger skipCount, CmisExtensionType extension)
			throws CmisException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setContentStream(String repositoryId, Holder<String> objectId,
			Boolean overwriteFlag, Holder<String> changeToken,
			CmisContentStreamType contentStream,
			Holder<CmisExtensionType> extension) throws CmisException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveObject(String repositoryId, Holder<String> objectId,
			String targetFolderId, String sourceFolderId,
			Holder<CmisExtensionType> extension) throws CmisException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createFolder(String repositoryId,
			CmisPropertiesType properties, String folderId,
			List<String> policies, CmisAccessControlListType addACEs,
			CmisAccessControlListType removeACEs,
			Holder<CmisExtensionType> extension, Holder<String> objectId)
			throws CmisException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removePolicy(String repositoryId, String policyId,
			String objectId, Holder<CmisExtensionType> extension)
			throws CmisException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void applyPolicy(String repositoryId, String policyId,
			String objectId, Holder<CmisExtensionType> extension)
			throws CmisException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<CmisObjectType> getAppliedPolicies(String repositoryId,
			String objectId, String filter, CmisExtensionType extension)
			throws CmisException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CmisObjectListType getObjectRelationships(String repositoryId,
			String objectId, Boolean includeSubRelationshipTypes,
			EnumRelationshipDirection relationshipDirection, String typeId,
			String filter, Boolean includeAllowableActions,
			BigInteger maxItems, BigInteger skipCount,
			CmisExtensionType extension) throws CmisException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CmisTypeDefinitionListType getTypeChildren(String repositoryId,
			String typeId, Boolean includePropertyDefinitions,
			BigInteger maxItems, BigInteger skipCount,
			CmisExtensionType extension) throws CmisException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CmisTypeDefinitionType getTypeDefinition(String repositoryId,
			String typeId, CmisExtensionType extension) throws CmisException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateType(String repositoryId,
			Holder<CmisTypeDefinitionType> type, CmisExtensionType extension)
			throws CmisException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CmisRepositoryInfoType getRepositoryInfo(String repositoryId,
			CmisExtensionType extension) throws CmisException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteType(String repositoryId, String typeId,
			Holder<CmisExtensionType> extension) throws CmisException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<CmisTypeContainer> getTypeDescendants(String repositoryId,
			String typeId, BigInteger depth,
			Boolean includePropertyDefinitions, CmisExtensionType extension)
			throws CmisException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createType(String repositoryId,
			Holder<CmisTypeDefinitionType> type, CmisExtensionType extension)
			throws CmisException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<CmisRepositoryEntryType> getRepositories(
			CmisExtensionType extension) throws CmisException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CmisObjectType> getAllVersions(String repositoryId,
			String objectId, String filter, Boolean includeAllowableActions,
			CmisExtensionType extension) throws CmisException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void checkOut(String repositoryId, Holder<String> objectId,
			Holder<CmisExtensionType> extension, Holder<Boolean> contentCopied)
			throws CmisException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CmisObjectType getObjectOfLatestVersion(String repositoryId,
			String objectId, Boolean major, String filter,
			Boolean includeAllowableActions,
			EnumIncludeRelationships includeRelationships,
			String renditionFilter, Boolean includePolicyIds,
			Boolean includeACL, CmisExtensionType extension)
			throws CmisException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CmisPropertiesType getPropertiesOfLatestVersion(String repositoryId,
			String objectId, Boolean major, String filter,
			CmisExtensionType extension) throws CmisException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void cancelCheckOut(String repositoryId, String objectId,
			Holder<CmisExtensionType> extension) throws CmisException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkIn(String repositoryId, Holder<String> objectId,
			Boolean major, CmisPropertiesType properties,
			CmisContentStreamType contentStream, String checkinComment,
			List<String> policies, CmisAccessControlListType addACEs,
			CmisAccessControlListType removeACEs,
			Holder<CmisExtensionType> extension) throws CmisException {
		// TODO Auto-generated method stub
		
	}

}
