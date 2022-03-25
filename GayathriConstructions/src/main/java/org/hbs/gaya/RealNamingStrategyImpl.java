package org.hbs.gaya;

import java.io.Serializable;

import org.hibernate.boot.model.naming.Identifier;
import org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl;
import org.hibernate.engine.jdbc.env.spi.JdbcEnvironment;

public class RealNamingStrategyImpl extends org.springframework.boot.orm.jpa.hibernate.SpringPhysicalNamingStrategy implements Serializable
{

	private static final long								serialVersionUID	= -4943643424802487936L;
	public static final PhysicalNamingStrategyStandardImpl	INSTANCE			= new PhysicalNamingStrategyStandardImpl();

	@Override
	public Identifier toPhysicalTableName(Identifier name, JdbcEnvironment context)
	{
		return new Identifier(name.getText(), name.isQuoted());
	}

	@Override
	public Identifier toPhysicalColumnName(Identifier name, JdbcEnvironment context)
	{
		return new Identifier(name.getText(), name.isQuoted());
	}

}