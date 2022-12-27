package com.ytf.imagebucket.domain.imagefile;

import com.ytf.imagebucket.domain.AuditingFields;
import com.ytf.imagebucket.domain.directory.Directory;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "image_file")
@Entity
public class ImageFile extends AuditingFields {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "directory_id")
	private Directory directoryId;

	@Column(name = "image_name", length = 1000, nullable = false)
	private String imageName;
}
