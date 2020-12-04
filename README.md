# spring-cloud-zookeeper-demo

## Usage

Start `zookeeper` and `zookeeper_seeder` using the supplied `docker-compose.yml`

```shell
docker-compose up
```

This will start a local zookeeper omn its default port `2181`.

When zookeeper is running and the required nodes/values where seeded, the application can be started.

## Notes

There is one `@Disabled` test `ApplicationTest`.
