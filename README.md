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