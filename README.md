# JavaEE Study
Learning path for Java EE

### Get JFS working
This was done by

* added javaee-api dependency. This dependency will be provided by application server so the scope is "provided"
* added Faces Servlet to web.xml
* added taglib to use such as html, core

### Get Resource Bundle working
This is done by

* added faces-config.xml into WEB-INF folder
* specify "resource-bundle" config
* get message and use it in view

### Get simple JSF + Managed Bean work to together
This is done by

* make sure FacesServlet is defined in web.xml (just for now as petclinic does not require this so there should be other solutions)
* configuring url-pattern for FacesServlet and make sure it is not "/*". Should be something like "/faces/*"
* creating a Managed Bean by annotating as @ManagedBean (javax.faces.bean.ManagedBean)
* optionally making it as a Session Scoped by annotating as @SessionScoped to handle post data from user from (reservation form) and render in another page (confirmation page)
* using EL to access bean properties from the pages

### Get it work with no web.xml
This is done by

* removing web.xml (of course :-) )
* adding Maven plugin "maven-war-plugin" and tell it to not require for web.xml

How to test?

* instead of accessing .../faces/reservation/reservation.xhtml, using .../reservation/reservation.jsf