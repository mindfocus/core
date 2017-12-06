package com.dotcms.publisher.pusher.wrapper;

import com.dotcms.publishing.PublisherConfig.Operation;

import com.dotmarketing.beans.Identifier;
import com.dotmarketing.portlets.folders.model.Folder;

import java.io.Serializable;

public class FolderWrapper implements Serializable{

    private static final long serialVersionUID = 1L;
    private Folder folder;
	private Identifier folderId;
	private Identifier hostId;
	private Operation operation;
	public FolderWrapper() {}

	public FolderWrapper(Folder folder, Identifier folderId, Identifier hostId, Operation operation) {
		this.folder = folder;
		this.folderId = folderId;
		this.hostId = hostId;
		this.operation = operation;
	}
	
	public Folder getFolder() {
		return folder;
	}
	public void setFolder(Folder folder) {
		this.folder = folder;
	}
	

	public Identifier getFolderId() {
		return folderId;
	}

	public void setFolderId(Identifier folderId) {
		this.folderId = folderId;
	}

	public Identifier getHostId() {
		return hostId;
	}

	public void setHostId(Identifier hostId) {
		this.hostId = hostId;
	}
	
	public Operation getOperation() {
		return operation;
	}
	public void setOperation(Operation operation) {
		this.operation = operation;
	}
}
