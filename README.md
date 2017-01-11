# SpringCloudConsulDiscoveryClientA

Тестовое приложение, использующее в качестве Service Discovery сервер [Consul](https://www.consul.io).
После запуска регистрирует себя в Service Discovery для последующего вызова клиентом [spring-cloud-consul-discovery-client-b](https://github.com/risbarov/spring-cloud-consul-discovery-client-b).

# Consul Service Discovery

Для запуска сервера Consul Service Discovery необходимо выполнить:

`./consul agent -server -bootstrap -ui -data-dir=/tmp/consul`
