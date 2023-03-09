# Proyecto Web service SOAP

## El proyecto consta de un simple Web service SOAP, cumpliendo con un ABM a una base de datos (MySql).
## Se utilizó:

- Servlets soportado por Jboss
- Apache CXF soportado por Jboss
- Hibernate (HQL)
- Spring framework
- Desplegado en Jboss 7.2
- Testeado con SoapUI 5.7

En la interfaz Webservice se le agrego: 

@PostConstruct
	public void init() {
		SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
	}

1- Esto permitio inyectar el Bean de la capa de negocios, ya que los servlets no pueden hacerlo.

2- Se utilizaron las librerias CXF de Jboss, ya que si se queria utilizar las propias del proyecto, chocaban y daba error.

3- El proyecto esta preparado para ser consumido por cualquier frontend, JSP, React, Angular, etc.
