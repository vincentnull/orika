[![Build Status](https://secure.travis-ci.org/orika-mapper/orika.png)](http://travis-ci.org/orika-mapper/orika)
[![Join the chat at https://gitter.im/orika-mapper](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/orika-mapper/Lobby?utm_source=share-link&utm_medium=link&utm_campaign=share-link)
[![GitHub site](https://img.shields.io/badge/GitHub-site-blue.svg)](http://orika-mapper.github.io/orika-docs/)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/ma.glasnost.orika/orika-core/badge.svg)](https://maven-badges.herokuapp.com/maven-central/ma.glasnost.orika/orika-core)
[![Javadocs](http://www.javadoc.io/badge/ma.glasnost.orika/orika-core.svg)](http://www.javadoc.io/doc/ma.glasnost.orika/orika-core)
[![License: Apache 2.0](https://img.shields.io/badge/license-Apache_2.0-brightgreen.svg)](https://github.com/orika-mapper/orika/blob/master/LICENSE)

Orika !
-----------------------------------------------------------------------

**NEW** We are pleased to announce the release of Orika **1.6.0** ! _This version is available on Maven central repository_

## 背景
There are compatibility issues with version 1.5.4 when running in environments using JDK 17 or higher. The original author has already fixed this issue in the latest master branch, but has not released a new version for a long time. Therefore, I forked the project and created version 1.6.0 based on Orika’s master branch. This version is fully compatible with JDK 17 and has been published to the Maven Central Repository, so everyone can use it directly.

1.5.4版本在JDK17以上的环境中存在兼容性问题，原作者在最新的master中已经修改该问题，但是作者迟迟没有发布新版本，因此，本人fork了一个这个项目，使用orika的master分支创建了一个1.6.0的版本，该版本已经兼容JDK17，并且已经发布到Maven中央仓库，大家可以直接引用。
```xml
<dependency>
    <groupId>io.github.vincentnull</groupId>
    <artifactId>orika-core</artifactId>
    <version>1.6.0</version>
</dependency>

```
If you want to use `orika-util` directly, you can import it directly.

如果你想直接使用util，可以直接引入 orika-util
```xml
<dependency>
    <groupId>io.github.vincentnull</groupId>
    <artifactId>orika-util</artifactId>
    <version>1.6.0</version>
</dependency>
```

What?
=====

Orika is a Java Bean mapping framework that recursively copies (among other capabilities) data from one object to another. It can be very useful when developing multi-layered applications.

Why?
=====
Struggling with hand coded and reflection-based mappers? Orika can be used to simplify the process of mapping between one object layer and another.

Our ambition is to build a comprehensive, efficient and robust Java bean mapping solution. Orika focuses on automating as much as possible, while providing customization  through configuration and extension where needed.

Orika enables the developer to :
 * Map complex and deeply structured objects
 * "Flatten" or "Expand" objects by mapping nested properties to top-level properties, and vice versa
 * Create mappers on-the-fly, and apply customizations to control some or all of the mapping
 * Create converters for complete control over the mapping of a specific set of objects anywhere in the object graph--by type, or even by specific property name
 * Handle proxies or enhanced objects (like those of Hibernate, or the various mock frameworks)
 * Apply bi-directional mapping with one configuration
 * Map to instances of an appropriate concrete class for a target abstract class or interface
 * Map POJO properties to Lists, Arrays, and Maps
 
How?
=====

Orika uses byte code generation to create fast mappers with minimal overhead. 

Want to give Orika a try? Check out our new [User Guide](http://orika-mapper.github.io/orika-docs/) 

Acknowledgements
=================
* YourKit supports Orika with its full-featured Java Profiler. Take a look at YourKit's leading software products: <a href="http://www.yourkit.com/java/profiler/index.jsp">YourKit Java Profiler</a>.
<img src="https://www.yourkit.com/images/yklogo.png" title="YourKit">

* <strong><a href="https://www.jetbrains.com/?from=Orika">JetBrains</a></strong> kindly provides Orika with a free open-source licence for their IntelliJ IDEA Ultimate edition. 
<img src="https://camo.githubusercontent.com/a93f3a50613d2f7f26ca3cc70505e16921d6001b/687474703a2f2f7777772e6a6574627261696e732e636f6d2f696d672f6c6f676f732f6c6f676f5f696e74656c6c696a5f696465612e706e67">


