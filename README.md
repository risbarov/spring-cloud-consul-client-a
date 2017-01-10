# SpringCloudConsulDiscoveryClientA

Тестовое приложение, использующее в качестве Service Discovery сервер [Consul](https://www.consul.io).
После запуска регистрирует себя в Service Discovery для последующего вызова другими клиентами.

# Consul Service Discovery

Для запуска сервера Consul Service Discovery необходимо выполнить:

`./consul agent -server -bootstrap -data-dir=/tmp/consul`
