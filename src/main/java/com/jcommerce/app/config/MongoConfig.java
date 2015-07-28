package com.jcommerce.app.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import com.jcommerce.app.utils.AppConstants;
import com.mongodb.Mongo;

@Configuration
@EnableMongoRepositories
public class MongoConfig extends AbstractMongoConfiguration 
{

	@Override
	protected String getDatabaseName() 
	{
		return AppConstants.DatabaseConstants.DATABASE_NAME;
	}

	@Override
	public Mongo mongo() throws Exception 
	{
		
		return null;
	}
	
	@Override
    protected String getMappingBasePackage() 
	{
        return AppConstants.ApplicationConstants.APPLICATION_BASE_PACKAGE;
    }

}
