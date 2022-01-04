## 实现元数据持久化的核心配置
```yaml
spring:
  cloud:
    nacos:
      discovery:
        ephemeral: false
```

## 多实例*Environment variables*设置
实例1
PERSISTENCE_SERVER_PORT=7890;PERSISTENCE_DUBBO_PORT=26767

实例2
PERSISTENCE_SERVER_PORT=7891;PERSISTENCE_DUBBO_PORT=26734

## 持久化实例元数据
nacos-server-1.3.2\nacos\data\naming\data