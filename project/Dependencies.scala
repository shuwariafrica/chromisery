import sbt.*
import sbt.Keys.*

object Dependencies {
  val absoluteLayout =
    "org.netbeans.external" % "AbsoluteLayout" % "RELEASE240" // Replacement for AbsoluteLayout-RELEASE802.jar. NOTE: Replaced with RELEASE240
  val activation =
    "javax.activation" % "activation" % "1.1.1" // Replacement for activation-1.0.2.jar. NOTE: Replaced with 1.1.1
  val aopalliance = "aopalliance" % "aopalliance" % "1.0" // Replacement for aopalliance-1.0.jar
  val ant = "org.apache.ant" % "ant" % "1.7.1" // Replacement for ant-1.7.1.jar
  val axis = "org.apache.axis" % "axis" % "1.4" // Replacement for axis-1.4.jar
  val axisJaxrpc = "axis" % "axis-jaxrpc" % "1.4" // Replacement for axis-jaxrpc-1.4.jar
  val axisWsdl4j = "wsdl4j" % "wsdl4j" % "1.5.1" // Replacement for axis-wsdl4j-1.5.1.jar
  val backportUtilConcurrent =
    "backport-util-concurrent" % "backport-util-concurrent" % "3.1" // Replacement for backport-util-concurrent-3.1.jar
  val barcode4j = "net.sf.barcode4j" % "barcode4j" % "2.1" // Replacement for barcode4j-2.1.jar
  val bcmail = "org.bouncycastle" % "bcmail-jdk14" % "1.38" // Replacement for bcmail-jdk14-138.jar
  val bcpg = "org.bouncycastle" % "bcpg-jdk15on" % "1.50" // Replacement for bcpg-jdk15on-1.50.jar
  val bcprov = "org.bouncycastle" % "bcprov-jdk15on" % "1.50" // Replacement for bcprov-jdk15on-1.50.jar
  val bctsp = "org.bouncycastle" % "bctsp-jdk14" % "1.38" // Replacement for bctsp-jdk14-1.38.jar
  val bluecove = "net.sf.bluecove" % "bluecove-gpl" % "2.1.0" // Replacement for bluecove-gpl-2.1.0.jar
  val bsh = "org.beanshell" % "bsh" % "2.0b5" // Replacement for bsh-2.0b5.jar
  val colorpicker = "org.drjekyll" % "colorpicker" % "2.0.1" // Replacement for colorpicker.jar
  val commonsCodec = "commons-codec" % "commons-codec" % "1.10" // Replacement for commons-codec-1.10.jar
  val commonsCollections =
    "commons-collections" % "commons-collections" % "3.2.1" // Replacement for commons-collections-3.2.1.jar
  val commonsDigester = "commons-digester" % "commons-digester" % "2.1" // Replacement for commons-digester-2.1.jar
  val commonsDiscovery = "commons-discovery" % "commons-discovery" % "0.5" // Replacement for commons-discovery-0.5.jar
  val commonsIo = "commons-io" % "commons-io" % "2.4" // Replacement for commons-io-2.4.jar
  val commonsLang = "commons-lang" % "commons-lang" % "2.6" // Replacement for commons-lang-2.6.jar
  val controlsfx = "org.controlsfx" % "controlsfx" % "8.40.12" // Replacement for controlsfx-8.40.12.jar
  val derby = "org.apache.derby" % "derby" % "10.14.1.0" // Replacement for derby-10.14.1.0.jar
  val ecj = "org.eclipse.jdt" % "ecj" % "3.40.0" // Replacement for ecj-4.4.2.jar
  val fop = "org.apache.xmlgraphics" % "fop" % "2.3" // Replacement for fop-2.3.jar
  val gson = "com.google.code.gson" % "gson" % "2.2.2" // Replacement for gson-2.2.2.jar
  val hamcrestCore = "org.hamcrest" % "hamcrest-core" % "1.3" // Replacement for hamcrest-core-1.3.jar
  val httpclient =
    "org.apache.httpcomponents" % "httpclient" % "4.0-alpha4" // Replacement for httpclient-4.0-alpha4.jar
  val httpcore = "org.apache.httpcomponents" % "httpcore" % "4.0-beta1" // Replacement for httpcore-4.0-beta1.jar
  val itext = "com.lowagie" % "itext" % "2.0.8" // Replacement for itext-2.1.7.jar
  val iTextAsian = "com.itextpdf" % "itext-asian" % "5.2.0" // Replacement for iTextAsian.jar
  val jasperReports = ("net.sf.jasperreports" % "jasperreports" % "6.2.1")
    .exclude("com.lowagie", "itext") // Replacement for jasperreports-6.2.1.jar
  val jasperreportsFonts =
    "net.sf.jasperreports" % "jasperreports-fonts" % "6.21.4" // Replacement for jasperreports-fonts-6.2.1.jar
  //  val jasperreportsFunctions =
  //    "net.sf.jasperreports" % "jasperreports-functions" % "6.8.0" // Replacement for jasperreports-functions-6.2.1.jar
  val jasypt = "org.jasypt" % "jasypt" % "1.9.1" // Replacement for jasypt-1.9.1.jar
  val javacsv = "net.sourceforge.javacsv" % "javacsv" % "2.0" // Replacement for javacsv-2.0.jar
  //  val javacsv = "net.sf.opencsv" % "opencsv" % "2.0" // Replacement for javacsv-2.0.jar
  val javatuples = "org.javatuples" % "javatuples" % "1.2" // Replacement for javatuples-1.2.jar
  val javaxInject = "javax.inject" % "javax.inject" % "1" // Replacement for javax.inject-1.jar
  val jcommon = "org.jfree" % "jcommon" % "1.0.23" // Replacement for jcommon-1.0.23.jar
  val jdbm = "jdbm" % "jdbm" % "1.0" // Replacement for jdbm-1.0.jar
  val jdom = "org.jdom" % "jdom" % "1.1.3" // Replacement for jdom-1.1.3.jar
  val je = "com.sleepycat" % "je" % "5.0.73" // Replacement for je-5.0.73.jar
  val jerseyBundle = "com.sun.jersey" % "jersey-bundle" % "1.19.4" // Replacement for jersey-bundle-1.9-ea04.jar
  val jerseyMultipart =
    "com.sun.jersey.contribs" % "jersey-multipart" % "1.19.4" // Replacement for jersey-multipart-1.15.jar
  val jfreechart = "org.jfree" % "jfreechart" % "1.0.19" // Replacement for jfreechart-1.0.19.jar
  val jline = "jline" % "jline" % "1.0" // Replacement for jline-1.0.jar
  val jodaTime = "joda-time" % "joda-time" % "2.8.2" // Replacement for joda-time-2.8.2.jar
  //  val jpos = "org.jpos" % "jpos" % "1.9.8" // Replacement for jpos-1.13.jar
  val js = "org.mozilla" % "rhino" % "1.7.13" // Replacement for js-1
  val jsonSimple = "com.googlecode.json-simple" % "json-simple" % "1.1.1" // Replacement for json-simple-1.1.1.jar
  val jsr311Api = "javax.ws.rs" % "jsr311-api" % "1.1.1" // Replacement for jsr311-api-1.1.1.jar
  val junit = "junit" % "junit" % "4.11" // Replacement for junit-4.11.jar
  val jxl = "net.sourceforge.jexcelapi" % "jxl" % "2.6.12" // Replacement for jxl-2.4.2.jar. NOTE: Replaced with 2.6.12
  val kxml2 = "net.sf.kxml" % "kxml2" % "2.3.0" // Replacement for kxml2-2.3.0.jar
  val lablibCheckboxtree = "eu.essilab" % "lablib-checkboxtree" % "4.0" // Replacement for lablib-checkboxtree-4.0.jar
  val lafPlugin = "com.github.insubstantial" % "laf-plugin" % "7.3" // Replacement for laf-plugin-7.2.1.jar
  val lafWidget = "com.github.insubstantial" % "laf-widget" % "7.3" // Replacement for laf-widget-7.2.1.jar
  val lite = "be.cyberelf.nanoxml" % "lite" % "2.2.3" // Replacement for lite-2.2.3.jar
  val liquibase = "org.liquibase" % "liquibase-core" % "4.15.0" // Replacement for liquibase.jar
  val log4j = "log4j" % "log4j" % "1.2.17" // Replacement for log4j-1.2.17.jar
  val logbackClassic = "ch.qos.logback" % "logback-classic" % "1.2.3" // Replacement for logback-classic-1.2.3.jar
  val logbackCore = "ch.qos.logback" % "logback-core" % "1.2.3" // Replacement for logback-core-1.2.3.jar
  val luceneAnalyzersCommon =
    "org.apache.lucene" % "lucene-analyzers-common" % "4.5.1" // Replacement for lucene-analyzers-common-4.5.1.jar
  val luceneCore = "org.apache.lucene" % "lucene-core" % "4.5.1" // Replacement for lucene-core-4.5.1.jar
  val luceneQueries = "org.apache.lucene" % "lucene-queries" % "4.5.1" // Replacement for lucene-queries-4.5.1.jar
  val luceneQueryparser =
    "org.apache.lucene" % "lucene-queryparser" % "4.5.1" // Replacement for lucene-queryparser-4.5.1.jar
  val luceneSandbox = "org.apache.lucene" % "lucene-sandbox" % "4.5.1" // Replacement for lucene-sandbox-4.5.1.jar
  val mail = "com.sun.mail" % "javax.mail" % "1.4.7" // Replacement for mail-1.4.7.jar
  val miglayout = "com.miglayout" % "miglayout-swing" % "11.4.2" // Replacement for miglayout-4.0.jar
  val mimepull = "org.jvnet.mimepull" % "mimepull" % "1.9.14" // Replacement for mimepull-1.6.jar
  val mysqlConnectorJava =
    "mysql" % "mysql-connector-java" % "5.1.49" // Replacement for mysql-connector-java-5.1.45.jar
  val nrjavaserial = "com.neuronrobotics" % "nrjavaserial" % "3.11.0" // Replacement for nrjavaserial-3.11.0.jar
  val olap4j = "org.olap4j" % "olap4j" % "1.2.0" // Replacement for olap4j-0.9.7.309-JS-3.jar
  val orgEclipseJdtCore =
    "org.eclipse.jdt" % "org.eclipse.jdt.core" % "3.10.0" // Replacement for org.eclipse.jdt.core-3.10.0.jar
  val orgOsgiCore = "org.osgi" % "org.osgi.core" % "4.3.1" // Replacement for org.osgi.core-4.3.1.jar
  val oro = "oro" % "oro" % "2.0.8" // Replacement for oro-2.0.8.jar
  val poi = "org.apache.poi" % "poi" % "3.12" // Replacement for poi-3.12.jar
  val postgresql = "org.postgresql" % "postgresql" % "9.4-1201-jdbc4" // Replacement for postgresql-9.4-1201-jdbc4.jar
  val rsyntaxtextarea = "com.fifesoft" % "rsyntaxtextarea" % "3.5.3" // Replacement for rsyntaxtextarea-2.6.0.jar
  val rxtx = "org.rxtx" % "rxtx" % "2.1.7" // Replacement for RXTXcomm.jar
  val saajApi = "javax.xml.soap" % "saaj-api" % "1.3.5" // Replacement for saaj-api-1.3.5.jar
  val slf4jApi = "org.slf4j" % "slf4j-api" % "1.7.25" // Replacement for slf4j-api-1.7.25.jar
  val slf4jLog4j12 = "org.slf4j" % "slf4j-log4j12" % "1.6.2" // Replacement for slf4j-log4j12-1.6.2.jar
  val staxApi = "javax.xml.stream" % "stax-api" % "1.0-2" // Replacement for stax-api-1.0-2.jar
  //  val substanceExtras = "org.pushingpixels" % "substance-extras" % "7.2.1" // Replacement for substance-extras.jar
  val substanceSwingx =
    "com.github.insubstantial" % "substance-swingx" % "7.3" // Replacement for substance-swingx-7.3.jar
  val swingLayout = "org.swinglabs" % "swing-layout" % "1.0.3" // Replacement for swing-layout-1.0.3.jar
  val swingxCore = "org.swinglabs.swingx" % "swingx-core" % "1.6.5-1" // Replacement for swingx-core-1.6.3.jar
  val trident = "com.github.insubstantial" % "trident" % "7.3" // Replacement for trident-1.2.jar
  //  val tridentSwing = "org.pushingpixels" % "trident" % "7.2.1" // Replacement for trident-7.2.1-swing.jar
  val velocity = "org.apache.velocity" % "velocity" % "1.7" // Replacement for velocity-1.7.jar
  val xercesImpl = "xerces" % "xercesImpl" % "2.10.0" // Replacement for xercesImpl-2.10.0.jar
  val xmlApis = "xml-apis" % "xml-apis" % "1.4.01" // Replacement for xml-apis-1.4.01.jar
  val xmlParserAPIs = "xml-apis" % "xmlParserAPIs" % "2.0.2" // Replacement for xmlParserAPIs-2.0.2.jar
  val zxing = "com.google.zxing" % "core" % "2.1" // Replacement for zxing-2.1.jar
  val zxingCore = "com.google.zxing" % "core" % "3.2.1" // Replacement for core-3.2.1.jar

