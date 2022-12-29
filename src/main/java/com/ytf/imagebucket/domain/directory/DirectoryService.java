package com.ytf.imagebucket.domain.directory;

import org.springframework.stereotype.Service;

import com.ytf.imagebucket.domain.directory.DirectoryRepository;
import com.ytf.imagebucket.dto.directory.DirectoryCreationRequest;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DirectoryService {
	private final DirectoryRepository directoryRepository;

	public void createDirectory(DirectoryCreationRequest request) {
		Directory directory = Directory.of(request.getName(), request.getParentDirectoryId());
		directoryRepository.save(directory);
	}
}
