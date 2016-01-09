### How to run

At the console, execute

    mvn package
    cd target
    java -jar web-app.jar world

In the browser, open [http://localhost:8080/](http://localhost:8080/)


### What to learn

- install [Java JDK](http://www.oracle.com/technetwork/java/javase/downloads/index.html) (Java Development Kit)
- install [maven](https://maven.apache.org/)
- learn how to create a [minimal pom](https://maven.apache.org/guides/introduction/introduction-to-the-pom.html)
- learn how to set the [source and target](https://maven.apache.org/plugins/maven-compiler-plugin/examples/set-compiler-source-and-target.html) of the java compiler
- learn the maven [standard directory layout](https://maven.apache.org/guides/introduction/introduction-to-the-standard-directory-layout.html)
- learn how to [configure jetty in maven](http://www.eclipse.org/jetty/documentation/current/maven-and-jetty.html)
- learn how to [run jetty in embedded mode](http://www.eclipse.org/jetty/documentation/current/advanced-embedding.html)
- learn how to create an executable jar with the [maven assembly plugin](http://maven.apache.org/plugins/maven-assembly-plugin/)
