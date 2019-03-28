# spring_mvc
Demo simple spring MVC

# Step 1 : Tools & environment
- Eclipse : https://www.eclipse.org/downloads/
- Jdk 8 : https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html

# Step 2 : Init project
- Eclipse -> File -> New -> Other -> Maven -> Maven project -> maven-archetype-webapp
- Create "src/main/java" folder if not exist
- Properties -> Project facet -> Java version

# Step 3 : Configuration JSP
- pom.xml : javax.servlet, spring core, spring web
- web.xml : Servlet API 3
- ApplicationContextConfig.java : use @Configuration, @ComponentScan, looking for other SpringBean
- AdapterConfig.java : use @Configuration, @EnableWebMvc handle static resource
- SpringWebAppInitializer: implements WebApplicationInitializer, config servlet, servlet listener, filter,...

# Step 4 : Request mapping
src/main/java/controllers/HomeController.java : use annotation
- class : @Controller
- function : @RequestMapping(value = {"/home"}, method = RequestMethod.GET)
- return home.jsp

# Step 5 : Build/Run
- Build : Run as -> Maven install
- Run : Run configuration -> Maven Build -> Base directory : ${workspace_loc:/artifactId} -> Goals : tomcat7:run
