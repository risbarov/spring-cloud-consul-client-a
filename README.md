# SpringCloudConsulClientA

Тестовое приложение, использующее в качестве **Config Server** и **Service Discovery** сервер [Consul](https://www.consul.io).
После запуска регистрирует себя в Service Discovery для последующего вызова клиентом [spring-cloud-consul-client-b](https://github.com/risbarov/spring-cloud-consul-client-b).

# Consul Server

Для запуска сервера Consul необходимо выполнить:

`./consul agent -server -bootstrap -ui -data-dir=/tmp/consul`
