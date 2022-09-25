Scala-playground
------------

The playground for Scala language.

Within the Scala ecosystem, the Akka-HTTP library is a popular choice for implementing server-side backends for HTTP APIs. Another popular option is the Play framework, but using a full-blown web framework to just provide a thin API is an overkill in most cases.

Referential transparency goal:
- Only dependent on their input
- Have no side effects


Requires
---------------
* Please download latest version of SBT. As of last publication of Skeleton:
* [sbt 1.3.8](http://www.scala-sbt.org)

Use
---------------

    $ sbt
    > test

Test
------------------
The best feature of SBT is incremental compilation. This is most evident when testing.

	> ~ test

Be warned, it's addictive. You'll never want to code in any other statically compiled language without this feature.

Test a single TestSuite

	> test-only package.subpackage.Class

Useful commands
-----------------
Run a scala REPL with all the project dependencies available. 

	> console

Run will auto scan and run a Main class.

	> run
Automatic code formatting with:	

	> scalafmtAll

SBT Launch useful configuration options****
---------------------------------------
Some of these configuration options are quite important to know when setting up a project behind a company proxy.
Configure then in your ~/.sbt/conf/sbtconfig.txt or sbtopts

	# Reserver a decent amount of memory for the SBT JVM  
 
	-Xms256M
	-Xmx2048M
	-XX:ReservedCodeCacheSize=128m
 
	# Set additional SBT options and HTTP Proxies if needed
 
	# -Dsbt.ivy.home=<m2 repo>
	-Dsbt.log.format=true
 
	# -Dhttp.proxyHost=<your_proxy_host>
	# -Dhttp.proxyPort=<your_proxy_port>
	# -Dhttp.nonProxyHosts="<dont_use_proxy_for_these_addresses>"

