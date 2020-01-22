# Requirements
## Java - 1.8.x

## Maven - 3.x.x

## Mysql - 5.x.x

## Redis

#RDB tools
## Monitoring redis data
```
https://redislabs.com/get-started-with-redis/
```

#Summary
##Firstly we are creating mock data after get the all data and append the redis, Secondly getting data on redis


# Steps to Setup
## 1. Clone the application
```
 git clone https://github.com/dogukanyilmaz95/Spring-boot-Mysql-Redis
```

## 2. Create Mysql database
```
docker pull mysql
docker pull redis
```

### create database redisTest
## 3. Change mysql username and password as per your installation

### open src/main/resources/application.properties

### change spring.datasource.username and spring.datasource.password as per your mysql installation

## 4. Build and run the app using maven
```
mvn spring-boot:run
```


#Configuration
### Creating Config file 
####your/path/redis-spring-boot/src/main/java/com/dogukanyilmaz/redisspringboot/config

####this config file handle the redis is failed or something is wrong


### Adding on RedisSpringBootApplication
```
@EnableCaching
```

### After calling redis annotation
```
    @CachePut(cacheNames = "mocks", key = "#root.target.MY_KEY")
    @CacheEvict(cacheNames = "mocks", allEntries = true)
    List<Mock> saveAll(List<Mock> mocks);

    @Cacheable(cacheNames = "mocks", key = "#root.target.MY_KEY")
    List<Mock> findAll();
```


# TEST
First adding mock data
```
curl --location --request POST 'http://localhost:8080/api/mock/createAll' \
--header 'Content-Type: application/json' \
--data-raw '[{	
	
	"mockData":"test"
},{	

	"mockData":"test"
},{	
	
	"mockData":"test"
},{	
	
	"mockData":"test"
},{	

	"mockData":"test"
},{	
	
	"mockData":"test"
},{	
	
	"mockData":"test"
}
]'
```

Getting Datas

```
curl --location --request GET 'http://localhost:8080/api/mock'
```
