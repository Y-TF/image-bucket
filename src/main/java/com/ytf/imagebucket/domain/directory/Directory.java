package com.ytf.imagebucket.domain.directory;

import java.util.Set;

import com.ytf.imagebucket.domain.AuditingFields;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "directory")
@Entity
public class Directory extends AuditingFields {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "parent_directory_id", updatable = false)
	private Long parentDirectoryId;

	@OneToMany(mappedBy = "parentDirectoryId")
	private Set<Directory> childDirectories;

	@Column(name = "name", length = 1000, nullable = false)
	private String name;

	public static Directory of(String name, Long parentDirectoryId) {
		Directory directory = new Directory();
		directory.name = name;
		directory.parentDirectoryId = parentDirectoryId;
		return directory;
	}
}
