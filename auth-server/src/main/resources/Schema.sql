CREATE TABLE `oauth_client_details` (
	`client_id` VARCHAR(255) NOT NULL,
	`resource_ids` VARCHAR(255) NULL DEFAULT NULL,
	`client_secret` VARCHAR(255) NULL DEFAULT NULL,
	`scope` VARCHAR(255) NULL DEFAULT NULL,
	`authorized_grant_types` VARCHAR(255) NULL DEFAULT NULL,
	`web_server_redirect_uri` VARCHAR(255) NULL DEFAULT NULL,
	`authorities` VARCHAR(255) NULL DEFAULT NULL,
	`access_token_validity` INT(11) NULL DEFAULT NULL,
	`refresh_token_validity` INT(11) NULL DEFAULT NULL,
	`additional_information` VARCHAR(4096) NULL DEFAULT NULL,
	`autoapprove` VARCHAR(255) NULL DEFAULT NULL,
	PRIMARY KEY (`client_id`)
)
