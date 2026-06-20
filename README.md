### Installation

1. Download Wildfly server
2. Add server to path or remember the dir it exists in
3. All Apps will use this server as central hub

### Add admin user

1. $WILDFLY_DIR/standalone/bin/add_user.sh
2. add new user

### Start server

1. $WILDFLY_DIR/standalone/bin/standalone.h
2. start server so that defaults are configured
3. Login with the created user to make sure it works

### Download the connectors jars for DB connection

1. download the jars from anywhere
2. Open Admin Console
3. Add jar in deployments tab
4. Configuration > Subsystems > Datasource & Drivers > Datasources
5. Give it a attribute name (i.e myshit,  java:/PostgresDS)
6. Add Credentials
7. Test Connection

### Connecting to DB using driver

1. follow this https://www.wildfly.org/guides/database-integrating-with-postgresql/
2. In wildfly maven plugin addon : (can replace postgres with mysql if needed)
3. In pom.xml can also change wildfly version to the one you need
4. In Persistance.xml add extra tag `<jta-data-source>java:/MySqlDS</jta-data-source>`


### New Jakarta EE 11 features : Using Repo pattern
1. Add jakarta data api
```xml
<dependency>
    <groupId>jakarta.data</groupId>
    <artifactId>jakarta.data-api</artifactId>
    <version>1.0.1</version>
    <scope>provided</scope>
</dependency>
```
2. Add Hibernate core
```xml
<dependency>
    <groupId>org.hibernate.orm</groupId>
    <artifactId>hibernate-processor</artifactId>
    <version>7.4.1.Final</version>
    <scope>provided</scope>
</dependency>
```
3. Now can use `@Repository` wuth `CrudRepository`

### Change ROOT-CONTEXT
- in pom.xml if `<finalName>ROOT</finalName>` then will deploy to `/` Root Context
- change to `<finalName>app1<finalName>` will deploy to `/app1` Root Context

### Deploying DevCode to Domain Server on Local Machine
- still not sure how to do it through CLI
- in intellij : 
  - `war exploded` is hot swappable like each restart will deploy new one and delete after intellij is stopped
  - `war` will stay there even when intellij is stopped so can be used to deploy app basically
