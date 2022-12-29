package com.ytf.imagebucket.dto.directory;

import lombok.Getter;

@Getter
public class DirectoryCreationRequest {
	String name;
	Long parentDirectoryId;
}
