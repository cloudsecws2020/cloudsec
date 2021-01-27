# Cloud Security WS 2020/2021
Repository for Cloud Security
## Useful Resources
* DevSecOps Pipeline: https://notsosecure.com/achieving-devsecops-with-open-source-tools/
* General DevOps Pipeline How-To: https://opensource.com/article/19/4/devops-pipeline
* ...
## Used Tools
* **IDE**: Eclipse https://www.eclipse.org/downloads/
* **Git-Repo**: https://github.com/fgreif/cloudsec/
* **CI/CD**: Jenkins: https://www.jenkins.io/ 
* **Webserver**: Apache Tomcat: http://tomcat.apache.org/
* **QA/Staging, Production**: Docker: https://www.docker.com/
* ...
## Repository Management:
* **Nexus**:  
https://de.sonatype.com/nexus/repository-oss/download  
https://de.sonatype.com/nexus-repository-oss-vs.-pro-features  
https://de.sonatype.com/nexus/vulnerability-scanner  <-- Nexus Vulnerability Scanner
* **Jfrog**:  
https://jfrog.com/artifactory/start-free/#saas
https://jfrog.com/xray/ <-- JFrog Xray (vulnerability scanning)
* **ProGet**:  
https://inedo.com/proget/features  
https://docs.inedo.com/docs/proget/administration/license?_ga=2.28212731.693624230.1611689529-1318482348.1611689529

* **Comparison**:  
https://www.eficode.com/blog/artifactory-nexus-proget  
https://www.praqma.com/stories/artifactory-nexus-proget/

## DevOps --> DevSecOps - useful tools
* **Git Hooks**: https://githooks.com/

> *"Git hooks are scripts that Git executes before or after events such as: commit, push, and receive. Git hooks are a built-in feature - no need to download anything. Git hooks are run locally.  
These hook scripts are only limited by a developer's imagination. Some example hook scripts include:  
pre-commit: Check the commit message for spelling errors.  
pre-receive: Enforce project coding standards.  
post-commit: Email/SMS team members of a new commit.  
post-receive: Push the code to production."*  

* **Secrets Management (pre-commit): Talisman**: https://github.com/thoughtworks/talisman
> *Talisman is a tool that installs a hook to your repository to ensure that potential secrets or sensitive information do not leave the developer's workstation.  
It validates the outgoing changeset for things that look suspicious - such as potential SSH keys, authorization tokens, private keys etc.*

* **Secrets Management: Hashicorp Vault**: https://www.vaultproject.io/
> *Secure, store and tightly control access to tokens, passwords, certificates, encryption keys for protecting secrets and other sensitive data using a UI, CLI, or HTTP API.*

* **Software Composition Analysis - OWASP Dependency-Check**: https://owasp.org/www-project-dependency-check/
> *Dependency-Check is a Software Composition Analysis (SCA) tool that attempts to detect publicly disclosed vulnerabilities contained within a project’s dependencies. It does this by determining if there is a Common Platform Enumeration (CPE) identifier for a given dependency. If found, it will generate a report linking to the associated CVE entries.*

* **Software Composition Analysis - Sonatype OSS Index**: https://ossindex.sonatype.org/
> *OSS Index is a free catalogue of open source components and scanning tools to help developers identify vulnerabilities, understand risk, and keep their software safe.*

* **Static Code Analysis - Sonarqube**: https://www.sonarqube.org/downloads/
> *SonarQube® is an automatic code review tool to detect bugs, vulnerabilities, and code smells in your code. It can integrate with your existing workflow to enable continuous code inspection across your project branches and pull requests.*

* **Dynamic Analysis Security Testing - arachni:** https://www.arachni-scanner.com/
> *Arachni is a feature-full, modular, high-performance Ruby framework aimed towards helping penetration testers and administrators evaluate the security of modern web applications.*

* **Security in Infrastructure as Code - Clair**: https://github.com/quay/clair
> *Clair is an open source project for the static analysis of vulnerabilities in application containers (currently including OCI and docker).
Clients use the Clair API to index their container images and can then match it against known vulnerabilities.*

* **Compliance as Code - Chef Inspec**: https://community.chef.io/tools/chef-inspec/
> *Turn your compliance, security, and other policy requirements into automated tests.*

* **Vulnerability Management - ArcherySec**: https://github.com/archerysec/archerysec
> *Archery is an opensource vulnerability assessment and management tool which helps developers and pentesters to perform scans and manage vulnerabilities. Archery uses popular opensource tools to perform comprehensive scanning for web application and network. It also performs web application dynamic authenticated scanning and covers the whole applications by using selenium. *

## Possibly Dropped Categories:
* **Dynamic Analysis Security Testing - OWASP ZAP:** https://www.zaproxy.org/

* **Alerting and Monitoring - ModeSecurity**: https://modsecurity.org/
> *ModSecurity is a toolkit for real-time web application monitoring, logging, and access control.*

* **Vulnerability Assessment (VA)**: https://notsosecure.com/achieving-devsecops-with-open-source-tools/
> *It is a general practice to perform vulnerability assessment on the production systems to identify various services running in the environment and the associated vulnerabilities.
While pointing a VA tool on the servers that have been created using Docker, it would execute the scan only on the service that is being exposed on that host. However, if we attach the tool to the docker network and then execute the scan, then it would give us a good picture of services which are actually running.
This can be done using various solutions like OpenVAS which can easily integrate into the pipeline.  
OpenVAS:  
http://openvas.org/  
https://github.com/greenbone/openvas  
DockScan: https://github.com/kost/dockscan*  

