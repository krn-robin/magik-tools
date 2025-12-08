module nl.ramsolutions.sw.magik.squid {
  requires sslr.core;
  requires com.github.spotbugs.annotations;
  requires org.slf4j;
  requires com.google.gson;

  opens nl.ramsolutions.sw.magik to
      com.google.gson;
  opens nl.ramsolutions.sw.magik.analysis.definitions to
      com.google.gson;
  opens nl.ramsolutions.sw.moduledef to
      com.google.gson;
  opens nl.ramsolutions.sw.productdef to
      com.google.gson;
}
