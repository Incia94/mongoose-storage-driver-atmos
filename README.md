[![Gitter chat](https://badges.gitter.im/emc-mongoose.png)](https://gitter.im/emc-mongoose)
[![Issue Tracker](https://img.shields.io/badge/Issue-Tracker-red.svg)](https://mongoose-issues.atlassian.net/projects/GOOSE)
[![CI status](https://gitlab.com/emc-mongoose/mongoose-storage-driver-atmos/badges/master/pipeline.svg)](https://gitlab.com/emc-mongoose/mongoose-storage-driver-atmos/commits/master)
[![Tag](https://img.shields.io/github/tag/emc-mongoose/mongoose-storage-driver-atmos.svg)](https://github.com/emc-mongoose/mongoose-storage-driver-atmos/tags)
[![Maven metadata URL](https://img.shields.io/maven-metadata/v/http/central.maven.org/maven2/com/github/emc-mongoose/mongoose-storage-driver-atmos/maven-metadata.xml.svg)](http://central.maven.org/maven2/com/github/emc-mongoose/mongoose-storage-driver-atmos)
[![Sonatype Nexus (Releases)](https://img.shields.io/nexus/r/http/oss.sonatype.org/com.github.emc-mongoose/mongoose-storage-driver-atmos.svg)](http://oss.sonatype.org/com.github.emc-mongoose/mongoose-storage-driver-atmos)
[![Docker Pulls](https://img.shields.io/docker/pulls/emcmongoose/mongoose-storage-driver-atmos.svg)](https://hub.docker.com/r/emcmongoose/mongoose-storage-driver-atmos/)

# Atmos Storage Driver

## 1. Features

* API version: ?
* Authentification:
    * Requests are signed with a secret key if configured
    * Using subtenant
* Filesystem access
* SSL/TLS
* Item types:
    * `data` (--> "object")
    * `token` (-> "subtenant")
* Automatic subtenant creation on demand
* Data item operation types:
    * `create`
    * `read`
        * full
        * random byte ranges
        * fixed byte ranges
        * content verification
    * `update`
        * full (overwrite)
        * random byte ranges
        * fixed byte ranges (with append mode)
    * `delete`
    * `noop`
* Token item operation types:
    * `create`
    * `read`
    * `delete`
    * `noop`

## 2. Usage

```bash
java -jar mongoose-<VERSION>.jar \
    --storage-driver-type=atmos \
    ...
```

### 2.1. Configuration Reference

| Name                                           | Type         | Default Value    | Description                                      |
|:-----------------------------------------------|:-------------|:-----------------|:-------------------------------------------------|
| storage-net-http-fsAccess                      | Flag | false | Specifies whether filesystem access is enabled or not

### 2.2. Notes

* To specify a subtenant use the `storage-auth-token` configuration option
