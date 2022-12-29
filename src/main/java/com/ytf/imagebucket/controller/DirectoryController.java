package com.ytf.imagebucket.controller;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ytf.imagebucket.domain.directory.DirectoryService;
import com.ytf.imagebucket.dto.directory.DirectoryCreationRequest;

import jakarta.annotation.Nullable;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/directory")
@RequiredArgsConstructor
public class DirectoryController {
	private final DirectoryService directoryService;
	@PutMapping
	public void createDirectoryWithParentId(DirectoryCreationRequest request) {
		directoryService.createDirectory(request);
	}
}
