package com.kbace.changemanagement.dao;

import java.util.List;

import com.kbace.changemanagement.entity.Content;

public interface ContentDAO {
	public void saveModule(Content module);

	public List<Content> getContentList();

	public void deleteTitleById(String titleId);

	public void updateContent(String titleID, String contentType, String app);

	public List<Content> getAssignedContent(long userID);

	public boolean checkAssignemnt(String contentID, Long userID);

	public void updatePath(String path, String contentID);
}