  val posDependencies: List[ModuleID] = List(
    activation,
    aopalliance,
    axisJaxrpc,
    backportUtilConcurrent,
    bcmail,
    jdbm,
    lafPlugin,
    lite,
    ant,
    axis,
    axisWsdl4j,
    barcode4j,
    iTextAsian,
    js,
    liquibase,
    lafWidget,
    absoluteLayout,
    rxtx,
    bcpg,
    bcprov,
    bctsp,
    bluecove,
    bsh,
    colorpicker,
    commonsCodec,
    commonsCollections,
    commonsDigester,
    commonsDiscovery,
    commonsIo,
    commonsLang,
    controlsfx,
    zxingCore,
    derby,
    ecj,
    fop,
    gson,
    hamcrestCore,
    httpclient,
    httpcore,
    itext,
    jasperReports,
    jasperreportsFonts,
//    jasperreportsFunctions,
    jasypt,
    javacsv,
    javatuples,
    javaxInject,
    jcommon,
    jdom,
    je,
    jerseyBundle,
    jerseyMultipart,
    jfreechart,
    jline,
    jodaTime,
//    jpos,
    jsonSimple,
    jsr311Api,
    junit,
    jxl,
    kxml2,
    lablibCheckboxtree,
    log4j,
    logbackClassic,
    logbackCore,
    luceneAnalyzersCommon,
    luceneCore,
    luceneQueries,
    luceneQueryparser,
    luceneSandbox,
    mail,
    miglayout,
    mimepull,
    mysqlConnectorJava,
    nrjavaserial,
    olap4j,
    orgEclipseJdtCore,
    orgOsgiCore,
    oro,
    poi,
    postgresql,
    saajApi,
    slf4jApi,
    slf4jLog4j12,
    staxApi,
    substanceSwingx,
    swingLayout,
    swingxCore,
    trident,
    velocity,
    xercesImpl,
    xmlApis,
    xmlParserAPIs,
    zxing,
    rsyntaxtextarea
  )

  val posUnmanagedDependencies: List[File] = List(
    "lib/ChromisCtrls-v1.1.jar", // ChromisCtrls-v1.1.jar
    "lib/chromiscjtl.jar", // chromiscjtl.jar
    "lib/royalblueimages.jar", // royalblueimages.jar
    "lib/jpos-1.13.jar",
    "lib/jasperreports-functions-6.2.1.jar"
//    "lib/javafx-swt.jar", // javafx-swt.jar
//    "lib/javafx.base.jar", // javafx.base.jar
//    "lib/javafx.controls.jar", // javafx.controls.jar
//    "lib/javafx.fxml.jar", // javafx.fxml.jar
//    "lib/javafx.graphics.jar", // javafx.graphics.jar
//    "lib/javafx.media.jar", // javafx.media.jar
//    "lib/javafx.swing.jar", // javafx.swing.jar
//    "lib/javafx.web.jar" // javafx.web.jar
  ).map(file)
}
