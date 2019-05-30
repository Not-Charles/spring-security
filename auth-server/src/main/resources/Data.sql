
INSERT INTO `oauth_client_details` (`client_id`, `resource_ids`, `client_secret`, `scope`, `authorized_grant_types`, `web_server_redirect_uri`, `authorities`, `access_token_validity`, `refresh_token_validity`, `additional_information`, `autoapprove`) VALUES
	('test-client', 'resource-server-rest-api', '$2a$08$95ohFKBiohySHWv.2dGY6.UaPbMLPfHjKrFMDlcb/Zm5lokS6hP3m', 'read', 'password,authorization_code,refresh_token,client_credentials,implicit', 'null', 'USER', 10800, 2592000, NULL, NULL);
