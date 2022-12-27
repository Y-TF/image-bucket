DROP TABLE IF EXISTS image_file;
DROP TABLE IF EXISTS directory;

CREATE TABLE directory
(
    id                  BIGINT        NOT NULL AUTO_INCREMENT,
    directory_name      VARCHAR(1000) NOT NULL,
    parent_directory_id BIGINT,
    created_at          TIMESTAMP     NOT NULL,
    modified_at         TIMESTAMP     NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE image_file
(
    id           BIGINT        NOT NULL AUTO_INCREMENT,
    image_name   VARCHAR(1000) NOT NULL,
    directory_id BIGINT        NOT NULL,
    created_at   TIMESTAMP     NOT NULL,
    modified_at  TIMESTAMP     NOT NULL,
    PRIMARY KEY (id)
);
