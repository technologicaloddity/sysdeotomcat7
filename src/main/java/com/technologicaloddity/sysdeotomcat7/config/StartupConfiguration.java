package com.technologicaloddity.sysdeotomcat7.config;

/**
 * This interface exists to prevent classes in the Startup configuration from being processed twice (if they are annotated)
 * thus simplifying the package selection for component scans.
 * 
 * @author Bob Robinson, technologicaloddity.com
 *
 */
public interface StartupConfiguration {

}
